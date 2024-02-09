public class CountOpenCloseBracket {

    public int countOpenClose(String s)
    {
        int closeCount = 0;

        for (int i =0 ;  i < s.length() ; i++) //The equation for this comparison is: cnt_close - (i+1 - cnt_open) = cnt_open which equals to cnt_close
        {
            if(s.charAt(i) == ')')
            {
                closeCount ++;
            }
        }

        return closeCount;
    }


    public static void main(String[] args) {
        String str = "(()))(()()())))";
        CountOpenCloseBracket countOpenCloseBracket = new CountOpenCloseBracket();
        int ans = countOpenCloseBracket.countOpenClose(str);

        System.out.println("OP: " + (ans));
    }
}
