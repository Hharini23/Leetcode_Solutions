class Solution {
    public long putMarbles(int[] weights, int k) {
        long ans=0;
        if(k==1)
         return 0;
        List<Integer> sum = new ArrayList<>(); 
        for(int i=0;i< weights.length-1;i++)
        {
           sum.add(weights[i] + weights[i+1]);
        }

        Collections.sort(sum);
        long max=0,min=0;
        for(int i=0;i<k-1;i++)
        {
            min+=sum.get(i);
            max+=sum.get(sum.size()-1-i);
        }
        return max-min;
    }
}