import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
        public List<Integer> partitionLabels(String s) {
                Map<Character,Integer> map = new HashMap<>();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < s.length() ; i++)
                {
                        map.put(s.charAt(i),i);
                } // fill map with index of char 26's

                int prev = -1;
                int max = 0;

                for (int i = 0 ; i < s.length() ; i++)
                {
                        max = Math.max(max,map.get(s.charAt(i)));

                        //partition time finding max till the partition
                        if(max == i)
                        {
                                list.add(max-prev);
                                prev = max;
                        }
                }
                return list;
        }
}
