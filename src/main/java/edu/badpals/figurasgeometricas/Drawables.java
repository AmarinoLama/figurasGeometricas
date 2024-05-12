package edu.badpals.figurasgeometricas;

import java.util.ArrayList;

public class Drawables {
    public void dibujarDrawables(ArrayList<Drawable> figuras){
        for (Drawable figura : figuras){
            figura.draw();
        }
    }
}
