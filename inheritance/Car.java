// Inherit attributes and methods from one class to another.
// Subclass (child) - the class that inherits from another class
// Superclass (parent) - the class being inherited from
// A class is inherited using "extends" keyword
// Inheritance is useful for code reusability
// Use keyword "final" to prevent other classes from inheriting from it.
/*
 *
 * Car class (subclass) inherits attributes and methods from the
 *    vehicle class.
 */
class Car extends Vehicle {
    private String modelName = "Escape";
    public static void main(String[] args) {
        Car targetCar = new Car();
        targetCar.honkSound();
        System.out.println(targetCar.carMake + " " + targetCar.modelName);
    }
}