class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
                int subSetCount = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if (sum/k >= threshold)
            subSetCount++;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            if (sum/k >= threshold)
                subSetCount++;
        }
        
        return subSetCount;
    }
}