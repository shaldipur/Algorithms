package Hashtables;

public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    private int hashKey(String key){


        //This takes a string input and hashes it to an int

        return key.length() % hashtable.length;
    }
}
