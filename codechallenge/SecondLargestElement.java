public class SecondLargestElement {
    public static void main(String[] args) {
        int[] inputArray1 = {1, 2, 6, 7, 8, 10};
        int[] inputArray2 = {13, 15, 16, 7, 9, 20};
        System.out.println("Second Largest: " + ArraySecondLargestElement(inputArray1));
        System.out.println("Second Largest: " + ArraySecondLargestElement(inputArray2));
    }

    public static int ArraySecondLargestElement(int[] inputArray){
        int tempMax = 0;
        for (int i = 0; i < inputArray.length; i++){
            for (int j = i + 1; j < inputArray.length; j++){
                if (inputArray[i] > inputArray[j]){
                    tempMax = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = tempMax;
                }
            }
        }
        return inputArray[inputArray.length - 2];
    }
}
