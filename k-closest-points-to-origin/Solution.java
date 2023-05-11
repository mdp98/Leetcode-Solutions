class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<Integer> pq = new PriorityQueue();
        HashMap<Integer, List<Integer>> distanceToIndexMap = new HashMap();
        for(int i=0; i<points.length; i++) {
            int distance = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            List<Integer> indicesArr = distanceToIndexMap.get(distance);
            if(indicesArr == null) {
                indicesArr = new ArrayList();
            }
            indicesArr.add(i);
            distanceToIndexMap.put(distance, indicesArr);
            pq.add(distance);
        }
        int pointer = 0;
        while(pointer < k) {
            int distance = pq.poll();
            List<Integer> indices = distanceToIndexMap.get(distance);
            for(Integer index : indices) {
                ans[pointer][0] = points[index][0];
                ans[pointer][1] = points[index][1];
                pointer++;
            }
        }
        return ans;
    }
}