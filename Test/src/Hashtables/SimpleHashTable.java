package Hashtables;
import Common.Employee;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }


    public void put(String key, Employee employee) {
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
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {

        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);

        if(hashedKey == -1){
            return null;
        }

        Employee hashEmployee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;


        StoredEmployee[]oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];

        for(int i=0; i < oldHashTable.length; i++){
            if(oldHashTable[i] !=null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
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
                System.out.println("Position" + i + ":" + hashtable[i].employee.getFirstName() + " " + hashtable[i].employee.getLastName() + " " + hashtable[i].employee.getId());
            }
        }
    }




}
