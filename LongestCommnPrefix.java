import java.util.Arrays;

public class LongestCommnPrefix {

    public String longestCommonPrefix(String [] input)
    {
        Arrays.sort(input);
        String ex = input[0];
        StringBuilder stringBuilder = new StringBuilder(ex);
        int i = stringBuilder.length()-1;

        for(String s : input)
        {
            if(!s.startsWith(stringBuilder.toString()))
            {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }


        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] input1 = {"apple", "ape", "april" , "a"};
        LongestCommnPrefix longestCommnPrefix = new LongestCommnPrefix();
        String result = longestCommnPrefix.longestCommonPrefix(input);
        System.out.println(result);
        result = longestCommnPrefix.longestCommonPrefix(input1);
        System.out.println(result);
    }
}
