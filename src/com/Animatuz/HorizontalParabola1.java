package com.Animatuz;

public class HorizontalParabola1 {

    public double x0, y0, a;

    public HorizontalParabola1(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointLeftOfParabola(double x, double y) { //Формула для расчёта горизонтальной параболы
        return x < (a * Math.pow(y - y0, 2) + x0);
    }

}
