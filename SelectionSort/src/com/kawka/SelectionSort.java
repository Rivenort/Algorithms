package com.kawka;

/**
 * Selection sort algorithm
 * @author  Dominik Kawka dominik.kawka.main@gmail.com
 * <p>
 *     Analysis
 *     Let the n be the number of elements to sort. We assume the worst scenario and we sort the etire set of elements.
 *     We expect that we will have a O(n^2) because of one inner loop.
 *     Method run() has loop that call getSmallest() method (n-1) times.
 *     Method getSmallest() generate (n-i-1) comparsions where (i) is run's loop iterator.
 *     That is: (n-1) + (n-2) + ... + 2 + 1 = 0.5n(n-1) comparsions. See arithmetic progression.
 *     Example:
 *     n = 5
 *
 *     run() -> LOOP(0) -> getSmallest(1)
 *                         getSmallest(2)
 *                         getSmallest(3)
 *                         getSmallest(4)
 *     run() -> LOOP(1) -> getSmallest(2)
 *                         getSmallest(3)
 *                         getSmallest(4)
 *     run() -> LOOP(2) -> getSmallest(3)
 *                         getSmallest(4)
 *     run() -> LOOP(3) -> getSmallest(4)
 *     run() -> LOOP(4)
 *
 * </p>
 *
 */
public class SelectionSort {

    public static void swap(int list[], int i, int j) {
        int buff = list[i];
        list[i] = list[j];
        list[j] = buff;
    }

    public static int getSmallest(int list[], int low, int high) {
        // method returns an index of smallest number of given range
        int smallest = low;
        for (int i = low + 1; i < high; ++i) {
            if (list[i] < list[smallest]) smallest = i;
        }
        return smallest;
    }

    public static void run(int list[], int low, int high) {
        for (int i = low; i < high; ++i) {
            swap(list, i, getSmallest(list,i,high));
        }
    }

    public static void run(int list[], int high) {
        run(list, 0, high);
    }


    public static void run(int list[]) {
        run(list, 0, list.length);
    }

    /**
     * @param list a simple array to sort
     * @param low  the lowest index of a range to sort
     * @param high the highest index of a range to sort
     */
}
