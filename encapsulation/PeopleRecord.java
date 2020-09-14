import java.util.Scanner; // class in a package

public  class PeopleRecord {
    public static void main(String[] args) {
        Person personRecord = new Person();
        Scanner inputScan = new Scanner(System.in);
        // Age
        System.out.println("Enter your age: ");
        int personAge = inputScan.nextInt();
        inputScan.nextLine(); // Consume blank space
        // Name
        System.out.println("Enter your name: ");
        String personName = inputScan.nextLine();
        
        personRecord.setPersonName(personName);
        personRecord.setPersonAge(personAge);

        System.out.println(personRecord.getPersonAge());
        System.out.println(personRecord.getPersonName());
    }
}