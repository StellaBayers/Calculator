package calculator;
import java.util.Scanner;

public class Main {                       //создаем java класс Main
    public static void main(String[] args) {//вызов публичного метода main, который вызывается без создания экземпляра класса
        Scanner scn = new Scanner(System.in); // создаем объект класса сканер, чтобы переменные считывалась с консоли
        System.out.println("Введите первое число"); //выводим текст на консоль
        int a = scn.nextInt(); //вызываем метод nextInt для считывания числа a с консоли
        System.out.println("Введите второе число"); //выводим текст на консоль
        int b = scn.nextInt(); //вызываем метод nextInt для считывания числа b с консоли
        System.out.println(a + "+" + b + "=" + (a + b)); //выводим на консоль операцию сложения переменных a и b
        System.out.println(a + "-" + b + "=" + (a - b)); //выводим на консоль операцию вычитания переменных a и b
        System.out.println(a + "*" + b + "=" + a * b);//выводим на консоль операцию умножения переменных a и b
        System.out.println(a + "/" + b + "=" + a / b);//выводим на консоль операцию деления переменных a и b

    }
}
