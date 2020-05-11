import Hashtables.ChainedHashTable;
import Hashtables.Employee;
import Hashtables.SimpleHashTable;
import Sorting.MergeSort;
import Sorting.QuickSort;
import Trees.Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test {

    public static void main(String[] args) {

        //Udemy:Algorithms and Data Structures


        //Arrays and Big O Notation


        //Sorting
        executeSort();

        //Hastables
        //executeHashTables();


        //Trees
        //executeTrees();


        //Graphs, BFS and DFS
        //Search Algorithms

        //Lists

        //Heaps

        //Stacks

        //Queues


    }


    private static void executeSort() {
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

        //MergeSort mergeSort = new MergeSort();
        //mergeSort.executeMergeSort();

        QuickSort quickSort = new QuickSort();
        quickSort.executeQuickSort();

    }






    private static void executeHashTables() {
        //Hashtables
        //Chaining: Linear time

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        //Use the JDK hashmap
        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        //Employee employee = hashMap.put("Doe",mikeWilson);//Mike Wilson will replace John Doe
        Employee employee = hashMap.putIfAbsent("Doe", mikeWilson);

        System.out.println(employee);
        System.out.println(hashMap.getOrDefault("someone", mikeWilson));
        System.out.println(hashMap.remove("Jones"));

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

        //Create hash table
        //SimpleHashTable ht = new SimpleHashTable();
        //ChainedHashTable ht = new ChainedHashTable();

//        ht.put("Jones", janeJones);
//        ht.put("Doe", johnDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        ht.printHashTable();

//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
//        System.out.print("Retrieve key Smith: " + ht.get("Smith"));
//
//
//       ht.remove("Doe");
//       ht.remove("Jones");
//
//       ht.printHashTable();

//       System.out.print("Retrieve key Smith: " + ht.get("Smith"));
//
//
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    }


    private static void executeTrees() {

        // Build the tree first
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        // Next traverse the tree
        // In-order traversal
        intTree.traverseInOrder();

        // Level traversal

        // Pre-order traversal

        // Post-order traversal

    }

}
