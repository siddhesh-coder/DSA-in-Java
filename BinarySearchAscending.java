public class BinarySearchAscending {
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //For Sorted Array
         int arr[] = {-12,-34,56,12,56,78,88};
         int target = 12;
         int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}



