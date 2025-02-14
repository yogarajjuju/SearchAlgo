public class Linearsearch {
    public static void main(String[] args) {
        int arr [] = {1,3,5,8,10,20,45};
        int target = 20;
        int ans = linear(arr , target);
        System.out.println(ans);
    }
    static int linear(int arr[] , int target) {
        if(arr.length == 0){
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
                    for (int i = 0; i < arr.length; i++) {
                        int element = arr[i];
                        if( element == target) {
                            return i;
                        }

                    }
                }



            }
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if( element == target) {
                return i;
            }

        }
        return -1;
    }



}
