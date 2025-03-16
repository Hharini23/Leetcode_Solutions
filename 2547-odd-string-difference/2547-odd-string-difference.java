class Solution {
    public String oddString(String[] words) {
    int f_mat=0;
    int mis_mat=-1;
    for(int i=1;i < words.length;i++)
    {
        if(matchDiff(words[0],words[i]))
        {
            f_mat++;
        }
        else{
            mis_mat=i;
        }
    }
    if(f_mat == 0)
    {
        return words[0];
    }
     return words[mis_mat];
    }

    public static boolean matchDiff (String a, String b)
    {
        for(int i=0;i< a.length()-1;i++)
        {
           if(a.charAt(i+1)- a.charAt(i) != b.charAt(i+1)- b.charAt(i))
           {
                 return false;
           }
        }
        return true;
    }

}