class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] arrbox=new int [n];
        for(int i=0;i<n;i++)
        {
            arrbox[i]=boxes.charAt(i)-'0';
        }
        int res[] = new int [n];
        int oneCnt=0,cumCnt=0;
        for(int i=0;i<n;i++)
        {
            res[i]+=cumCnt;
            oneCnt+=arrbox[i];
            cumCnt+=oneCnt;
        }
        oneCnt=0;cumCnt=0;
        for(int i=n-1;i>=0;i--)
        {
            res[i]+=cumCnt;
            oneCnt+=arrbox[i];
            cumCnt+=oneCnt;
        }
        return res;

    }
}