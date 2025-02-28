public class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        // Create a DP table to store lengths of longest common subsequence
        int[][] dp = new int[m + 1][n + 1];

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // Characters match
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Take the max
                }
            }
        }

        // Now, reconstruct the shortest common supersequence
        StringBuilder scs = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                scs.append(str1.charAt(i - 1)); // If they match, add to SCS
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                scs.append(str1.charAt(i - 1)); // Add from str1
                i--;
            } else {
                scs.append(str2.charAt(j - 1)); // Add from str2
                j--;
            }
        }

        // Add remaining characters from str1 or str2
        while (i > 0) {
            scs.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            scs.append(str2.charAt(j - 1));
            j--;
        }

        // Since we constructed the SCS backwards, reverse it
        return scs.reverse().toString();
    }

}