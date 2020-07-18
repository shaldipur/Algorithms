package Stacks;
import Common.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Employee> stack; //implements the Dequeue interface and has its methods(e.g. push, pop,etc.)

    public LinkedStack(){
        stack = new LinkedList<Employee>(); // doubly linked list
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
         return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
