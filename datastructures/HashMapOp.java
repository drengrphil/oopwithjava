import java.util.HashMap;


public class HashMapOp {
    // HashMap stores key/value pairs
    // One object is used as a key (index) to another object (value)
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<String, String>();

        // Add key values pairs
        countryCapitals.put("England", "London");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Nigeria", "Abuja");
        countryCapitals.put("Kenya", "Nairobi");
        countryCapitals.put("Norway", "Oslo");
        countryCapitals.put("Finland", "Helsinki");

        // Access an item
        System.out.println("Canada: " + countryCapitals.get("Canada"));
        
        // Remove an item
        countryCapitals.remove("Kenya");

        // Loop through to print keys
        for (String country : countryCapitals.keySet()){
            System.out.print(country + " ");
        }
        System.out.println("");

        // Loop through to print values
        for (String capital : countryCapitals.values()){
            System.out.print(capital + " ");
        }
        System.out.println("");

        // Size
        System.out.println("Map Size: " + countryCapitals.size());

        // Loop through to print key and value
        for (String country : countryCapitals.keySet()){
            System.out.println("Country as key: " + country +
                " Capital as value: " + countryCapitals.get(country));
        }

        // Clear all
        countryCapitals.clear();

        // Other types
        HashMap<String, Integer> studentRecord = new HashMap<String, Integer>();
        studentRecord.put("Joshua", 89);
        studentRecord.put("Aminat", 100);
        studentRecord.put("Phillip", 100);
        studentRecord.put("Ayodeji", 97);

        System.out.println("---------------***----------");
        for (String student : studentRecord.keySet()){
            System.out.println("Student: " + student + " Grade:" + studentRecord.get(student));
        }
    }
}
