package Hashtables;
import Common.Employee;

public class StoredEmployee {

    public String key; //this is the raw key and not the hashed value

    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
