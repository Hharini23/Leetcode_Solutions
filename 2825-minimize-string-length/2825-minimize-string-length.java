class Solution {
    public int minimizedStringLength(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(!result.contains(String.valueOf(s.charAt(i)))) {
                result += String.valueOf(s.charAt(i));
            }
        }
        return result.length();
    }
}