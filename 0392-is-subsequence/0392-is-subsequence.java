class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int i=0,j=0;
        while(i < s.length() && j< t.length())
        {
            if(s.charAt(i)== t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==n;
    }
}