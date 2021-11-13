package com.Animatuz;

import java.util.Scanner;

import static com.Animatuz.Picture.getColor;

public class Main {

    public static final HorizontalParabola1 P1 = new HorizontalParabola1(-4, -3, -0.25);
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
        if (!colortest.ColorTest(picture)) {
            System.out.println("Color test error");
            System.exit(1);
        }

        double x = readAxis("X: ");
        double y = readAxis("Y: ");

        printColorForPoint(x, y);

    }

    static double readAxis(String axisType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение оси " + axisType);
        double axis = scanner.nextDouble();
        if (axis > 10) {
            System.out.println("Ошибка! Введите число со значением от -10 до 10");
            return readAxis(axisType);
        }
        return axis;
    }

    static void printColorForPoint(double x, double y) {
        System.out.println("( " + x + ", " + y + " ) -> " + getColor(x, y));
    }

}


