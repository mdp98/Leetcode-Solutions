class MedianFinder {
    int divider;
    PriorityQueue<Integer> higherQueue;
    PriorityQueue<Integer> lowerQueue;

    public MedianFinder() {
        divider = 0;
        higherQueue = new PriorityQueue();
        lowerQueue = new PriorityQueue<Integer>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        if(num >= divider) {
            higherQueue.add(num);
        } else {
            lowerQueue.add(num);
        }
        if(Math.abs(higherQueue.size() - lowerQueue.size()) > 1) {
            if(higherQueue.size() > lowerQueue.size()) {
                lowerQueue.add(higherQueue.poll());
            } else {
                higherQueue.add(lowerQueue.poll());
            }
            divider = higherQueue.peek();
        }
        return;
    }
    
    public double findMedian() {
        if((higherQueue.size() + lowerQueue.size())%2 == 0) {
            return (double)((double)higherQueue.peek() + (double)lowerQueue.peek())/(double)2;
        } else {
            return higherQueue.size() > lowerQueue.size() ? higherQueue.peek() : lowerQueue.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */