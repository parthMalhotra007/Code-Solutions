public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int maxLen = Math.max(word1.length(), word2.length());
        int minLen = Math.min(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder(maxLen);
        for (int i = 0; i <minLen ; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        if(word1.length() != word2.length())
        {
            for (int i = minLen; i < maxLen; i++)
            {
                if (word1.length() > word2.length() )
                {
                    stringBuilder.append(word1.charAt(i));
                }
                else {
                    stringBuilder.append(word2.charAt(i));
                }
            }
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        MergeStringsAlternatively mergeStringsAlternatively = new MergeStringsAlternatively();
        String ans = mergeStringsAlternatively.mergeAlternately(word1,word2);
        System.out.println(ans);

    }
}
