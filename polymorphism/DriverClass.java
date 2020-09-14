class DriverClass {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();

      // Inner class
      OuterClassExample outerClass = new OuterClassExample();
      OuterClassExample.InnerClass innerClass = outerClass.new InnerClass();
      outerClass.printClassType();
      innerClass.printClassType();
      System.out.println(outerClass.typeID + innerClass.typeID);
    }
}