public class SelectionSort {

    Helpers _helpers = new Helpers();


    public void selectionSort() {

        // In-place algorithm
        // Selects largest value and adds to sorted partition
        // O(n^2): Quadratic time complexity (two loops considered n)
        // Not as much swapping as bubble sort
        // Unstable algorithm

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            intArray = _helpers.swap(intArray, largest, lastUnsortedIndex);

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Selection sort: " + intArray[i]);
        }


    }

}
