import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
        }
        return ans;
    }

    public int[] twoSumOpti(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[]={3,3};
        int target=6;
        TwoSum twoSum = new TwoSum();
        int res[]=twoSum.twoSumOpti(nums,target);
        int ans[]=twoSum.twoSum(nums,target);
        System.out.println( "["+ ans[0] +","+ ans[1] + "]");
        System.out.println( "["+ res[0] +","+ res[1] + "]");


    }
}
