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
    // -Split left and right arrays into two arrays each.
    // -Keep splitting until all the arrays have only one element each -  these arrays are sorted.

    // Merging phase:
    // -Merge every left/right pair of sibling arrays into a sorted array
    // -After the first merge, we'll have a bunch of 2 element sorted arrays
    // -Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4 element sorted arrays
    // -Repeat until you have a single sorted array
    // -Not in place. Uses temporary arrays.










}
