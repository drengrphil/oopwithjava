// Nested classes

// Outerclass
class OuterClassExample {
    int typeID = 1;
    public void printClassType(){
        System.out.println("Outerclass called");
    }
    // Inner class
    class InnerClass{
        int typeID = 2;
        public void printClassType(){
            System.out.println("Innerclass called");
        }
    }
}