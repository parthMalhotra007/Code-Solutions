import java.util.HashSet;

public class PairSum {

    public boolean pairSum(int [] arr , int sum)
    {
        HashSet <Integer> s = new HashSet<>();
        int n = arr.length;

        for(int i = 0 ; i < n ; i++)
        {
            if(s.contains(sum - arr[i]))
            {
               return true;
            }
            s.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        PairSum pairSum = new PairSum();
        boolean ans = pairSum.pairSum(A , n);
        System.out.println("Pair Sum is Available  " + ans);
    }
}
