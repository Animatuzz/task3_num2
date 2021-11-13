package com.Animatuz;

public class HorizontalLine {

    public double y0;

    public HorizontalLine(double y0) {
        this.y0 = y0;
    }

    boolean isPointAboveLine(double y) {
        return y > y0;
    }
}

