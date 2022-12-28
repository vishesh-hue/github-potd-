class Solution {
    public int minStoneSum(int[] piles, int k) {
        int[] frequency = new int[10001];
        int max = -1;
        for (int p : piles) {
            frequency[p]++;
            max = Math.max(max, p);
        }
        for (int i = max; i >= 1 && k > 0; i--) {
            while(frequency[i] != 0 && k > 0) {
                frequency[i]--;
                frequency[(i+1)/2]++;
                k--;
            }
        }
        int ans = 0;
        for (int i = max; i > 0; i--) {
            ans += frequency[i] * i;
        }
        return ans;
    }
}
