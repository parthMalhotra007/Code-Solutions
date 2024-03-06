import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] numsAns =  new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ctr = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                {
                    ctr++ ;
                }
            }
            numsAns[i] = ctr;
        }
        return numsAns;
    }

    /* Efficient Approach

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for(int i = 0; i < n; i++ ){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = n - 1; i >= 0; i--){
            map.put(copy[i], i);
        }
        for(int i = 0; i < n; i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
     */

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        SmallerThanCurrentNumber smallerThanCurrentNumber = new SmallerThanCurrentNumber();
        int [] ans = smallerThanCurrentNumber.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));

    }
}
