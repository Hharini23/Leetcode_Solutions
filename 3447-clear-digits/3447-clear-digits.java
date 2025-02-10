class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c >='0' && c<='9')
            {
              st.pop();
            }
            else
            {
              st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            ans.insert(0,st.pop());
        }
      return ans.toString();
    }
}