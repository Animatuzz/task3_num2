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

            System.out.println("Color test error");    //Вывод в консоль сообщения об ошибке в случае невыполнения ColorTest
            System.exit(0);

        }

        double x, y, testingAxis = 0;

        printWelcomeMessage();

        x = readAxis(testingAxis);
        y = readAxis(testingAxis);

        printColorForPoint(x, y);

    }

    public static void printWelcomeMessage() {

        System.out.println("Введите по очереди значения осей X и Y ");

    }

    public static double readAxis(double testingAxis) {

        Scanner scanner = new Scanner(System.in);             //Ввод данных о точке с клавиатуры

        testingAxis = scanner.nextDouble();

        axisTest(testingAxis);

        return testingAxis;

    }

    public static void axisTest(double x){

        if (x > 10) {

            System.out.println("Ошибка! Введите числа значениями от -10 до 10");      //Если введена неверная точка - вывод в косоль сообщения об ошибке
            System.exit(0);

        }

    }

    public static void printColorForPoint(double x, double y) {

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("( " + x + ", " + y + " ) -> " + getColor(x, y));  //Вывод в консоль ответа

    }

}


