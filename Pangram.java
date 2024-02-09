import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public boolean findPangram(String s)
    {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
            {
                set.add(c);
            }

            if (c >= 'A' && c <= 'Z')
            {
                c = Character.toLowerCase(c);
                set.add(c);
            }

        }

        return set.size() == 26;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        Pangram pangram = new Pangram();
        boolean ans = pangram.findPangram(str);
        System.out.println(ans);
    }


}
