import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class CodingProblems {
    // Union of Two Arrays
    public void UnionOfTwoArrays(int[] firstNumArray, int[] secondNumArray){
        System.out.println("Solves Union of Two Arrays:");
        // Set to store unique element
        final HashSet<Integer> uniqueElements = new HashSet<Integer>();

        // Resultant union
        int requiredSize = firstNumArray.length + secondNumArray.length;
        int[] unionArray = new int[requiredSize];

        // Store the entire first array
        for (int k = 0; k < firstNumArray.length; k++){
            // System.out.println(firstNumArray[k]);
            // unionArray[k] = firstNumArray[k];
            uniqueElements.add(firstNumArray[k]);
        }

        // Check and add element not yet in union
        for (int j = 0; j < secondNumArray.length; j++){
            if (!uniqueElements.contains(secondNumArray[j])){
                uniqueElements.add(secondNumArray[j]);
            }
        }

        // Final Union
        int indx = 0;
        for (Integer val : uniqueElements){
            unionArray[indx] = val;
            System.out.print(val + " ");
        }
        System.out.println("");
    }

    // Two sum problem
    public int[] TwoSumProblems(int[] numArray, int targetValue){
        System.out.println("Solves Two Sum problem:");
        // Visited elements
        HashMap<Integer, Integer> visitedElements = new HashMap<Integer, Integer>();
        // indices of elements that sum up to targetValue
        int[] resultIndices = new int[2];
        for (int i = 0; i < numArray.length; i++){
            int indx = 0;
            int diffVal = targetValue - numArray[i];
            if (visitedElements.containsKey(diffVal)){
                resultIndices[indx] = visitedElements.get(diffVal);
                resultIndices[indx+1] = i;
                return resultIndices;
            }
            visitedElements.put(numArray[i], i);
        }
        return resultIndices;
    }

    // BubbleSort Implementation
    static void SwapOperation(int[] inputArray, int indx){
        int tempVal = inputArray[indx];
        inputArray[indx] = inputArray[indx+1];
        inputArray[indx+1] = tempVal;
    }

    public void BubbleSort(int[] inputArray){
        System.out.println("Bubble Sort:");
        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length-i-1; j++){
                if (inputArray[j] > inputArray[j+1]){
                    SwapOperation(inputArray, j);
                }
            }
        }
    }
}