package org.example;

public class Main {
    public static void main(String[] args) {

       //create array of integers and search for a target value
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Integer target = 10;
        Integer result = linearSearch(nums, target);
        if(result == -1)
            System.out.printf("Target value : %s not found in the array%n", target);
        else
            System.out.printf("Target value : %s found at index %s " ,target, result);
        System.out.println("");
        result = binarySearch(nums, target);
        if(result == -1)
            System.out.printf("Target value : %s not found in the array%n", target);
        else
            System.out.printf("Target value : %s found at index %s " ,target, result);

    }

    private static Integer binarySearch(Integer[] nums, Integer target){

        int left =0;
        int right = nums.length -1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if (nums[mid].equals(target))
                return mid;
            else if (nums[mid] < target )
                left = mid+1;
            else
                right = mid - 1;
        }
        return  -1;

    }


    private static Integer linearSearch(Integer[] nums, Integer target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}