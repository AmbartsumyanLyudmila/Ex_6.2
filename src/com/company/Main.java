//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.print("Введите целое число(кол-во символов в массиве):");
        Scanner n = new Scanner(System.in);
        int symbol = n.nextInt();
        int[] num1 = new int[symbol];
        System.out.println("Введите " + symbol + " цифр(ы) через пробел и нажмите Enter");

        int i;
        for(i = 0; i < symbol; ++i) {
            num1[i] = n.nextInt();
            System.out.print(num1[i]+" ");
        }

        System.out.println();
        int max = num1[0];
        for(i = 0; i < symbol; ++i) {
            if (max < num1[i])
                max = num1[i];
        }
        System.out.println("Число max= "+max);
        int min = num1[0];
        for(i = 0; i < symbol; ++i) {
            if (min > num1[i])
                min = num1[i];
        }
        System.out.println("Число min= "+min);

    }
}
