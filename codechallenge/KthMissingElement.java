class KthMissingElement {
    public int findMissingElement(int[] inputArray, int k){
        int diff = 0, res = 0, count = k;
        boolean flag = false;

        for (int i = 0; i < inputArray.length; i++){
            diff = 0;
            // Is ith and (i+1)-th consecutive elements
            if ( (inputArray[i] + 1) != inputArray[i + 1]){
                diff += (inputArray[i+1] - inputArray[i]) - 1;
            }

            // Check for difference and given k
            if (diff >= count){
                res = inputArray[i] + count;
                flag = true;
                break;
            } else {
                count -= diff;
            }
        }

        if (flag){
            return res;
        } else {
            return -1;
        }
    }
}
