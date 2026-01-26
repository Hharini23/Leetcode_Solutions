class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
           mindiff = Math.min(mindiff, arr[i+1]-arr[i]);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]-arr[i] == mindiff)
            {
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}