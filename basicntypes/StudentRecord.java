public class StudentRecord {
    int studentAge = 0;
    String studentYear = "Default";
    String studentName = "Default Default";
    final String [] classesTaken = {"OOP1", "React Native", "Database Internals", "Wireless Networks"};
    // Attribute that cannot be override
    final String instructorName = "Dr. Phillip";

    // Constructor: special method to initialize objects
    // Called when an object of a class is created.
    public StudentRecord(int age, String name, String year){
        studentAge  = age;
        studentYear = year;
        studentName = name;
    }

    // Class methods
    // static methods can be accessed without creating an object
    // public can only be accessed by class objects
    // public is an access modifier
    static int studentAgeCloned = 24;
    static void outStudentAge(){
        System.out.println("Static Method called by a public");
        System.out.println(studentAgeCloned);
    }

    public void printClassRecord(){
        System.out.println("Public Method Called");
        outStudentAge();
        System.out.println("Instructor: " + instructorName);
    }
}