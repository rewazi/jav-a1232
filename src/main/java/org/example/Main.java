package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        enum Month {
            Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
        }

        int max = 30;
        int min = -30;
        int[][] myYear = new int[12][];
        myYear[0] = new int[31];  // Январь
        myYear[1] = new int[28];  // Февраль
        myYear[2] = new int[31];  // Март
        myYear[3] = new int[30];  // Апрель
        myYear[4] = new int[31];  // Май
        myYear[5] = new int[30];  // Июнь
        myYear[6] = new int[31];  // Июль
        myYear[7] = new int[31];  // Август
        myYear[8] = new int[30];  // Сентябрь
        myYear[9] = new int[31];  // Октябрь
        myYear[10] = new int[30]; // Ноябрь
        myYear[11] = new int[31]; // Декабрь

        Random random = new Random();
        for (int i = 0; i < myYear.length; i++) {
            for (int j = 0; j < myYear[i].length; j++) {
                myYear[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        System.out.println();
        System.out.println("Максимальная погода по дням в году");
        System.out.println();
        System.out.printf("%9s", " ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("%9s", " ");
        System.out.println();
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", "-");
        }
        System.out.println();

        for (int i = 0; i < myYear.length; i++) {
            System.out.printf("%9s:", Month.values()[i]);
            for (int j = 0; j < myYear[i].length; j++) {
                System.out.printf("%4d", myYear[i][j]);
            }
            System.out.println();
        }
    }
}