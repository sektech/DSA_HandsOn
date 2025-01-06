package org.example;

import org.example.search.Binary;
import org.example.search.Linear;

public class Main {
    public static void main(String[] args) {

       //create array of integers and search for a target value
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Integer target = 10;
        Integer result = Linear.linearSearch(nums, target);
        if(result == -1)
            System.out.printf("Target value : %s not found in the array%n", target);
        else
            System.out.printf("Target value : %s found at index %s " ,target, result);
        System.out.println("");
        result = Binary.binarySearch(nums, target);
        if(result == -1)
            System.out.printf("Target value : %s not found in the array%n", target);
        else
            System.out.printf("Target value : %s found at index %s " ,target, result);

    }





}