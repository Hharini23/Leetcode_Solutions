class Solution {
    public int titleToNumber(String s) {
        int res=0;
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int value = c -'A'+1;
            res = res*26+value;
        }

        return res;
    }
}