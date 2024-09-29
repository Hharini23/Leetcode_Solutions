class Solution {
    public int minimumMoves(String s) {
        char [] ch =s.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='X')
            {
                i=i+2;
                c++;
            }
        }
        return c;
    }
}