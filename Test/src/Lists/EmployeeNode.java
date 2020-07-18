package Lists;

import Common.Employee;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;


    public EmployeeNode(Employee employee){
        this.employee = employee;
    }


    public Employee getListEmployee() {
        return employee;
    }

    public void setListEmployee(Employee listEmployee) {
        this.employee = employee;
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
