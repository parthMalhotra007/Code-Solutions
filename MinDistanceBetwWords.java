import java.lang.reflect.Array;
import java.util.Arrays;

public class MinDistanceBetwWords {

    public int minDistance(String [] input,String s1 , String s2)
    {
        int distance = Integer.MAX_VALUE;
        int d1 = -1 ;
        int d2 = -1 ;
        for(int i = 0 ; i < input.length ; i++)
        {
            if(input[i].equalsIgnoreCase(s1))
            {
                d1 = i;
            } else if (input[i].equalsIgnoreCase(s2)) {
                d2 = i;
            }
            if(d1 != -1 && d2 != -1) {
                distance = Math.min(distance, Math.abs(d1 - d2));
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        String [] s = { "the", "quick", "brown", "fox", "quick" };
        String word1 = "the", word2 = "fox";
        MinDistanceBetwWords minDistanceBetwWords = new MinDistanceBetwWords();
        int ans = minDistanceBetwWords.minDistance(s,word1,word2);
        System.out.println(ans);
    }
}
