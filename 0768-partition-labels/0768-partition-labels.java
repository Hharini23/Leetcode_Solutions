class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastOcc = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            lastOcc.put(s.charAt(i), i);
        }
        List<Integer> ans = new ArrayList<>();
        int end=0,start=0;
        for(int i=0;i<s.length();i++)
        {
            end= Math.max(end, lastOcc.get(s.charAt(i)));
            if(i==end)
            {
                ans.add(end-start+1);
                start=i+1;
            }
        }
        return ans;
    }
}