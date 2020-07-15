package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1: ");
        short[] p = new short[19];
        for (short i = 18; i >= 2; i--) {
            p[i] = i;
            System.out.print(p[i] + " ");
        }

        System.out.println();


        double[] x = new double[18];
        for (int i = 0; i < 18; i++) {
            x[i] = Math.random() * 8 - 3;
        }

        System.out.println();
        System.out.println("Задание 2:");
        //Arrays.sort(x);
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(Math.floor(x[i]) + " ");
        }

        System.out.println();
        System.out.println("Задание 3: ");
        ////////////////////////////////////////////////////////////////


        double[][] b = new double[17][18];
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 18; j++) {
                if (p[i] == 6) {
                    b[i][j] = Math.pow(((Math.tan(Math.pow((x[j] * (4 - x[j])), 2))) / 2), 2);
                } else if (p[i] == 8 || p[i] == 9 || p[i] == 11 || p[i] == 12 || p[i] == 14 || p[i] == 15 || p[i] == 16 || p[i] == 18) {
                    b[i][j] = Math.pow((Math.pow((x[j] / 2), 3) * (1 / 3 + Math.sin(x[j]))), Math.cos(x[j]));
                }
                else {
                    b[i][j] = Math.log(Math.abs(Math.E * (Math.asin((x[j] - 1) / 8) / 2)));
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print((Math.round(b[i][j] * 1000.0) / 1000.0) + " ");
            }
            System.out.println();
        }

    }
}

