class CheckOptim {
    //optimized way
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            int num = 2*arr[i];
            if(check(arr,num,i)){
                return true;
            }
        }
        return false;

    }
    public boolean check(int arr[], int num , int index){
        for(int i = 0;i<arr.length;i++){
            if(index!=i&&arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
