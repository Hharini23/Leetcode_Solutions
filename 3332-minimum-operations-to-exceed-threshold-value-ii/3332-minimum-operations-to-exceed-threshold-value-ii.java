class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<Long>();
        for(int i: nums)
        {
            pq.add((long)i);
        }
        int c=0;
        while(pq.peek() < k)
        {
            long x= pq.poll();
            long y= pq.poll();
            long tot = Math.min(x,y) * 2 + Math.max(x,y);
            pq.add(tot);
            c++;
        }

      return c;
    }
}