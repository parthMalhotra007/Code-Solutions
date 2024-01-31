public class SortedRotatedArray {

    public static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                return mid; // Found the target
            }

            if (arr[left] <= arr[mid]) {
                // Left half is sorted
                if (x >= arr[left] && x <= arr[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else {
                // Right half is sorted
                if (arr[mid] <= x && x <= arr[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int target2 = 2;

        System.out.println("Index of " + target1 + ": " + search(nums, target1)); // Output: 4
        System.out.println("Index of " + target2 + ": " + search(nums, target2)); // Output: 6
    }
}
