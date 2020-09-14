import java.util.ArrayList;

public class CodingProblemsDriver {
    public static void main(String[] args) {
        CodingProblems codingProblems = new CodingProblems();

        // Union of two arrays
        int[] firstNumArray = new int[] {1, 2, 3, 6, 9};
        int[] secondNumArray = new int[] {5, 4, 7};
        codingProblems.UnionOfTwoArrays(firstNumArray, secondNumArray);

        // Two sum problem
        int[] twoSumResult;
        int targetValue = 7;
        twoSumResult = codingProblems.TwoSumProblems(firstNumArray, targetValue);
        for (int k = 0; k < twoSumResult.length; k++){
            System.out.print(twoSumResult[k] + " ");
        }
        System.out.println("");

        // Bubble Sort
        int[] unsortedArray = new int[] {10, 5, 1, 3, 9, 8};
        System.out.print("Unsorted Array: ");
        for (int k = 0; k < unsortedArray.length; k++){
            System.out.print(unsortedArray[k] + " ");
        }
        System.out.println("");

        codingProblems.BubbleSort(unsortedArray);
        System.out.print("Sorted Array: ");
        for (int k = 0; k < unsortedArray.length; k++){
            System.out.print(unsortedArray[k] + " ");
        }
        System.out.println("");

        // Kth Maximum Element in array
        // Implemented using maximum priority queue
        kthMaximumElement kMax = new kthMaximumElement();
        int[] inputArray = {3,2,3,1,2,4,8,5,6};
        int kth = 4;
        int result = kMax.largestElement(inputArray, kth);
        System.out.println("Kth Largest is: " +result);

        // Top k maximum elements in array
        System.out.println("Top kth maximum in array");
        kthMaximumElement ktopMax = new kthMaximumElement();
        ArrayList<Integer> topMaxList = new ArrayList<Integer>();
        int numTopMax = 5;
        topMaxList = ktopMax.findKTopElements(inputArray, numTopMax);
        for (Integer val : topMaxList){
            System.out.print(val + " ");
        }
        System.out.println("");

        // Is LinkedList palidrome
        System.out.println("Is LinkedList palidrome:");
        LinkedListIsPalindrome llPalidrome = new LinkedListIsPalindrome();
        if (llPalidrome.isPalindrome()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // Another method
        if (llPalidrome.isPalindrome(true)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Method 2: Is LinkedList palidrome
        /*LinkedListIsPalindrome llPalidromeTwo = new LinkedListIsPalindrome();
        char inputStr[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
        // String inStr = new String(inputStr);
        for (int i = 0; i < inputStr.length - 1; i++){
            llPalidromeTwo.pushToNodeList(inputStr[i]);
            llPalidromeTwo.printNodeLists(llPalidromeTwo.headChar);
            if (llPalidromeTwo.isPalindrome(llPalidromeTwo.headChar) != false){
                System.out.println("Is Palindrome"); 
                System.out.println("");
            } else {
                System.out.println("Not Palindrome"); 
                System.out.println(""); 
            }
        }*/

        // Kth Missing element
        System.out.println("Kth Missing Element:");
        int[] inArray = {1, 5, 11, 19};
        int k = 11;
        KthMissingElement kthMiss = new KthMissingElement();
        int kMissing = kthMiss.findMissingElement(inArray, k);
        System.out.println(kMissing + " is missing.");

        // Sliding Window Maximum of subarray K
        System.out.println("Sliding Window Maximum of subarray K:");
        SlidingWindowMax slidMax = new SlidingWindowMax();
        slidMax.findMaxOfContiquousSubArray(inArray, 3);

        // Closest pairs
        int firstArray[] = {1, 4, 5, 7}; 
        int secondArray[] = {10, 20, 30, 40};
        int numX = 38;
        slidMax.findClosetPairs(firstArray, secondArray, numX);

        // Depth of a binary tree
        TwoCousinsBinaryTree treeN = new TwoCousinsBinaryTree();
        System.out.println("Max Depth: " + treeN.calculateDepthOfTree(treeN.root));

        // Are nodes cousins?
        boolean cousin = treeN.CousinNodes(treeN.root, treeN.root.left.left, treeN.root.right);
        System.out.println("Cousin? : " + cousin);
    }
}