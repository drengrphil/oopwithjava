import java.util.ArrayList;
import java.util.Collections; // Sort ArrayList

public class ArrayListOp {
    public static void main(String[] args) {
        ArrayList<String> carsList = new ArrayList<String>();
        carsList.add("Kia");
        carsList.add("Dodge");
        carsList.add("Ford");
        carsList.add("Mazda");

        System.out.println(carsList);

        // Access element
        String carName = carsList.get(1);
        System.out.println(carName);

        // Change Item
        carsList.set(1, "Toyota");
        System.out.println(carsList);

        // Remove an item
        carsList.remove(0);
        System.out.println(carsList);

        // Size
        System.out.println(carsList.size());

        // Loop through
        for (int k = 0; k < carsList.size(); k++){
            System.out.print(carsList.get(k) + " ");
        }
        System.out.println("");
        // Or use for-each loop
        System.out.println("Using for-each:");
        for (String st : carsList){
            System.out.print(st + " ");
        }
        System.out.println("");

        // Sorting
        System.out.println("Sorted String list: ");
        Collections.sort(carsList);
        System.out.println(carsList);

        // Clear the list
        carsList.clear();
        System.out.println("After clearing List:");
        System.out.println(carsList);

        // int type
        ArrayList<Integer> carsPrices = new ArrayList<Integer>();
        carsPrices.add(15000);
        carsPrices.add(25000);
        carsPrices.add(14000);
        carsPrices.add(35000);
        System.out.println("int ArrayList: ");
        System.out.println(carsPrices);
        System.out.println("Sorting List: ");
        Collections.sort(carsPrices);
        System.out.println(carsPrices);
    }
}
