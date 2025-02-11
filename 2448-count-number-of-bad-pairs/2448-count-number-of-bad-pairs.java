// class Solution {

//     public long countBadPairs(int[] nums) {
//         long badPairs = 0;
//         Map<Integer, Integer> diffCount = new HashMap<>();

//         for (int pos = 0; pos < nums.length; pos++) {
//             int diff = pos - nums[pos];
//             int goodPairsCount = diffCount.getOrDefault(diff, 0);

//             badPairs += pos - goodPairsCount;

//             diffCount.put(diff, goodPairsCount + 1);
//         }

//         return badPairs;
//     }
// }



class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long goodpair=0;
        HashMap <Integer,Integer> m= new HashMap<>();
        for(int i=0;i<n;i++)
        {
             if(m.containsKey(nums[i]-i))
             {
                goodpair+=(long)m.get(nums[i]-i);
             }
             m.put(nums[i]-i,m.getOrDefault(nums[i]-i,0)+1);
        }
        
        return (long)n*(n-1)/2-goodpair;
    }
}

