class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] targetSumIndicesPair = new int[2];
        HashMap<Integer, Integer> requiredNumToIndexMap = new HashMap();
        for(int iterator = 0; iterator < nums.length; iterator++) {
            if(requiredNumToIndexMap.containsKey(nums[iterator])) {
                targetSumIndicesPair[0] = requiredNumToIndexMap.get(nums[iterator]);
                targetSumIndicesPair[1] = iterator;
                return targetSumIndicesPair;
            }
            requiredNumToIndexMap.put(target-nums[iterator], iterator);
        }
        return targetSumIndicesPair;
    }
}