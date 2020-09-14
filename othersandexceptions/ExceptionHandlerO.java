public class ExceptionHandlerO {
    public static void main(String[] args) {
        // try statement allows you to define a block of code
        // to be tested for errors while executing
        // catch statement allows you to define block of code
        // to execute when error occurs
        try{
            System.out.println("Has error occured?");
        }catch(Exception ex){
            // Handle error
            System.out.println("Error Occur in DB Connection");
        }

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Error Printing Requested Element");
        }

        // finally statement: lets you execute code after try..catch block
        // regardless of the result
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Error but execute finally block");
        } finally {
            System.out.println("End of try and catch.");
        }

        // Use throw keyword
        CheckStudentAge(15);
    }

    // The throw keyword
    // throw keyword: allows the creation of a custom error.
    // It is used together with exception type as follows:
    // ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, 
    // SecurityException etc
    static void CheckStudentAge(int age){
        if (age < 18){
            throw new ArithmeticException("Can't buy smoke");
        } else {
            System.out.println("Purchase successful");
        }
    }
}
