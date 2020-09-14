import java.util.HashSet;
import java.util.Iterator;

public class HashSetOp {
    public static void main(String[] args) {
        HashSet<String> uniqueCars = new HashSet<String>();
        uniqueCars.add("Volvo");
        uniqueCars.add("Kia");
        uniqueCars.add("BMW");
        uniqueCars.add("Ayokele");

        System.out.println(uniqueCars);

        // Loop through
        System.out.println("Loop:");
        for (String car : uniqueCars){
            System.out.print(car + " ");
        }
        System.out.println("");

        // Check existence of an element
        boolean carAvailable = uniqueCars.contains("Ayokele");
        if (carAvailable){
            System.out.println("Ayokele is in stock.");
        }

        // Remove
        uniqueCars.remove("BMW");
        carAvailable = uniqueCars.contains("BMW");
        if (carAvailable){
            System.out.println("BMW is in stock.");
        } else {
            System.out.println("BMW is not in stock.");
        }

        // Clear all
        uniqueCars.clear();
        System.out.println(uniqueCars);

        // Size
        System.out.println("Size after deleting: " + uniqueCars.size());

        // Integer type
        HashSet<Integer> priceListing = new HashSet<Integer>();
        priceListing.add(15000);
        priceListing.add(17000);
        priceListing.add(18500);
        priceListing.add(21000);

        int[] bidPrice = new int[] {15500, 17000, 19000, 21000};

        for (int i = 0; i < bidPrice.length; i++){
            if (priceListing.contains(bidPrice[i])){
                System.out.println("Price Matched: " + bidPrice[i]);
            } else {
                System.out.println("No Price Matched for : " + bidPrice[i]);
            }
        }
        
        // Java iterator can be used to loop through a collection
        Iterator<Integer> priceIterator = priceListing.iterator();
        // First item
        System.out.println(priceIterator.next());
        // Print remaining element
        while (priceIterator.hasNext()){
            System.out.println(priceIterator.next());
        }
    }
}
