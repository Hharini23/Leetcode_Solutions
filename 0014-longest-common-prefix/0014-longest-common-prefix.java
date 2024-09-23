class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder a=new StringBuilder();
        Arrays.sort(strs);
        String fs=strs[0];
        String ls=strs[strs.length-1];
        for(int i=0 ;i<Math.min(fs.length(),ls.length());i++ )
        {
            while(fs.charAt(i)!=ls.charAt(i))
            {
                return a.toString();
            }
            a.append(fs.charAt(i));
        }
        return a.toString();
    }
}