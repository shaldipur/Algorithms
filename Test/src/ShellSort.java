public class ShellSort {

    public void shellSort(){

        // Variation of Insertion Sort

        // Insertion sort chooses which element to insert
        // using a gap of 1

        // Shell Sort starts out using a larger gap value

        // As the algorithm runs, the gap is reduced

        // Goal is to reduce the amount of shifting required

        // Runs in almost linear time because it doesn't
        // have to do as much shifting

        // As algorithm progresses, the gap is reduced

        // The last gap value is always 1

        // A gap value of 1 is equivalent to insertion sort

        //  Algorithm does some preliminary work (using gap values greater than 1),
        //  and then becomes insertion sort

        //  By the time we get to the insertion sort, the array has been
        //  partially sorted, so there's less shifting required.

        // In place algorithm

        // Hard to tell time complexity

        // Worst case is O(n^2), but it can have better peformance

        // Doesn't require as much shifting as insertion sort, so it
        // usually performs better

        // Unstable algorithm

        // Partially understand this algorithm


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Establish the gap

        for (int gap = intArray.length/2; gap > 0; gap /=2){

            System.out.println(intArray.length);
            System.out.println(gap /=2);

            // Code the comparing and shifting (insertion using gap)

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j>=gap && intArray [j- gap] > newElement){
                    intArray[j] = intArray [j-gap];
                    j-= gap;
                }

                intArray[j] = newElement;


            }
        }

        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }





    }
}
