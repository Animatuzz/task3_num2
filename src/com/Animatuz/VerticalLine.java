package com.Animatuz;

public class VerticalLine {

    public double x0;


    public VerticalLine(double x0) {

        this.x0 = x0;

    }

    public boolean isPointRight(double x) {
        return x > x0;
    }         //Формула для расчёта вертикальных линий
}
