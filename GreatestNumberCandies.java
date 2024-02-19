import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxInArray = -1;
        for (int no : candies)
        {
            maxInArray = Math.max(no,maxInArray);
        }

        for (int no :candies)
        {
            if(no+extraCandies >= maxInArray)
            {
                list.add(true);
            }
            else
                list.add(false);
        }
        return list;
    }


    public static void main(String[] args) {

    }
}
