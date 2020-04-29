package Sorting;

import Helpers.Helpers;

public class BubbleSort {

    Helpers _helpers = new Helpers();

    public void bubbleSort() {

        // O(n^2): Quadratic time complexity
        // Two loops
        // Not efficient, very slow algorithm
        // This is a stable sort algorithm because i is always compared with i + 1 and therefore no conflicts will
        // arise should two equal values end up adjacent to each other for comparison.
        // It preserves the ordering of duplicate items.

        // I understand this algorithm.


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    intArray = _helpers.swap(intArray, i, i + 1);
                }
            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Selection sort: " + intArray[i]);
        }

    }


}
