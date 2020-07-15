package Lists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;


    public void addToFront(ListEmployee listEmployee){
        EmployeeNode node = new EmployeeNode(listEmployee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head; //node to remove is pointed to by head node

        head = head.getNext();

        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD-> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

}
