public class Floor {
    public static void main(String[] args) {
        int [] arr  ={2,3,5,7,9,13,14,16,18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
   // its used to find the number which is smaller that or = target
    static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start) /2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;

            } else {
                return mid;
            }
        }
        return end;

    }
}
