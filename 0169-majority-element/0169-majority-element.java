class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max_value = 0,answer=0;
        for(int key : map.keySet())
        {
            if(map.get(key) > max_value)
            {
                max_value =  map.get(key) ;
                answer = key;
            }
        }
        return answer;
    }
}