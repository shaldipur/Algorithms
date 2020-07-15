import Hashtables.HashEmployee;
import Lists.EmployeeDoublyLinkedList;
import Lists.ListEmployee;
import Lists.EmployeeLinkedList;
import SearchAlgorithms.BinarySearch;
import Trees.Tree;
import java.util.*;


public class Test {

    public static void main(String[] args) {

        //Udemy:Algorithms and Data Structures


        //Arrays and Big O Notation


        //Sorting
        //executeSort();

        //Searching
        //executeSearch();

        //Lists
        executeLists();

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

        //QuickSort quickSort = new QuickSort();
        //quickSort.executeQuickSort();

    }


    private static void executeSearch(){
        BinarySearch binarySearch =  new BinarySearch();
        binarySearch.executeIterativeSearch();
    }

    private static void executeLists(){
        //Array Lists
        //List<Employee> employeeList = new ArrayList<>();

        //Adds a new employee to the end of the list
//        employeeList.add(new Employee("Jane","Jones",123));
//        employeeList.add(new Employee("John", "Doe",  4567));
//        employeeList.add(new Employee("Mary", "Smith",22));
//        employeeList.add(new Employee("Mike","Wilson",3245));

        //Print out all employees
        //employeeList.forEach(employee -> System.out.println(employee));

        //Print out one employee
        // Done in constant time. Time complexity doesn't depend on size of list.
        //System.out.println(employeeList.get(1));

        //See if list is empty
        //System.out.println(employeeList.isEmpty());

        //Replace an employee (setting happens in O(1) constant time)
        //employeeList.set(1,new Employee("John","Adams",4568));
        //employeeList.forEach(employee -> System.out.println(employee));

        //Get number of items in list
        //System.out.println(employeeList.size());

        //Add to specific point in list
//        employeeList.add(3, new Employee("John","Doe",4567));
//        employeeList.forEach(employee -> System.out.println(employee));

        //Object array (list to array)
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for(Employee employee:employeeArray){
//            System.out.println(employee);
//        }

//        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));// override not working
//        System.out.println(employeeList.indexOf(new Employee("John","Doe", 4567)));// override not working

        //Remove an employee
//        employeeList.remove(2);
//        employeeList.forEach(employee -> System.out.println(employee));


        //Vectors (better thread safety)
//        List<Employee> employeeList = new Vector<>();
//        employeeList.add(new Employee("Jane","Jones",123));
//        employeeList.add(new Employee("John", "Doe",  4567));
//        employeeList.add(new Employee("Mary", "Smith",22));
//        employeeList.add(new Employee("Mike","Wilson",3245));
//
//        employeeList.forEach(employee -> System.out.println(employee));



        //Singly Linked List
        //Each item in the list is aware of another item in the list because they are linked.
        //Each item in the list is called a node.
        //The first item in the list is the head of the list.
        //The last item always points to null because nothing comes after it.
        //More memory use than arrays

        ListEmployee janeJones = new ListEmployee("Jane","Jones",123);
        ListEmployee johnDoe = new ListEmployee("John", "Doe",  4567);
        ListEmployee marySmith = new ListEmployee("Mary", "Smith",22);
        ListEmployee mikeWilson = new ListEmployee("Mike","Wilson",3245);

        //Check if list is empty before adding anything
        //EmployeeLinkedList list = new EmployeeLinkedList(); //Single linked list
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList(); //Double linked list
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);


        list.printList();
        System.out.println(list.getSize());

        ListEmployee billEnd = new ListEmployee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }


    private static void executeHashTables() {
        //Hashtables
        //Chaining: Linear time

        HashEmployee janeJones = new HashEmployee("Jane", "Jones", 123);
        HashEmployee johnDoe = new HashEmployee("John", "Doe", 4567);
        HashEmployee marySmith = new HashEmployee("Mary", "Smith", 22);
        HashEmployee mikeWilson = new HashEmployee("Mike", "Wilson", 3245);


        //Use the JDK hashmap
        Map<String, HashEmployee> hashMap = new HashMap<String, HashEmployee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        //Employee employee = hashMap.put("Doe",mikeWilson);//Mike Wilson will replace John Doe
        HashEmployee hashEmployee = hashMap.putIfAbsent("Doe", mikeWilson);

        System.out.println(hashEmployee);
        System.out.println(hashMap.getOrDefault("someone", mikeWilson));
        System.out.println(hashMap.remove("Jones"));

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        Iterator<HashEmployee> iterator = hashMap.values().iterator();
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
        intTree.insert(15);//min
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);// max

        // Next traverse the tree
        // In-order traversal
        intTree.traverseInOrder();
        System.out.println();
//
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));

        //Get Min and Max in binary search tree
//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

        intTree.delete(8888);
        intTree.traverseInOrder();
        System.out.println();



        // Level traversal

        // Pre-order traversal

        // Post-order traversal


        // Implement a red black tree

    }

}
