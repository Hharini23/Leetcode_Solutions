class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n= derived.length;
        int tot=0;
        for(int ele : derived)
        {
            tot=tot^ele;
        }
       return tot==0 ; 
    }
}