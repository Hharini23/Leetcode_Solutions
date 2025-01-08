class Solution {
    public int countPrefixSuffixPairs(String[] words) {
       // Arrays.sort(words, (a,b)->Integer.compare(a.length(),b.length()));
        List<Integer> l = new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isPrefixSufix(words[i],words[j]))
                   count++;
            }
        }
        return count;
    }


 boolean isPrefixSufix(String str1, String str2)
 {
    if(str2.startsWith(str1) && str2.endsWith(str1)){
        return true;
    }
    return false;
 }
}