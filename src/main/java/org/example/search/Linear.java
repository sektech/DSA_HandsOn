package org.example.search;

public class Linear {

    public static Integer linearSearch(Integer[] nums, Integer target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
