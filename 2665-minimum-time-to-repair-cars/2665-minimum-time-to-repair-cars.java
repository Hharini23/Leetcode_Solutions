class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left=1, right =(long) Arrays.stream(ranks).min().getAsInt() * cars*cars;
        while(left < right)
        {
        long mid= (left+right)/2;
        if(Countrepairedcars(ranks, cars, mid))
          right=mid;
        else
          left=mid+1;
    }
    return left;
    }

    public boolean Countrepairedcars(int [] ranks, int cars, long time)
    {
        long repaired=0;
        for(int rank : ranks)
        {
            repaired+= Math.sqrt(time/rank);
            if(repaired >= cars) return true;
        }
        return false;
    }
}