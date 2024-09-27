class Solution {
public:
    string makeGood(string s) {
        string str="";
        for(int i=0;i<s.length();i++){
            int n=str.length();
            if(str.empty())
            str+=s[i];
            else if(str[n-1]==s[i]-32 || str[n-1]-32==s[i])
            str.pop_back();
            else
            str+=s[i];
        }
        return str;
    }
};