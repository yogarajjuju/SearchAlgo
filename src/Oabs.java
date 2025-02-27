public class Oabs {
    public static void main(String[] args) {
        int [] arr = {90,70, 55, 40 , 20 , 2 , 1 , 0};
        int target = 20;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticbs(int  []arr ,  int target ){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]< arr[end];
        while(start<=end){
            //int mid = (start+ end)/2; cannot be used due do int property prblms
            int mid = start + (end - start)/2;// should be used
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
            if(target<arr[mid]){// assending
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
            else{// decending
                if(target>arr[mid]){
                    end = mid - 1;
                } else if (target<arr[mid]) {
                    start = mid + 1;

                }
            }

            }
        return -1;
    }
}
