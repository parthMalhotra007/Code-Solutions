public class MinDeletionPalindrome {

    public static int lengthOfPalindromeSubSq(String s, int start, int end)
    {
        //Base cases

        // Base case: Single character is a palindrome of length 1
        if(start ==  end)
        {
            return 1;
        }

        // Base case: Empty string is a palindrome of length 0
        if(start > end)
        {
            return 0;
        }


        // If characters at the start and end match
        if(s.charAt(start) == s.charAt(end))
        {
            return 2 + lengthOfPalindromeSubSq(s,start+1,end-1);
        }

        //If characters at the start and end don't match
        return Math.max(lengthOfPalindromeSubSq(s,start+1,end), lengthOfPalindromeSubSq(s,start,end-1));
    }


    // Function to find the minimum deletions required to make a palindrome
    public static int minDeletionsForPalindrome(String s) {
        int lpsLength = lengthOfPalindromeSubSq(s, 0, s.length() - 1);
        return s.length() - lpsLength;
    }

    public static void main(String[] args) {
        String str1 = "aebcbda";
        System.out.println(minDeletionsForPalindrome(str1)); // Output: 2

        String str2 = "geeksforgeeks";
        System.out.println(minDeletionsForPalindrome(str2)); // Output: 8
    }
}
