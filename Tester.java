package ru.mirea.Lab1;
import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Circle k1 = new Circle(7.1D, 1.1D, 8.7D, "blue");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        double r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}