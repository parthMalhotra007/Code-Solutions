import java.util.HashMap;

public class FurthestIdenticalDigram {

    public int digramDistance(String s)
    {
        HashMap<String,Integer> lastSeenIndex = new HashMap<>();
        int maxDistance = -1;

        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            String digram = s.substring(i, i+2);

            if(lastSeenIndex.containsKey(digram))
            {
                int distance = i - lastSeenIndex.get(digram);
                maxDistance = Math.max(distance , maxDistance);
            }

            lastSeenIndex.put(digram,i);
        }

        return maxDistance;
    }

    public static void main(String[] args) {
        FurthestIdenticalDigram solution = new FurthestIdenticalDigram();
        String input1 = "akcz";
        String input2 = "abcabc";
        String input3 = "abcd";

        System.out.println(solution.digramDistance(input1)); // Output: -1
        System.out.println(solution.digramDistance(input2)); // Output: 3
        System.out.println(solution.digramDistance(input3)); // Output: -1
    }
}
