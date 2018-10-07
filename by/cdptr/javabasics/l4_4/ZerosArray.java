package by.cdptr.javabasics.l4_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZerosArray {

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {

            System.out.println("Введено невалидное число! Попробуйте снова");
            scan.next();

        }

        return scan.nextInt();

    }

    public static int noZerosAllowed(int x) {

        while (x <= 0) {

            System.out.println("Число не может быть меньше нуля либо равно ему! Попробуйте снова");
            x = enterNumber();

        }

        return x;

    }

    public static int[] fillArrayWithRandomNumbers(int x) {

        int[] arr = new int[x];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100);

        }

        return arr;

    }

    public static int countZeros(int[] arr) {

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                k += 1;

            }

        }

        return k;

    }

    public static int[] zerosToArray(int[] arr, int k) {

        int[] arr2 = new int[k];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr2[j] = i;

                j += 1;

            }

        }

        return arr2;

    }

    public static void returnResult(int[] arr) {

        if (arr.length == 0) {

            System.out.println("Нули в заданном массиве не обнаружены");

        } else {

            System.out.println(Arrays.toString(arr));

        }

    }

}

