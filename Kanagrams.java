import java.util.HashMap;
import java.util.Map;

public class Kanagrams {

    public boolean kAnagramsPossible(String s1, String s2, int k) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in the first string
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Compare with the second string and update count
        //anagram so can use single map to subtract if freq is same
        for (char c : s2.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                count++;
            }
        }

        // Check if the count is less than or equal to k
        return count <= k;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 3;

        Kanagrams kanagrams = new Kanagrams();
        boolean ans = kanagrams.kAnagramsPossible(str1, str2, k);
        System.out.println(ans); // Output should be true
    }
}
