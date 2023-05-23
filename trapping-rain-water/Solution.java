class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int max = 0;
        int[] levels = new int[height.length];
        for(int i=0; i<height.length; i++) {
            if(height[i] >= max) {
                max = height[i];
                levels[i] = 0;
            } else {
                levels[i] = max - height[i];
            }
        }
        max = 0;
        for(int i = height.length-1; i>=0; i--) {
            if(height[i] >= max) {
                max = height[i];
            } else {
                ans += Math.min(levels[i], max - height[i]);
            }
        }
        return ans;
    }
}