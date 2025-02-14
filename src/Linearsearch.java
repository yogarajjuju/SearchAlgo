public class Linearsearch {
    public static void main(String[] args) {
        int arr [] = {1,3,5,8,10,20,45};
        int target = 20;
        int ans = linear(arr , target);
        System.out.println(ans);
    }
    static int linear(int arr[] , int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if( element == target) {
                return index;
            }

        }
        return -1;
    }



}
