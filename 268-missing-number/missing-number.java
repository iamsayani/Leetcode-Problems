class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int idealSum = len * (len + 1)/2;
        for(int i = 0; i<len; i++){
            sum += nums[i];
        }
        int missing = idealSum - sum;
        return missing;
    }
}