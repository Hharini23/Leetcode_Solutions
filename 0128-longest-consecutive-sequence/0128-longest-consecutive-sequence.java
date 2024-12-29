class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> s= new HashSet<>();
        for(int num : nums)
        {
            s.add(num);
        }
        int longcount=0,curr_num=0,curr_count=0;
        for(int num :nums)
        {
            if(!s.contains(num-1))
            {
                curr_num=num;
                curr_count=1;
                while(s.contains(curr_num+1))
                {
                    curr_num+=1;
                    curr_count+=1;
                }
                longcount=Math.max(curr_count,longcount);

            }

        }
        return longcount;
    }
}