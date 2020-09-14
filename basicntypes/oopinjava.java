// Encapsulation - ensure sensitive data is hidden from users
// class variables and attributes are declared private
// Class provides public get and set methods to access and modify the private variables.
// Pros of Encapsulation:
//    Better control of class attributes and methods
//    Increased security of data
//    One part of the code can be changed without affecting the others.
// Constructor: Initializes an object. Types:
//     1. Default constructor: if no constructor is found in the code, compiler inserts a default one.
//     2. no-arg: no-arg constructor. Constructor with no args but block of code in the body
//     3. Parameterized example:
class ParameterizedConstructor{
    private int justCounter;
    public ParameterizedConstructor(int initialCounterValue){
        this.justCounter = initialCounterValue;
    }

    public int getCounterValue(){
        return justCounter;
    }
}
// Constructor Chaining: When a constructor calls another constructor of same class.
class ConstructorChaining{
    private String bookTitle;
    private int titleLenght;

    ConstructorChaining(){
        this("Chain Constructor");
    }

    ConstructorChaining(String titleString){
        this(titleString, titleString.length());
    }

    ConstructorChaining(String titleString, int lenStr){
        this.bookTitle = titleString;
        this.titleLenght = lenStr;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public int getTitleLength(){
        return titleLenght;
    }
}

// Super(): used whenever a child class constructor gets invoked, it implicitly invokes the constructor
//    of a parent class.
class ParentClass{
    ParentClass(){
        System.out.println("Child Invokes Parent Constructor.");
    }
}

class ChildClass{
    ChildClass(){
        System.out.println("Child Class Constructor.");
    }
}

// Constructor overloading: having more than one constructor with different parameters
class ConstructorOverloading{
    ConstructorOverloading(){}

    ConstructorOverloading(int valInput){}

    ConstructorOverloading(String strCar){}
}

// Copy constructor: To copy values of one object to another object
class CopyConstructorExample{
    String webTitle;
    CopyConstructorExample(String wTitle){
        this.webTitle = wTitle;
    }

    /*
     *
     * This is the copy constructor that will copy object to another object
     */
    CopyConstructorExample(CopyConstructorExample objectToCopy){
        this.webTitle = objectToCopy.webTitle;
    }

    void displayWebTitle(){
        System.out.println("Web Title: " + webTitle);
    }
}

// Static keyword: use with class, variable, method and block
//   static members belong to the class instead of a specific instance
//   can be accessed without an object.
//   Static class can only be nested in another class
class StaticExampleDemo{
    // Static members
    // Static variables are class level variables - also known as class variables
    // Static variables are identical for all instances and values are shared among instances
    static int countNumCalls;
    static String lastCallerName;

    // Static method
    static void testMethod(){
        System.out.println("Static method invoked");
    }

    public void printStaticMembers(){
        testMethod();
        System.out.println("Calls Count: " + countNumCalls);
        System.out.println("Last Caller: " + lastCallerName);
    }

    // Static block is used to initialize the static variables
    // block gets executed when the class is loaded in the memory
    static{
        countNumCalls = 100;
        lastCallerName = "James";
    }
}

// Inheritance
// Inherit attributes and methods from one class to another.
// Subclass (child) - the class that inherits from another class
// Superclass (parent) - the class being inherited from
// A class is inherited using "extends" keyword
// Inheritance is useful for code reusability
// Use keyword "final" to prevent other classes from inheriting from it.

// Polymorphism
// Means many forms, many classes that are related to each other by inheritance
// Inheritance lets inherit attributes and methods from another class
// Polymorphism uses those methods to perform different tasks.
// Perform single action in different ways.

    // Object-oriented programming
    // Creating Objects that contain both data and methods.
    // Advantages of OOP over procedural programming:
    /*
     * 1. OOP is faster and easier to execute
     * 2. OOP provides a clear structure for the programs
     * 3. OOP helps to keep the Java code Don't Repeat Yourself (DRY), easy to maintain, modify and debug.
     * 4. OOP makes it possible to create full reusable applications with less code and shorter dev time.
     */
    // Classes and objects are the two main aspects of OOP.
    // Generally, class is a template for objects and an object is an instance of a class
    // Each individual object inherits all the variables and methods of the class
    
    /* Access modifiers:
     *   public: Code is accessible for all classes
     *   private: Code is only accessible within the declared class
     *   default: Only accessible in the same package.
     *   protected: Code is accessible in the same package and subclasses  */

    /*
     *
     * Non-access modifiers:
     *   final:    attributes and methods cannot be override/modified
     * 
     *   abstract: can only be used in abstract class, and only used on methods
     *             Such method does not have a body, body is provided by the subclass
     *             it's inherited from: e.g. abstract void run().
     * 
     *   static:   attributes and methods belong to the class rather than object.
     * 
     *   transient: attributes and methods are skipped when serializing the object containing them.
     * 
     *   synchronized: Methods can only be accessed by one thread at a time
     *
     *   volatile: the value of an attribute is not cached thread-locally, and it is always read from main memory
     */

    // Class methods
    // static methods can be accessed without creating an object
    // public can only be accessed by class objects
    // public is an access modifier
    public class oopinjava {
        public static void main(String[] args) {
            StudentRecord studentRec = new StudentRecord(21, "Phil Babs", "Senior");
            System.out.println("Name: " + studentRec.studentName);
            System.out.println("Classes Taken: " + studentRec.classesTaken[0]);
            System.out.println("Age: " + studentRec.studentAge);
            System.out.println("Level: " + studentRec.studentYear);
            // Final attribute of a class
            System.out.println("Instructor: " + studentRec.instructorName);
            // Modify attribute of a class
            studentRec.studentYear = "Senior";
            System.out.println("Level: " + studentRec.studentYear);

            // Car Class
            DesiredCars desiredCar = new DesiredCars();
            desiredCar.carModel("Nissan");
            desiredCar.carYear(2012);
            desiredCar.carColor("Purple");

            // Copy Constructor
            CopyConstructorExample ccExampleObj_1 = new CopyConstructorExample("Enjoy your day");
            // Uses copy constructor
            CopyConstructorExample ccExampleObj_2 = new CopyConstructorExample(ccExampleObj_1);

            ccExampleObj_1.displayWebTitle();
            ccExampleObj_2.displayWebTitle();
        }
    }