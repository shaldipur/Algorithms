package Lists;

public class EmployeeLinkedList {
    private EmployeeNode head;


    public void addToFront(ListEmployee listEmployee){
        EmployeeNode node = new EmployeeNode(listEmployee);
        node.setNext(head);
        head = node;
    }


}
