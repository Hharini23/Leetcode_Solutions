class Solution {
    public int minimumRecolors(String blocks, int k) {
       int b_cnt=0, ans=Integer.MAX_VALUE; 
       for(int i=0;i< blocks.length();i++)
       {
         if(i-k >=0 && blocks.charAt(i-k)== 'B' ) b_cnt--;
         if(blocks.charAt(i)== 'B') 
           b_cnt++;
         ans = Math.min(ans, k-b_cnt);
       }
       return ans;
    }
}