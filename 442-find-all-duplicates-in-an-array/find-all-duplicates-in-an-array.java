class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> result = new ArrayList<>();
       int n = nums.length;
        int i = 0;
        while( i <= n - 1){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i,  correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != (index+1)){
                result.add(nums[index]);
            }
        }
        return result;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    } 
}