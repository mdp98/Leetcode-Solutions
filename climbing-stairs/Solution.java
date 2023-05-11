class Solution {
    public int climbStairs(int n) {
        int low = 1;
        int high = 1;
        n = n-1;
        while(n > 0) {
            high = low + high;
            low = high - low;
            n--;
        }
        return high;
    }
}