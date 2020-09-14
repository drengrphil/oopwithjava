/*
 * Java is good for;
 *     1. Mobile applications (e.g Android)
 *     2. Desktop applications, Web applications
 *     3. Web servers and app servers
 *     4. Game and Database Connection
 * Primitive Data types:
 * | Type |   Size   |     Stores      |
 *  byte    1 byte    whole numbers (-128 to 127)
 *  short   2 bytes   whole numbers (-32,768 to 32,767)
 *  int     4 bytes   whole numbers ( -2,147,483,648 to 2,147,483,647 )
 *  long    8 bytes   whole numbers ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 )
 * 
 *  float   4 bytes   Fractional numbers --> 6 to 7 decimal digits
 *  double  8 bytes   Fractional numbers --> 15 decimal digits
 * 
 *  boolean 1 bit     true or false values
 *  char    2 bytes   Stores a single character/letter or ASCII values
 * 
 * Non-primitive Data Types:
 *    Strings, Arrays, Classes, Interface etc
 * Size of primitive type depends on the data type while non-primitive types have same size.
 */
public class dataandtypes {
    // Main method
    public static void main(String[] args){
        // Variables
        String studentFirstName = "John";
        String studentLastName = " Doe";
        String studentFullName = studentFirstName + studentLastName;
        int studentAge = 15;
        char passingGrade = 'A';
        boolean studentPass = false;
        float classAverage = 10.99f;
        // Using final keyword to overwriting existing values.
        final int numOfStudents = 500;

        System.out.println("Student Name: " + studentFullName);
        // System.out.println(studentAge);
        // System.out.println(numOfStudents);

        // Integer Types
        final byte salaryPerHr    = 120; // whole number -128 to 127
        final byte totalHrsPerWeek = 8;
        final short salaryPerWeek = 120 * 8;
        final int annualSalary = 100000;
        final long salaryThroughoutLife = 15000000000L;

        // Floating Point Types
        float averageAge = 5.75f;
        double averageAgeAtTeen = 19.99d;
        // Scientific notation
        final float expScore = 35e3f;
        final double expScoreIn = 12E4d;
        System.out.println("Scientfic Float: " + expScore);
        System.out.println("Scientific Double: " + expScoreIn);

        // Boolean
        boolean isRiceWellCooked = false;
        boolean isAgeRelevant = true;
        System.out.println(isRiceWellCooked);
        System.out.println(isAgeRelevant);

        // Character
        char finalGrade = 'A';
        System.out.println(finalGrade);

        /* 
         * Type Casting
         * Assigning a value of one primitive data type to another type.
         * Widening Casting (automatically) coverting smaller type to larger type size
         * byte -> short -> char -> int -> long -> float -> double
         * Narrowing Casting (manually) converting larger type to small type
         * double -> float -> long -> int -> char -> short -> byte
         */
        // Widening casting
        int testInt = 10;
        double doubleInt = testInt; // Automatic Casting int to double
        System.out.println(testInt); // 10
        System.out.println(doubleInt); // 10.0

        // Narrowing Casting
        double testDouble = 9.78;
        int intDouble =  (int) testDouble; // Manual Casting double to int
        System.out.println(testDouble); // 9.78
        System.out.println(intDouble); // 9

        /* Strings */
        String welcomeNote = "Welcome Home";
        System.out.println("Length of welcome message: " + welcomeNote.length());
        System.out.println("Uppercase: " + welcomeNote.toUpperCase());
        System.out.println("Lowercase: " + welcomeNote.toLowerCase());
        System.out.println("Index location of H: " + welcomeNote.indexOf("H")); // index 7
        // Concatenate
        String firstString = "Welcome";
        String secondString = "Home";
        System.out.println(firstString + " " + secondString);
        System.out.println(firstString.concat(secondString));

        /* Special Characters in String */
        /* Other chars \n, \r, \t, \b, \f */
        String strWithSpecialChar = "We are good \"People\" from heaven. ";
        String strWithSpecialChar2 = "Kunle\'s brother coming home.";
        System.out.println(strWithSpecialChar + strWithSpecialChar2);

        /* Operators */
        int sumRes = 100 + 240; // 340
        int val1 = 100, val2 = 11;
        int resVal = val1 % val2;
        System.out.println(sumRes);
        System.out.println(resVal);

        if (studentPass && val2 > val1){
            System.out.println("Passed");
        } else if (val2 > val1){
            System.out.println("Try Again!");
        } else if (studentPass || val1 > val2){
            System.out.println("Passed with condition");
        }
        
        /* 
         * Java Bitwise Operators
         */
        // & (AND operation) 5 & 1
        //     0101 
        //   & 0001 = 0001 (Decimal = 1)
        System.out.println(5 & 1);

        // | (OR operation) 5 | 1
        //     0101 
        //   | 0001 = 0101 (Decimal = 5)
        System.out.println(5 | 1);

        // ~ (NOT operation) - Inverts all the bits
        // ~5 = ~0101 = 1010 (Decimal = 10)
        System.out.println(~5);

        // ^ (XOR operation) 5 ^ 1
        //     0101 
        //   ^ 0001 = 0100 (Decimal = 4)
        System.out.println(5 ^ 1);

        // <<, 9 << 1, 1001 << 1 = 0010 (Decimal = 2)
        // Zero-fill left shift - Shift left by pushing
        // zeroes in from the right and letting the leftmost
        // bits fall off.
        System.out.println(9 << 1);

        // >>, 9 >> 1, 1001 >> 1 = 1100 (Decimal = 12)
        // Zero-fill right shift - Shift left by pushing
        // zeroes in from the right and letting the rightmost
        // bits fall off.
        System.out.println(9 >> 1);

        /* Math */
        System.out.println(Math.max(5, 10)); // Max
        System.out.println(Math.min(5, 10)); // Min
        System.out.print(Math.sqrt(4)); // 16
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random()); // Random
        int randNumber = (int)(Math.random() * 101) ;  // Random between 0 to 100
        System.out.println("Random Number: " + randNumber);

        /* Switch Case */
        int month = 13;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unknown Month");
        }

        /* while loop */
        int num = 10;
        while (num > 0){
            System.out.print(" " +num);
            num--;
        }
        System.out.println("");

        int countDwn = 10;
        do{
            // Executed before condition is checked.
            System.out.print(" " +countDwn);
            countDwn--;
        }while (countDwn > 0);

        System.out.println("");
        for (int k = 0; k < 5; k++){
            System.out.print(" " +k);
        }
        System.out.println("");
        
        // For each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String ch : cars){
            System.out.println(ch);
        }

        /* Arrays */
        String[] newerCars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] studentScores = {100, 67, 95, 85, 78};
        System.out.println("Winner: " + newerCars[0] + " for student with score " + studentScores[0]);
        // Change item
        newerCars[0] = "Uber Electric";
        System.out.println("Winner: " + newerCars[0] + " for student with score " + studentScores[0]);
        System.out.println("Num Cars: " + newerCars.length);
        for (int i = 0; i < newerCars.length; i++){
            System.out.println(newerCars[i]);
        }
        // For-each loop
        for (String ch : newerCars){
            System.out.println(ch);
        }

        /* Multi-Dimensional Array */
        int [][] studentsAgeScore = { {1, 2, 3, 4}, {5, 6, 7} };
        int oneSt = studentsAgeScore[1][2]; // Row = 1, Col = 2
        System.out.println(oneSt);
        for (int i = 0; i < studentsAgeScore.length; i++){
            for (int j = 0; j < studentsAgeScore[i].length; j++){
                System.out.println(studentsAgeScore[i][j]);
            }
        }

        // Method called
        exampleMethod();
        printStudentName("James Doe", 100);
        printStudentName("Helen Paul", 85);
        int finalScore = studentAugmentedScore(43);
        System.out.println("Final Score: " + finalScore);
        int resultAdd = additionUsing(2, 2);
        System.out.println("Result addition using int: " + resultAdd);
        double resultAddD = additionUsing(2.0, 2.0);
        System.out.println("Result addition using double: " + resultAddD);
        int resValRec = sumRecursion(2);
        System.out.println(resValRec);

    }

    // Methods
    static void exampleMethod(){
        System.out.println("Method executed.");
    }

    static void printStudentName(String studentName, int studentScore){
        System.out.println("Name: " + studentName + " | Score: " + studentScore);
    }

    static int studentAugmentedScore(int studentActualScore){
        return studentActualScore + (studentActualScore * 2);
    }

    // Method overloading
    static int additionUsing(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    static double additionUsing(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    // Recursion
    public static int sumRecursion(int val){
        System.out.println(val);
        if (val > 0){
            return (val + sumRecursion(val - 1));
        } else {
            return 0;
        }
    }
}