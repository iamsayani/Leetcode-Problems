class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while( i <= nums.length - 1){
            int correct = nums[i] - 1;
            if (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i,  correct);
            }else {
                i++;
            }
        }
        for(int index = 0 ; index <= nums.length - 1 ; index++){
            if (nums[index] != (index + 1)){
                result.add(index + 1);
            }

        }
        return result;
    }
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}