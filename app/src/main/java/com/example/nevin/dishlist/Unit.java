package com.example.nevin.dishlist;

import android.widget.Switch;

enum Unit {
    GRAMS, KILOGRAMS, MILLILITERS, LITERS, PIECES, TABLESPOONS, TEASPOONS;

    public String toString() {
        switch (this){
            case GRAMS: return "g";
            case KILOGRAMS: return "kg";
            case MILLILITERS: return "ml";
            case LITERS: return "l";
            case PIECES: return "";
            case TABLESPOONS: return "Tbsp";
            case TEASPOONS: return "tsp";
            default: throw new IllegalArgumentException();
        }
    }
}
