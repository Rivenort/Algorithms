package com.kawka;

/**
 * Insertion sort algorithm
 * @author Dominik Kawka dominik.kawka.main@gmail.com
 *
 * Analysis
 * We've got only one method there. The 'for' loop repeats for (n-1) times.
 * For each iteration we select a 'key' value that is compared to prior one until a 'j' iterator
 * will not reach the 0 index or we found a smaller number.
 * When we considering our 'key' value we can have 1 to (j-1) comparsions. So if we consider the
 * worst scenario we've got: 1 + 2 + ... + n-1 = 0.5n(n-1) comparsions.
 *
 * Other conclusions
 * The performance of Insertion sort algorithm strictly depends on the level of number's order.
 * If the array is partly sorted, then algorithm is more efficient. For example if array is already sorted
 * then algorithm will find out and the number of comparsions will equal to (n-1).
 *
 */
public class InsertionSort {
   public static void run(int list[], int low, int high) {
       for (int i = low + 1; i < high; ++i) {
           int key = list[i];
           int j = i - 1;
           while (j >= low && key < list[j]) {
               list[j + 1] = list[j];
               --j;
           }
           list[j + 1] = key;
       }
   }

   public static void run(int list[], int high) {
       run(list, 0, high);
   }

   public static void run(int list[]) {
       run(list, 0, list.length);
   }
    /**
     * @param list an array of integers to sort
     * @param low  the lowest index of range to sort
     * @param high the highest index of range to sort
     */
}
