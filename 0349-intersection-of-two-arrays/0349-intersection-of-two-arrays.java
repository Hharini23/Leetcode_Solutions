class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
                continue;
            }
            if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}