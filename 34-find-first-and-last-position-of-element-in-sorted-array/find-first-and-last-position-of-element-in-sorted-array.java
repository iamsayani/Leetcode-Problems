class Solution {
    public int[] searchRange (int[]nums, int target) {
		int[] ans = {-1,-1}; 
		int start = findSearch(nums, target, true);
		int end = findSearch(nums, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
		
	}
	public int findSearch(int[]nums, int target, boolean findIndex) {
		int ans = -1;
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start)/2;
			if (nums[mid]< target) {
				start = mid + 1;
			}else if (nums[mid] > target) {
				end = mid -1;
			}else {
				ans = mid;
				if (findIndex == true) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return ans;	
	}
}      
