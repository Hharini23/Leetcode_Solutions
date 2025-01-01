class Solution {
    public int maxScore(String s) {
        int maxcnt=0;
        int n= s.length()-1;
        int ones=0;
        for(char c : s.toCharArray())
        {
             if(c == '1') ones++;
        }
        int lcnt=0,rcnt=ones;
        for (int i=0;i<n;i++)
        {
            
            if(s.charAt(i)=='0')
              lcnt++;
            else
              rcnt--;
            maxcnt=Math.max(maxcnt, lcnt+rcnt);
        }

        return maxcnt;
    }
}