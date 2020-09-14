public class WrapperClassEx {
    public static void main(String[] args) {
        // Wrapper classes provide a way to use primitive data types
        //   objects.
        // Wrapper objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Useful methods on wrapper objects
        // intValue(), byteValue(), shortValue(), longValue(), 
        // floatValue(), doubleValue(), charValue(), booleanValue()
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString on wrapper object
        String myString = myInt.toString();
        System.out.println(myString);
    }
}
