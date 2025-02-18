class Solution {
    public boolean buddyStrings(String A, String B) {
       if(A.length() != B.length())
         return false;
       if(A.equals(B))
       {
            Set<Character> s = new HashSet<>();
            for(char c: A.toCharArray())
            {
                s.add(c);
            }
            return s.size() < A.length();

       }
       else{
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i) != B.charAt(i))
            {
                l.add(i);
            }
        }
        return l.size()==2 && A.charAt(l.get(0))== B.charAt(l.get(1)) && A.charAt(l.get(1))== B.charAt(l.get(0));
       }
    }
}