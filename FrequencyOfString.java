import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfString {
    public Map<Character,Integer> frequencyCount(String s)
    {
        Map<Character,Integer> freqCountMap = new TreeMap<>(); // TREEMAP SORTS during insertion , ascending order
        for (char c : s.toCharArray())
        {
            freqCountMap.put(c,freqCountMap.getOrDefault(c,0)+1);
        }

        return freqCountMap;
    }

    public static void main(String[] args) {
        String inputString = "programming";

        FrequencyOfString frequencyOfString = new FrequencyOfString();
        Map<Character,Integer> charFrequencyMap = frequencyOfString.frequencyCount(inputString);

        // Print the result in ascending order of characters
        System.out.println("Character frequencies in ascending order:");
        for (Map.Entry<Character,Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
