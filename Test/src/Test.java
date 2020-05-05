import Hashtables.Employee;
import Hashtables.SimpleHashTable;


public class Test {

    public static void main(String[] args) {

        //Udemy:Algorithms and Data Structures


        //Arrays and Big O Notation


        //Hashtables

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable ht = new SimpleHashTable();

        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.print("Retrieve key Smith: " + ht.get("Smith"));


        ht.remove("Wilson");
        ht.remove("Jones");

        ht.printHashtable();


        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));

        //Trees





        //Sorting
        //Sorting.BubbleSort bubbleSort = new Sorting.BubbleSort();
        //bubbleSort.bubbleSort();

        //Sorting.SelectionSort selectionSort = new Sorting.SelectionSort();
        //selectionSort.selectionSort();

        //Sorting.InsertionSort insertionSort = new Sorting.InsertionSort();
        //insertionSort.insertionSort();

        //Sorting.ShellSort shellSort = new Sorting.ShellSort();
        //shellSort.shellSort();

        //Recursion.Recursion recursion = new Recursion.Recursion();
        //recursion.recursiveFactorial(3);
        //recursion.iterativeFactorial(3);

        //Sorting.MergeSort mergeSort = new Sorting.MergeSort(); //Left off here


        //Graphs, BFS and DFS
        //Search Algorithms

        //Lists

        //Heaps

        //Stacks

        //Queues











        //Udemy: Mastering the Coding Interview (Algos and Data Structures)

        //Hashtables


        //Trees

        //Sorting

        //Graphs


        //Linked Lists

        //Stacks and Queues

        //Searching BFS and DFS

        //Recursion


    }
}
