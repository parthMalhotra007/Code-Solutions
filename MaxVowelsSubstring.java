class Solution {
    public static int maxVowels(String s, int k) {
        int maxCount = 0;

        // Initial count for the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                maxCount++;
            }
        }

        int currentCount = maxCount;

        // Iterate through the remaining windows
        for (int i = k; i < s.length(); i++) {
            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }

            // Add the character entering the window
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }

            // Update the maximum count
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
