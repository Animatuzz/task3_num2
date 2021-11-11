package com.Animatuz;

import static com.Animatuz.Main.*;
import static com.Animatuz.Main.HL3;

public class Picture {


    public static SimpleColor getColor(double x, double y){

        if (!VL2.isPointRight(x) && VL1.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y)) {
            return SimpleColor.GRAY;
        }

        if (!HL1.isPointAboveLine(y) && HL2.isPointAboveLine(y) && !VL1.isPointRight(x) && VL3.isPointRight(x)){
            return SimpleColor.BLUE;
        }

        if (!HL3.isPointAboveLine(y) && HL4.isPointAboveLine(y) && !VL1.isPointRight(x) && VL3.isPointRight(x)){
            return SimpleColor.GREEN;
        }

        if (!VL3.isPointRight(x) && VL4.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y) && P1.isPointLeftOfParabola(x, y)){
            return SimpleColor.BLUE;
        }

        if (!VL3.isPointRight(x) && VL4.isPointRight(x) && !HL2.isPointAboveLine(y) && HL3.isPointAboveLine(y)){
            return SimpleColor.GRAY;
        }

        return  SimpleColor.ORANGE;
    }


}
