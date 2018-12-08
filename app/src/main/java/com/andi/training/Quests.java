package com.andi.training;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Quests {

    String [] aufgabenArray = {"Drehe dich", "springe hoch", "tanze schnell", "your choice"};

    public String getAufgabe() {

        int zufall = (int) (Math.random()*aufgabenArray.length);
        return aufgabenArray[zufall];
    }

    public Quests() {
    }
}
