package Lists;

public class EmployeeNode {
    private ListEmployee listEmployee;
    private EmployeeNode next;
    private EmployeeNode previous;


    public EmployeeNode(ListEmployee listEmployee){
        this.listEmployee = listEmployee;
    }


    public ListEmployee getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ListEmployee listEmployee) {
        this.listEmployee = listEmployee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }


    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }
}
