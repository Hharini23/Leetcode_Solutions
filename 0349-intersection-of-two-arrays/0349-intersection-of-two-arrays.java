class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i : nums1)
        {
            set1.add(i);
        }
        for(int i : nums2)
        {
            if(set1.contains(i))
            {
                res.add(i);
            }
        }
        int [] result = new int[res.size()];
        int index = 0;
        for(int a : res)
        {
            result[index] = a;
            index++;
        }
        return result;
     }
}