class Solution {
    public List<String> stringMatching(String[] words) {
       Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));
        List<String> l = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
              if(words[j].contains(words[i]))
              {
                 l.add(words[i]);
                 break;
              }
            }
        }
        return l;
    }
}