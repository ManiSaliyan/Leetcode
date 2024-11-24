class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        int n = matrix.length;
        int found=0;
        for(i=0;i<n;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target) found =1;
            }
        }
        if(found==1) return true;
        else return false;
    }
}






You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
