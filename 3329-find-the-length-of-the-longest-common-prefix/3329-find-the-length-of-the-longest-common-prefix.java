class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {        
        Node root = new Node();
        
        for(int a : arr1) {
            addInTrie(root, a + "");
        }
        
        int max = 0;
        
        for(int a : arr2) {
            max = Math.max(max, dfs(root, a+""));
        }
        return max;
    }
    
    public int dfs(Node root, String s) {
        if(s.length() == 0 || root.nums[s.charAt(0)] == null) {
            return 0;
        }
        return 1 + dfs(root.nums[s.charAt(0)], s.substring(1));
        
    }
    
    public void addInTrie(Node root, String n) {
        if(n == null || n.length() == 0) {
            return ;
        }
        if(root.nums[n.charAt(0)] == null) {
            root.nums[n.charAt(0)] = new Node();
        }
        root = root.nums[n.charAt(0)];
        addInTrie(root, n.substring(1));
    }
    
    class Node {
        Node[] nums;
        Node()  {
            nums = new Node[256];
        }
    }
}