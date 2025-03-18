/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
//https://leetcode.com/problems/find-in-mountain-array/

class SearchMountain {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexMountainArray(mountainArr);
        int firstTry = obs(mountainArr, target , 0 , peak);
        if (firstTry != -1){
            return firstTry;
        }
        return obs(mountainArr , target , peak+1, mountainArr.length()-1);

    }
    public int peakIndexMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start< end){
            int mid = start+(end - start) /2;
            if(mountainArr.get(mid)> mountainArr.get(mid+1)){
                end = mid;
            } else{
                start = mid+1;
            }

        }
        return start;

    }
    public int obs(MountainArray mountainArr, int target , int start , int end){
        boolean isAsc= mountainArr.get(start) < mountainArr.get(end);
        while(start<= end ){
            int mid = start+ (end - start)/2;
            int midValue = mountainArr.get(mid);
            if(midValue == target){
                return mid;
            }
            if(isAsc){
                if(target < midValue){
                    end = mid -1;
                } else{
                    start = mid +1;
                }

            } else{
                if(target > midValue){
                    end = mid -1;
                } else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
