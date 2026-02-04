class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> dic = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
           char c = magazine.charAt(i);
           if(!dic.containsKey(c))
           {
             dic.put(c, 1);
           }
           else{
             dic.put(c, dic.get(c)+1);
           }
        }

        for(int i=0;i<ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            if(dic.containsKey(c) && dic.get(c)>0)
            {
                dic.put(c, dic.get(c)-1);
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
}