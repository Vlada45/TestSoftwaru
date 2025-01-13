package org.example;

import java.util.Scanner;

public class MyMin {
    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        var vysledek = min(sc.nextInt(), sc.nextInt());

        System.out.println("Nejmensi cislo ze vsech je: " + vysledek);
    }
}
