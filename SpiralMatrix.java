/* Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        List<Integer> res = new ArrayList<Integer>();

        // corner case : only row
        if(bottom==0) {
            for(int i=0; i<=right; i++) {
                res.add(matrix[0][i]);
            }
            return res;
        }

        // corner case : only column
        if(right==0) {
            for(int i=0; i<=bottom; i++) {
                res.add(matrix[i][0]);
            }
            return res;
        }

        while(top<=bottom && left<=right) {
            
            //top row
            for(int i=left; i<=right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // right column
            for(int i=top; i<=bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            //bottom row in reverse
            if(top<=bottom) {
                for(int i=right; i>=left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left column in reverse
            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
        
    }
}