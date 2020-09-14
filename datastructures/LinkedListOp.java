import java.util.LinkedList;

public class LinkedListOp {
    public static void main(String[] args) {
        LinkedList<String> carsList = new LinkedList<String>();
        carsList.add("Volvo");
        carsList.add("Mazda");
        carsList.add("Ford");
        carsList.add("BMW");
        carsList.add("Kia");
        System.out.println(carsList);

        // Methods
        carsList.addFirst("Toyota"); // Add element at the beginning of the list.
        carsList.addLast("Benz"); // Add element at the end of the list.
        System.out.println(carsList);
        System.out.println("Remove first and last: ");
        carsList.removeFirst(); // Remove an item from the beginning of the list.
        carsList.removeLast(); // Remove an item from the end of the list.
        System.out.println(carsList);
        System.out.println("First Element: " + carsList.getFirst());
        System.out.println("Last Element: " + carsList.getLast());
    }
}
