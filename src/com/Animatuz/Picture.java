package com.Animatuz;

public class Picture {

    public static final HorizontalParabola P1 = new HorizontalParabola(-4, -3, -0.25);
    public static final HorizontalLine HL1 = new HorizontalLine(6);
    public static final HorizontalLine HL2 = new HorizontalLine(3);
    public static final HorizontalLine HL3 = new HorizontalLine(-2);
    public static final HorizontalLine HL4 = new HorizontalLine(-4);
    public static final VerticalLine VL1 = new VerticalLine(1);
    public static final VerticalLine VL2 = new VerticalLine(2);
    public static final VerticalLine VL3 = new VerticalLine(-2);
    public static final VerticalLine VL4 = new VerticalLine(-6);


    static SimpleColor getColor(double x, double y) {
        if (!VL2.isPointRight(x) && VL1.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y)) {
            return SimpleColor.GRAY;
        }
        if (!HL1.isPointAboveLine(y) && HL2.isPointAboveLine(y) && !VL1.isPointRight(x) && VL3.isPointRight(x)) {
            return SimpleColor.BLUE;
        }
        if (!HL3.isPointAboveLine(y) && HL4.isPointAboveLine(y) && !VL1.isPointRight(x) && VL3.isPointRight(x)) {
            return SimpleColor.GREEN;
        }
        if (!VL3.isPointRight(x) && VL4.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y) && P1.isPointLeftOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!VL3.isPointRight(x) && VL4.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y)) {
            return SimpleColor.GRAY;
        }
        return SimpleColor.ORANGE;
    }

}
