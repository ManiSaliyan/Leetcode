class Solution {
    public void sortColors(int[] nums) {
        int i,j;
        int n = nums.length;
     for(i=0;i<n;i++){
         for(j=i+1;j<n;j++){
             if(nums[i]>nums[j]){
                 int temp =nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
             }
         }
     }
        System.out.print("[");
        for(i=0;i<n;i++){
            if(i==n-1){
                System.out.print(nums[i]);

        }else System.out.print(nums[i]+",");
    }
}
}







Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
