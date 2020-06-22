package SearchAlgorithms;

public class BinarySearch {

    //Data must be sorted

    //Chooses the element in the middle of the array and compares it
    //against the search value

    //If element is equal to the value, we're done

    //If element is greater than the value, search the left half of the array

    //If the element is less than the value, search the right half of the array



    //Iterative Binary Search
    public void executeIterativeSearch(){
        int[] intArray = {-22,-15,1,7,20,35,55};

//        System.out.println(iterativeBinarySearch(intArray,-15));
//        System.out.println(iterativeBinarySearch(intArray,35));
//        System.out.println(iterativeBinarySearch(intArray,8888));
//        System.out.println(iterativeBinarySearch(intArray,1));

        System.out.println(recursiveBinarySearch(intArray,-15));
        System.out.println(recursiveBinarySearch(intArray,35));
        System.out.println(recursiveBinarySearch(intArray,8888));
        System.out.println(recursiveBinarySearch(intArray,1));
    }

    public static int iterativeBinarySearch(int[] input, int value){ // params are array we are searching and value we want to find
        int start = 0;
        int end = input.length;

        while(start < end){
            int midpoint = (start + end)/2;
            System.out.println("midpoint = " + midpoint);

            if(input[midpoint] == value){
                return midpoint;
            }
            //search right part of array
            else if (input[midpoint] < value){
                start = midpoint + 1;
            }
            //search left part of array
            else{
                end = midpoint;
            }
        }

        return -1;
    }


    //Recursive Binary Search (more expensive because of overhead involved with method calls)
    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input,0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return -1;
        }

        //Recursion is doing what the loop is doing in the iterative binary search above
        int midpoint = (start + end)/2;
        System.out.println("midpoint = " + midpoint);

        if(input[midpoint] == value){
            return midpoint;
        }
        //search right part of array
        else if(input[midpoint] < value){
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        //search left part of array
        else{
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

}
