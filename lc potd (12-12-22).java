class Solution {
    public int minFallingPathSum(int[][] A) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i > 0) {
                    int prevMin = A[i-1][j];
                    for (int k = j - 1; k <= j + 1; k++) {
                        if (k >= 0 && k < A[0].length)
                            prevMin = Math.min(prevMin, A[i-1][k]);
                    }
                    A[i][j] += prevMin;
                }
                // calculate the min sum from last row
                if (i == A.length - 1) {
                    min = Math.min(min, A[i][j]);
                }
            }
        }
        return min;
    }
}
