import java.util.HashSet;
import java.util.Set;

public class SmallestPositveNumber {
     public int solution(int[] A) {
            // Implement your solution here
            Set<Integer> set = new HashSet<>();
            for (int x : A)
            {
                if(x > 0)
                    set.add(x);
            }

            int smallestPositive = 1;
            while (set.contains(smallestPositive))
            {
                smallestPositive++;
            }

            return smallestPositive;
        }

        public static void main(String[] args) {
            SmallestPositveNumber solution = new SmallestPositveNumber();
            int [] A = {1, 2, 3};
            System.out.println(solution.solution(A));
        }
    }

//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

