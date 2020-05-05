package Hashtables;

import java.util.LinkedList;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList[10];
        for(int i =0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }

    }

    private int hashKey(String key) {

        //This takes a string input and hashes it to an int
        return key.length() % hashtable.length;
    }

}
