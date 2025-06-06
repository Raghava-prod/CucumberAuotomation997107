package test;

public class BinarySearch {


    public static void main(String[] args){
        int nums[] = {5,7,9,11,13};
        int target = 5;
        int result = Binarysearch(nums, target);
        if(result!=-1) {
            System.out.println("Element index " + result);
        }
            else{
                System.out.print("Element not found");
            }
            for(int i: nums){
                System.out.print(i +" ");
            }

    }
    public static int Binarysearch(int[] nums, int target){
        int left =0;
        int right = nums.length-1;//size = 4
        while(left<=right){
            int mid = (left+right)/2;// 2
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
