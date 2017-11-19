/* Difficulty: medium
 *
 * Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
 *
 * Example 1:
 * Input:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 *
 * Output: 3
 * 
 * Explanation: 
 * The repeated subarray with maximum length is [3, 2, 1].
 * 
 * Note:
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
*/

class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] matrix = new int[n][m];
        int ans=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(A[i]==B[j]) {
                    if(i>0 && j>0)
                        matrix[i][j] = matrix[i-1][j-1] + 1;
                    else
                        matrix[i][j] = 1;
                }
                ans = Math.max(ans,matrix[i][j]);
            }
        }
        return ans;
    }
}