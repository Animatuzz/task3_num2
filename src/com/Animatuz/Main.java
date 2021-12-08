package com.Animatuz;

import java.util.Scanner;

import static com.Animatuz.Picture.getColor;

public class Main {

    private static Picture picture = new Picture();

    private static TestCase colortest = new TestCase();

    public static void main(String[] args) {

        if (!colortest.ColorTest(picture)) {
            System.out.println("Color test error");
            System.exit(1);
        }

        double axisX = readAxis("X: ");
        double axisY = readAxis("Y: ");

        printColorForPoint(axisX, axisY);

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


