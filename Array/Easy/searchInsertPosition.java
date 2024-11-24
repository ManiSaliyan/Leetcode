class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(i==(nums.length-1)){
                if(target>nums[nums.length-1]) return i+1;
            }
            if(nums[i]<target) continue;
            else return i;
        }
        return -999;
    }
}

the problem is given a sorted Array
    if i want to insert a new element
    after inserting the element should be in sorted order only
    we Should return the index at which the item can be inserte




    
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
