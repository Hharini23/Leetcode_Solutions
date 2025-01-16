class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n= nums2.length;
        int res=0;
        if(m%2==0 && n%2==0)
          return 0;
        if( m%2!=0)
        {
           for(int i=0;i<n;i++)
           {
             res^= nums2[i]; 
           }
        }
        if(n%2!=0)
        {
           for(int j=0;j<m;j++)
           {
               res^= nums1[j];
           }
        }
        return res;
    }
}