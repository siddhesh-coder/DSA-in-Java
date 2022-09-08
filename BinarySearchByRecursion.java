public class BinarySearchByRecursion {
    static int BSR(int[] arr, int target, int start ,int end){
        if(start > end){
            return -1;
        }
        int m = start + (end-start)/2;
        if(target < arr[m]){
            return BSR(arr,target,start,end - 1);
        }
        else if(target > arr[m]){
            return BSR(arr,target,start + 1,end);
        }
        else{
            return m;
        }
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7};
        int target = 3;
        int ans = BSR(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
}
