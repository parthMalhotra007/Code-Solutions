public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        String test="";

        int maxLength= -1;

        if(s.isEmpty())
            return 0;
        else if (s.length()==1) {
            return 1;
        }
        for(char c :s.toCharArray())
        {
            String current = String.valueOf(c);

            if (test.contains(current))
            {
                test=test.substring(test.indexOf(current)+1);
            }

            test=test+current;
            maxLength=Math.max(test.length(),maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s="bbbbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int res = longestSubstring.lengthOfLongestSubstring(s);
        System.out.println(res);


    }
}
