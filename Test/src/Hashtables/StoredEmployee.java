package Hashtables;

public class StoredEmployee {

    public String key; //this is the raw key and not the hashed value

    public HashEmployee hashEmployee;

    public StoredEmployee(String key, HashEmployee hashEmployee) {
        this.key = key;
        this.hashEmployee = hashEmployee;
    }
}
