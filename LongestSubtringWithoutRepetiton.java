import java.util.HashMap;
import java.util.Map;

public class LongestSubtringWithoutRepetiton {

    public int longestSubstring (String s)
    {
        if(s == null || s.isEmpty())
        {
            return 0;
        }

        int start = 0;
        int maxLength = 0;
        Map<Character,Integer> freqMap = new HashMap<>();
        for(int end = 0 ; end <s.length(); end++)
        {
            char currentChar = s.charAt(end);
            if(freqMap.containsKey(currentChar))
            {
                // Move the start pointer to the next index of the repeated character
                // basically 2 pointers , moving accordingly , sliding window
                start = Math.max(start,freqMap.get(currentChar)+1);
            }

            // Update the index of the current character in the map
            freqMap.put(currentChar,end);

            // Update the maximum length if needed
            maxLength = Math.max(maxLength,end-start+1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        LongestSubtringWithoutRepetiton longestSubtringWithoutRepetiton = new LongestSubtringWithoutRepetiton();
        int result = longestSubtringWithoutRepetiton.longestSubstring(input);
        System.out.println("Length of the longest non-repeating substring: " + result);
    }
}
