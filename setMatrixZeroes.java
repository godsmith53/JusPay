/* Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r:row){
            for(int i=0;i<matrix[0].length;i++){
                matrix[r][i]=0;
            }
        }
        for(int c:col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][c]=0;
            }
        }
    }
}