package com.kawka;

public class Main {

    public static void main(String[] args) {
        int[] list = {45, 32, 76, 33, 39, 78, 5, 90};

        System.out.println("BEFORE:");
        for (int i = 0; i < list.length; ++i) {
            System.out.print("|" + list[i]);
        }

        InsertionSort.run(list);

        System.out.println("\nAFTER:");
        for (int i = 0; i < list.length; ++i) {
            System.out.print("|" + list[i]);
        }
    }
}
