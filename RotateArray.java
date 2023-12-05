import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        if(k>n)
        {
            k=k%n;
        }
        int start=0;
        reverse(nums,start,n-1);
        reverse(nums,start,k-1);
        reverse(nums,k,n-1);
    }
//Time limit exceeded..
//    public void swap(int[] nums,int start,int end){
//        int temp;
//        if(start==end)
//            return;
//        while(start<end) {
//            temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//        }
//    }

    public void reverse(int[] nums,int start,int end){
        int temp;
        if(start==end)
            return;
        while(start<end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(arr,3);
        for (int num:
             arr) {
            System.out.println(num + " ");
        }
    }
}
