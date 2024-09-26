class Solution {
    public String reformat(String s) {
        List<Character> a =new ArrayList<>();
        List<Character>  d =new ArrayList<>();

        for(char c: s.toCharArray()){
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            a.add(c);
            else d.add(c);
        }
        if(Math.abs(a.size()-d.size())>1) return "";
        StringBuilder perm=new StringBuilder();
        int i=0;
        if(a.size()>d.size()){
            while(i<a.size()){
                perm.append(a.get(i));
                if(i<d.size()) perm.append(d.get(i));
                i++;
            }
        }
        else{
           while(i<d.size()){
                perm.append(d.get(i));
                if(i<a.size()) perm.append(a.get(i));
                i++;
            }
        }
        return perm.toString();
        
    }
}