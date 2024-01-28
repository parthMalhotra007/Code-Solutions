public class BinarySearch {

    public int binarySearch(int []arr , int x)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid ;

        while (low <= high)
        {
            mid = (low + high) / 2;
            if(arr[mid] == x)
                return mid;

            else if (x < arr[mid])
            {
                high = mid -1;
            }

            else if (x >= arr[mid])
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
