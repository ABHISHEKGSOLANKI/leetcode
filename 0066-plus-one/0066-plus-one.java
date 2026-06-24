class Solution {
    public int[] plusOne(int[] nums) {
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] < 9) {
            nums[i]++;
            return nums;
        }
        nums[i] = 0;
    }

    int[] nums1 = new int[nums.length + 1];
    nums1[0] = 1;
    return nums1;
    }
}