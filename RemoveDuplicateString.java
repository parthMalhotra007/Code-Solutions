import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateString {

    static char[] removeDuplicates(char []s,int n)
    {
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder removeDuplicate = new StringBuilder();

        for (char c : s) {
            if (!map.containsKey(c)) {
                removeDuplicate.append(c);
                map.put(c, 1);
            }
        }
        return removeDuplicate.toString().toCharArray();
    }

    public static void main(String[] args){
        char []s = "geeksforgeeks".toCharArray();
        int n = s.length;
        System.out.print(removeDuplicates(s,n));
    }

}
