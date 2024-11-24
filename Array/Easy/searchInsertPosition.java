class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -999;
    }
}
//we iterate through each element in array 
//if the target value found in array 
//return its index 
//otherwise retuen -999
