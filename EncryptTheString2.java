import java.util.HashMap;
import java.util.Map;

public class EncryptTheString2 {

    public String EncryptString(String s)
    {
        StringBuilder stringBuilder = new StringBuilder();
        Map <Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            int freq = entry.getValue();
            if(freq>10)
            {
               String hex =  Integer.toHexString(freq);
               stringBuilder.append(entry.getKey()).append(hex);
            }
            else
            {
                stringBuilder.append(entry.getKey()).append(freq);
            }

        }

        stringBuilder.reverse();

        return stringBuilder.toString();

    }

    public static void main(String[] args)
    {

        // Given Input
        String S = "aaaaaaaaaaa";
        int N = S.length();

        // Function Call
        EncryptTheString2 encryptTheString2 = new EncryptTheString2();
        String s = encryptTheString2.EncryptString(S);
        System.out.println(s);
    }
}
