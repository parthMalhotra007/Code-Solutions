import java.util.HashMap;
import java.util.Map;

public class JewelAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        int ctr = 0;
        for (char c : jewels.toCharArray())
        {
            map.put(c , map.getOrDefault(c,0)+1);
        }

        for (char c : stones.toCharArray())
        {
            if (map.containsKey(c))
                ctr++;
        }

        return ctr;

    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        JewelAndStone jewelAndStone = new JewelAndStone();
        System.out.println(jewelAndStone.numJewelsInStones(jewels,stones));

    }
}
