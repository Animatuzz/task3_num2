package com.Animatuz;

import java.util.Scanner;

import static com.Animatuz.Picture.getColor;

public class Main {

    public static final HorizontalParabola1 P1 = new HorizontalParabola1(-4,-3,-0.25);

    public static final HorizontalLine HL1 = new HorizontalLine(6);
    public static final HorizontalLine HL2 = new HorizontalLine(3);
    public static final HorizontalLine HL3 = new HorizontalLine(-2);
    public static final HorizontalLine HL4 = new HorizontalLine(-4);

    public static final VerticalLine VL1 = new VerticalLine(1);
    public static final VerticalLine VL2 = new VerticalLine(2);
    public static final VerticalLine VL3 = new VerticalLine(-2);
    public static final VerticalLine VL4 = new VerticalLine(-6);

    private static Picture picture = new Picture();

    private static TestCase colortest = new TestCase();

    public static void main(String[] args) {

        if(!colortest.Check(picture)) {

            System.out.println("Color test error");
            System.exit(0);

        }

        double x,y,writeResult = 0;

        x=write(writeResult);
        y=write(writeResult);

        printColorForPoint(x,y);

    }

    public static double write(double x) {

        Scanner scanner = new Scanner(System.in);

        x=scanner.nextDouble();

        if (x>10){

            System.out.println("Ошибка! Введите числа значениями от -10 до 10");
            System.exit(0);

        }

        return x;

    }

    public static void printColorForPoint(double x, double y) {

        System.out.println("Введите X: " + x);
        System.out.println("Введите Y: " + y);
        System.out.println("( " + x + ", " + y + " ) -> " + getColor(x, y));

    }

}


