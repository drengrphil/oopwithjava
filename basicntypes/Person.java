abstract class Person {
    public String firstName = "John Doe";
    public int personAge = 21;
    public abstract void acceptoffer();
}

// Subclass (inherit from Person)
class Student extends Person{
    public String academicLevel = "Master's degree";
    public int graduationYear = 2019;
    public void acceptoffer(){
        // Body of the abstract method.
        System.out.println("Accepted Offer");
    }
}