package cau3;

import java.util.Scanner;

public class sapxepmang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i = i + 1) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i = i + 1) {
            for (int j = i + 1; j < n; j = j + 1) {

                if (a[i] < 0 && a[j] < 0 && a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int i = 0; i < n - 1; i = i + 1) {
            for (int j = i + 1; j < n; j = j + 1) {

                if (a[i] > 0 && a[j] > 0 && a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int i = 0; i < n; i = i + 1) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }

        for (int i = 0; i < n; i = i + 1) {
            if (a[i] == 0) {
                System.out.print(a[i] + " ");
            }
        }

        for (int i = 0; i < n; i = i + 1) {
            if (a[i] > 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}