public class ReverseVowels {
    public String reverseVowels(String s)
    {
        int start = 0;
        int end = s.length()-1;
        StringBuilder stringBuilder = new StringBuilder(s);

        while (start < end) {
            if (isVowel(stringBuilder.charAt(start)))
            {
                if(isVowel(stringBuilder.charAt(end)))
                {
                   char temp = stringBuilder.charAt(start);
                   char tempEnd = stringBuilder.charAt(end);
                   stringBuilder.setCharAt(start,tempEnd);
                   stringBuilder.setCharAt(end,temp);
                   start++;
                }
                end--;
            }
            else
            {
                start++;
            }
        }
        return stringBuilder.toString();
    }

    public boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ;
    }

    public static void main(String[] args) {
        String s = "race car";
        String op = "race car";
        ReverseVowels reverseVowels = new ReverseVowels();
        System.out.println(reverseVowels.reverseVowels(s));
    }
}
