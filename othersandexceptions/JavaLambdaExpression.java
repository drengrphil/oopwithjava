import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaLambdaExpression {
    // Lambda expression is a short block of code which takes in parameters and return a value.
    // Unlike method, lambda expression do not need a name and can be implemented in the body
    // of a method.
    // Format: (parameter1, parameter2) -> expression
    // (parameter1, parameter2) -> { code block }
    public static void main(String[] args) {
        ArrayList<Integer> numGenerated = new ArrayList<Integer>();
        numGenerated.add(3);
        numGenerated.add(10);
        numGenerated.add(15);
        numGenerated.add(11);

        // Lambda Expression
        numGenerated.forEach( (n) -> { System.out.println(n); } );

        // Storing lambda expressions in variables, if the variable's type is an interface
        // with only one method. The Lambda expression should have same number of parameters
        // and same return type.
        Consumer<Integer> lambdaMethod = (n) -> { System.out.println(n); };
        numGenerated.forEach(lambdaMethod);

        // Using Lambda expression in a method: the method should have a parameter
        // with a single-method interface as its type. Calling the interface's method
        // will run the lambda expression.
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
    }

    interface StringFunction {
        String run(String strg);
    }

    public static void printFormatted(String inStr, StringFunction formatMethod){
        String outStr = formatMethod.run(inStr);
        System.out.println(outStr);
    }
}
