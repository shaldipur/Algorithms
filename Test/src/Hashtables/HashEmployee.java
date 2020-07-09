package Hashtables;

public class HashEmployee {

    private String firstName;
    private String lastName;
    private int id;

    //Prevent memory address being returned.
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + id;
    }

    public HashEmployee(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
