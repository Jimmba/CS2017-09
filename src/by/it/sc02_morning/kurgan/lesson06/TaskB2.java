package by.it.sc02_morning.kurgan.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Новый способ ввода данных + поиск минимума

Текущая реализация:
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача:
Программа вводит пять чисел с клавиатуры (через Enter) и выводит минимальное из них на экран.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку, которая начинается на "Minimum = ".
3. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class TaskB2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int minimum = min5(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
    private static int min5(int a, int b, int c, int d, int e) {
        int f=min(a,b);
        int g=min(f,c);
        int h=min(g, d);
        int i=min(h, e);
        return i;
    }
}
