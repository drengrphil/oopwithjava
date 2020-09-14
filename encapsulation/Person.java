// Encapsulation - ensure sensitive data is hidden from users
// class variables and attributes are declared private
// Class provides public get and set methods to access and modify the private variables.
// Pros of Encapsulation:
//    Better control of class attributes and methods
//    Increased security of data
//    One part of the code can be changed without affecting the others.
public class Person{
    private int personAge;
    private String personName;

    // Getter and Setter methods.
    public String getPersonName(){
        return personName;
    }

    public void setPersonName(String pName){
        this.personName = pName;
    }

    public int getPersonAge(){
        return personAge;
    }

    public void setPersonAge(int pAge){
        this.personAge = pAge;
    }
}