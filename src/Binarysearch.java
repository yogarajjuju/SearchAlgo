public class Binarysearch {
    public static void main(String[] args) {
        int[] arr  = {-3,-2,-1 , 0 , 2 ,5 ,16, 22 , 87 , 99};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr , int target){
        int start = 0;
        int end= arr.length -1;
        while(start<=end){
            //int mid = (start+ end)/2; cannot be used due do int property prblms
            int mid = start + (end - start)/2;// should be used
            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
