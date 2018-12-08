package com.andi.training;

public class Punktezaehler {

    int punkte;

    public Punktezaehler() {
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public void win(){
        int punkteFuerRichtigeLoesung = 10;
        this.punkte += punkteFuerRichtigeLoesung;
    }

    public void fail() {
        int punkteFuerFalscheLoesung = 10;
        this.punkte -= punkteFuerFalscheLoesung;
    }
}
