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



// class Solution {
//     public long countBadPairs(int[] nums) {
//         int n = nums.length;
//         int tot=n*(n-1)/2;
//         long goodpair=0;
//         HashMap <Integer,Integer> m= new HashMap<>();
//         for(int i=0;i<n;i++)
//         {
//              if(m.containsKey(nums[i]-i))
//              {
//                 goodpair+=(long)m.get(nums[i]-i);
//              }
//              m.put(nums[i]-i,m.getOrDefault(nums[i]-i,0)+1);
//         }
        
//         return (long)tot-goodpair;
//     }
// }

class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        long cnt = 0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i]-i)){
                cnt += (long)mp.get(nums[i]-i);
            }
            mp.put(nums[i]-i,mp.getOrDefault(nums[i]-i,0)+1);

        }

        return (long)n*(n-1)/2-cnt;


        
    }
    /*
    1 2 4
    1->2
    4->1

    (1,2),(1,4),(2,4) -> n*(n-1)/2 total pairs
    j - i = a[j]-a[i]

    a[i] - i = a[j] - j



    */
} 