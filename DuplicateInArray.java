public class DuplicateInArray {
//    public int findDuplicate(int[] nums) {
//        int ctr=0;
//        int ans=0;
//        for(int i=0 ; i< nums.length-1; i++)
//        {
//            if(nums[i]==nums[i+1]) {
//                ctr++;
//                ans = nums[i];
//                break;
//            }
//
//        }
//
//        return ans;
//    }


    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0] ;

        //find floyd cycle
        do {
            slow = nums[slow]; // moves 1 time
            fast = nums[nums[fast]]; // moves 2 times
        }
        while(slow != fast);

        //finding entrance
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return  slow;

    }
}
