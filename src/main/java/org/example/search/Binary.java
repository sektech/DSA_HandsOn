package org.example.search;

public class Binary {

    public static Integer binarySearch(Integer[] nums, Integer target){

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
}
