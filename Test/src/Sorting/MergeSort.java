package Sorting;

public class MergeSort {

    // Divide and conquer algorithm

    // Recursive algorithm

    // Two phases: Splitting and Merging

    // Splitting phase leads to faster sorting during the merging phase

    // Splitting is logical.  We don't create new arrays.

    // Splitting phase:
    // -Starts with unsorted array.
    // -Divide array into two arrays, which are unsorted. Left array and right array.
    // -Split left and right arrays into TWO arrays each.
    // -Keep splitting until all the arrays have only ONE element each -  these arrays are sorted.

    // Merging phase:
    // -Merge every left/right pair of sibling arrays into a sorted array
    // -After the first merge, we'll have a bunch of 2 element sorted arrays
    // -Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4 element sorted arrays
    // -Repeat until you have a single sorted array
    // -Not in place. Uses temporary arrays.

    // Time complexity: n*log(n) base 2
    // Stable sorting algorithm
    // Temp instances require memory

    public static void executeMergeSort() {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    //Recursive method with breaking method
    public static void mergeSort(int[] input, int start, int end) {
        // Break when there is a one element array
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        // Sort left array
        mergeSort(input, start, mid);

        // Sort right array
        mergeSort(input, mid, end);

        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;

        int j = mid;

        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);




    }


}
