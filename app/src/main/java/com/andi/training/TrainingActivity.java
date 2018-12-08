package com.andi.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TrainingActivity extends AppCompatActivity {

    TextView punkte;
    TextView txtUebung;
    Punktezaehler punktezaehler;
    Quests quests;
    int counter;
    ImageButton winButton;
    ImageButton failButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        punkte = findViewById(R.id.txtPunkte);
        txtUebung = findViewById(R.id.txtUebung);
        winButton = (ImageButton) findViewById(R.id.mButtonWin);
        failButton = (ImageButton) findViewById(R.id.mButtonfail);
        punktezaehler = new Punktezaehler();
        punktezaehler.setPunkte(0);

        quests = new Quests();
        txtUebung.setText(quests.getAufgabe());
    }

    public void logic(int i) {
        checkPoins();
        if (i==1){
            punktezaehler.win();
        } else {
            punktezaehler.fail();
        }
    }

    public void checkPoins() {
        if (punktezaehler.getPunkte() < 0) {
            punkte.setText("Du hast weniger als 0 Punkte");
            winButton.setClickable(false);
            failButton.setClickable(false);

        }   else
                punkte.setText("Punkte: " + punktezaehler.getPunkte());
    }

    public void buttonWinClicked(View view){
        logic(1);
    }

    public void buttonLostClicked(View view){
        logic(2);
    }
}
