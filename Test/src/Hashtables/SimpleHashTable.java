package Hashtables;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }


    public void put(String key, HashEmployee hashEmployee) {
        int hashedKey = hashKey(key);

        //Linear probing
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }


        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, hashEmployee);
        }
    }

    public HashEmployee get(String key) {

        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].hashEmployee;
    }

    public HashEmployee remove(String key){
        int hashedKey = findKey(key);

        if(hashedKey == -1){
            return null;
        }

        HashEmployee hashEmployee = hashtable[hashedKey].hashEmployee;
        hashtable[hashedKey] = null;


        StoredEmployee[]oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];

        for(int i=0; i < oldHashTable.length; i++){
            if(oldHashTable[i] !=null){
                put(oldHashTable[i].key, oldHashTable[i].hashEmployee);
            }
        }



        return hashEmployee;
    }

    private int hashKey(String key) {

        //This takes a string input and hashes it to an int
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        //Linear probing

        int stopIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }


        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }

    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            }
            else {
                System.out.println("Position" + i + ":" + hashtable[i].hashEmployee.getFirstName() + " " + hashtable[i].hashEmployee.getLastName() + " " + hashtable[i].hashEmployee.getId());
            }
        }
    }




}
