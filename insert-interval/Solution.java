class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) {
            int[][] ans = new int[1][2];
            ans[0] = newInterval;
            return ans;
        }
        if(newInterval[1] < intervals[0][0]) {
            int[][] ans = new int[intervals.length + 1][2];
            ans[0] = newInterval;
            for(int i = 0; i < intervals.length; i++) {
                ans[i+1] = intervals[i];
            } 
            return ans;
        }
        if(newInterval[0] > intervals[intervals.length-1][1]) {
            int[][] ans = new int[intervals.length + 1][2];
            for(int i = 0; i < intervals.length; i++) {
                ans[i] = intervals[i];
            } 
            ans[intervals.length] = newInterval;
            return ans;
        }
        int iterator = 0;
        List<List<Integer>> answer = new ArrayList();
        while(iterator < intervals.length && intervals[iterator][1] < newInterval[0]){
            List<Integer> arr = new ArrayList();
            arr.add(intervals[iterator][0]);
            arr.add(intervals[iterator][1]);
            answer.add(arr);
            iterator++;
        }
        List<Integer> overlappedInterval = new ArrayList();
        overlappedInterval.add(Math.min(intervals[iterator][0], newInterval[0]));
        while(iterator < intervals.length && intervals[iterator][0] <= newInterval[1]) {
            iterator++;
        }
        overlappedInterval.add(Math.max(intervals[iterator-1][1], newInterval[1]));
        answer.add(overlappedInterval);
        while(iterator < intervals.length) {
            List<Integer> arr = new ArrayList();
            arr.add(intervals[iterator][0]);
            arr.add(intervals[iterator][1]);
            answer.add(arr);
            iterator++;
        }
        int[][] ans = new int[answer.size()][2];
        for(int i = 0; i<ans.length; i++) {
            ans[i][0] = answer.get(i).get(0);
            ans[i][1] = answer.get(i).get(1);
        }
        return ans;
    }
}