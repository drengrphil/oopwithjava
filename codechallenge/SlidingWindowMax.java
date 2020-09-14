class SlidingWindowMax {
    // Find the maximum of every contiguous subarray of size k
    // from a given array.
    // Using two pointers approach
    public void findMaxOfContiquousSubArray(int[] inputArray, int k){
        if (k == 1){
            for (int i = 0; i < inputArray.length; i++){
                System.out.println(inputArray[i] + " ");
            }
        }

        // Using two pointers
        int begin = 0, end = k - 1, t = begin, max = inputArray[k - 1];
        while ( end <= inputArray.length - 1){
            if (inputArray[begin] > max){
                max = inputArray[begin];
            }

            begin += 1;

            if (begin == end && begin != inputArray.length){
                System.out.println(max + " ");
                end++;
                begin = ++t;

                if (end < inputArray.length){
                    max = inputArray[end];
                }
            }
        }
    }

    // Find the closest pair from two sorted arrays
    /*
     *
     * Given two sorted arrays and a number x, find the pair whose sum is
     * closest to x and the pair has element from each array
     * 
     */
    public void findClosetPairs(int[] firstArray, int[] secondArray, int numX){
        // Difference between pair sum and numX
        int diffVal = Integer.MAX_VALUE;
        int firstArrayIndx = 0, secondArrayIndx = 0;
        
        // Start from left of firstArray and right of secondArray
        int l = 0, r = secondArray.length - 1;
        while ( l < firstArray.length && r >= 0){
            // If this pair is closer to numX than previous value, update
            // diffVal, firstArrayIndx, and secondArrayIndx.
            if (Math.abs(firstArray[l] + secondArray[r] - numX) < diffVal){
                firstArrayIndx = l;
                secondArrayIndx = r;
                diffVal = Math.abs(firstArray[l] + secondArray[r] - numX);
            }

            // Sum is more than numX, move to smaller size
            if (firstArray[l] + secondArray[r] > numX){
                r--;
            } else {
                l++;
            }
        }

        // Result
        System.out.println("Matching pair: [" + firstArray[firstArrayIndx] + ", " 
            + secondArray[secondArrayIndx] + "]");
    }
}
