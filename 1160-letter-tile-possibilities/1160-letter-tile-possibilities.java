class Solution {
    int ans;  // Global variable to store the count of valid sequences

    public int numTilePossibilities(String tiles) {
        int[] hash = new int[26];  // Frequency array to store the count of each letter (A-Z)
        
        // Count the occurrences of each character in the given tiles string
        for (char ch : tiles.toCharArray()) 
            hash[ch - 'A']++;

        ans = 0; // Initialize the answer count
        sol(hash); // Start the recursive function
        return ans; // Return the final count of possible sequences
    }

    private void sol(int[] hash) {
        // Iterate through all 26 possible letters
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) continue; // Skip letters that are not available

            ans++; // Count the current sequence

            hash[i]--; // Use one occurrence of the current letter
            sol(hash); // Recur to generate further sequences
            hash[i]++; // Backtrack: Restore the count of the letter
        }
    }
}  