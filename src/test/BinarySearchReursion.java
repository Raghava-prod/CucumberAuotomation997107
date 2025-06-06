package test;

public class BinarySearchReursion {


    public static void main(String[] args){
        int nums[] =new int[]{5,7,9,11,13};
        int target = 5;

        int left = 0;
        int right = nums.length-1;
        int result = Binarysearch(nums, target,left,right);
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
    public static int Binarysearch(int[] nums, int target,int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return Binarysearch(nums, target, mid + 1, right);
            else
                return Binarysearch(nums, target, left, mid - 1);

        }
        return -1;
    }

    }



