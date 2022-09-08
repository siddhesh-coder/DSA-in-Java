public class foorBinarySearch {
    static int floorBS(int[] arr, int target) {
     if(target > arr[arr.length-1]){
        return -1;
    }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        // just changed here -1 to end same code as Binary Search
        return end;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 90;
        int ans = floorBS(arr,target);
        System.out.println(ans);
    }
}
