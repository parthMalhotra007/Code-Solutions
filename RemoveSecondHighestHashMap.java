import java.util.*;

public class RemoveSecondHighestHashMap {

    public void removeSecondHighest(Map<Integer,Integer> map)
    {
        ArrayList<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(map.entrySet());
        arrayList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        map.clear();
        int count = 0;
        for (Map.Entry<Integer,Integer> entry : arrayList)
        {
            if (count == 1) {
                count++;
                continue;
            }
            map.put(entry.getKey(),entry.getValue());
            count++;
        }
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 30);
        map.put(1, 25);
        map.put(2, 35);
        RemoveSecondHighestHashMap removeSecondHighestHashMap = new RemoveSecondHighestHashMap();
        removeSecondHighestHashMap.removeSecondHighest(map);
        System.out.println(map);
    }
}
