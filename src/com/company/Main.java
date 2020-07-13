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
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i+1]) {
                    temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(Math.floor(x[i]) + " ");
        }

        System.out.println();
        ////////////////////////////////////////////////////////////////


        int[][] prototype = new int[18][18];
        for (int i = 0; i < prototype.length; i++) {
            int n = i + 1;
            for (int j = 0; j < prototype[i].length; j++) {
                prototype[i][j] = n++;
                if (n == 19) {
                    n = 1;
                }
            }
        }
        System.out.println();

        System.out.println("Вывод изначальных значений массива: ");
        for (int i = 0; i < prototype.length; i++) {
            for (int j = 0; j < prototype[i].length; j++) {
                System.out.print(prototype[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        double[][] ans = new double[prototype.length][prototype.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][0] = prototype[i][0];
            }
        }

//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[i].length; j++) {
//                System.out.print(ans[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 1; i < ans.length; i++) {
            ans[5][i] = Math.pow(((Math.tan(Math.pow((prototype[5][i] * (4 - prototype[5][i])), 2))) / 2), 2);
        }

//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[i].length; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int j = 7; j < ans.length; j++) {
            if (j == 9 || j == 12 || j == 16) {
                continue;
            }
            for (int i = 1; i < ans.length; i++) {
                ans[j][i] = Math.pow((Math.pow((prototype[j][i] / 2), 3) * (1 / 3 + Math.sin(prototype[j][i]))), Math.cos(prototype[j][i]));
            }
        }


//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[i].length; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int j = 0; j < ans.length; j++) {
            if (j == 5 || j == 7 || j == 8 || j == 10 || j == 11 || j == 13 || j == 14 || j == 15){
                continue;
            }
            for (int i = 1; i < ans[j].length; i++) {
                ans[j][i] = Math.log(Math.abs(Math.E * (Math.asin((prototype[j][i] - 1) / 8) / 2)));
            }
        }

        System.out.println("Вывод массива с ответами: ");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print((Math.round(ans[i][j] * 1000.0) / 1000.0) + " ");
            }
            System.out.println();
        }


    }
}

