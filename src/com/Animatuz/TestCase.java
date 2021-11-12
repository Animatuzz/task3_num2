package com.Animatuz;

public class TestCase {

    boolean ColorTest(Picture picture) {
        if (picture.getColor(0, 0) != SimpleColor.ORANGE) {
            System.out.println("x=0 y=0 ERROR");
            return false;
        }

        if (picture.getColor(1.5, 0) != SimpleColor.GRAY) {
            System.out.println("x=1.5 y=0 ERROR");
            return false;
        }

        if (picture.getColor(0, 4) != SimpleColor.BLUE) {          //Проверка работоспособности определения цветов
            System.out.println("x=0 y=4 ERROR");
            return false;
        }

        if (picture.getColor(0, -3) != SimpleColor.GREEN) {
            System.out.println("x=0 y=-3 ERROR");
            return false;
        }

        if (picture.getColor(-3, 0) != SimpleColor.GRAY) {
            System.out.println("x=-3 y=0 ERROR");
            return false;
        }

        if (picture.getColor(-5, -1.5) != SimpleColor.BLUE) {
            System.out.println("x=-5 y=-1.5 ERROR");
            return false;
        }

        if (picture.getColor(-8, -3) != SimpleColor.ORANGE) {
            System.out.println("x=-8 y=-3 ERROR");
            return false;
        }

        return true;
    }

}
