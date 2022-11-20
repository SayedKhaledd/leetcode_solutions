class Solution {
    public int search(int[] nums, int target) {
           int high = nums.length-1, low = 0;
        int index = -1;
        while (low<=high) {
   int mid = (high+low) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else
                low = mid+1;
        }
        return index;
    }
}