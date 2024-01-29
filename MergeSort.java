import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int [] arr )
    {
        if(arr == null || arr.length <= 1)
            return;

        int n = arr.length;
        int [] temp = new int[n];
        mergeSortHelper(arr,temp,0 ,n-1);
    }

    private void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
        if (left<right)
        {
            int mid = (left + right) / 2;

            mergeSortHelper(arr,temp,left,mid);
            mergeSortHelper(arr,temp,mid+1,right);

            merge(arr,temp,left,mid,right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {

       System.arraycopy(arr, left, temp, left, right - left+1);

        int i = left;
        int j = mid + 1;
        int k = left;

        while( i<=mid && j<=right)
        {
            if(temp[i] <= temp[j])
            {
                arr[k++] = temp[i++];
            }
            else
            {
                arr[k++] = temp[j++];
            }
        }

        while(i<=mid) // Since right elements will always be in position so check at end for left elements and also j starts from mid+1 , right half
        {
            arr[k++] = temp[i++];
        }

    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
