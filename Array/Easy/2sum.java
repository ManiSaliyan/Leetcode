class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,got=0,flag=0,arlen=nums.length,a=0,b=0;
        while(flag!=1){
            for(i=0;i<arlen;i++){
                for(j=0;j<arlen;j++){
                    if(i==j){
                        continue;
                    }else{
                        if((nums[i]+nums[j])==target){
                            a=j;
                            b=i;
                            got=1;
                         }
                    }
            }
        }
        if(i==arlen) flag=1;
    }
    if(got==1){
        int co[] = {a,b};
        return co;
    }else{
        int co[] = {0,0};
        return co;
    }
  }
}
public class Main{
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;
        Solution solution= new Solution();
        int inde[] = solution.twoSum(arr, target);
        if(inde[0]==0&&inde[1]==0) System.out.println("Not Found!");
        else System.out.println("["+inde[0]+","+inde[1]+"]");
     }
}





Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
