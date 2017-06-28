package com.kawka;

public class Main {

    public static void main(String[] args) {
    int[] num = {54, 10, 3, 11, 134, 34, 32, 99};

        System.out.print("BEFORE:\n");
    for (int i = 0; i < num.length; ++i) {
        System.out.print("|"+num[i]);
    }
        System.out.print("|\n");
    //
    SelectionSort.run(num);
    //
        System.out.print("AFTER:\n");
        for (int i = 0; i < num.length; ++i) {
            System.out.print("|"+num[i]);
        }
        System.out.print("|\n");

    }
}
