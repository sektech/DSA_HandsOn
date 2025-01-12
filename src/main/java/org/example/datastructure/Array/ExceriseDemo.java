package org.example.datastructure.Array;

import java.lang.reflect.Array;
import java.util.*;

public class ExceriseDemo {

    static ArrayList<Integer> getAlternateArrays(int[] array){
       ArrayList<Integer> alternateArray = new ArrayList<>();
        for(int i = 0; i < array.length; i+= 2){
            alternateArray.add(array[i]);
        }
        return alternateArray;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> alternateArray = getAlternates(array);
        for(int i : alternateArray){
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("Largest number from Array : " + findLargest(array));
        System.out.println("Second Largest number from Array : " + findSecondLargest(array));
        Integer arr[] = {16,17,4,3,5,2};
        System.out.println(" leaders of array : " + findLeader(arr).stream().toList());
        System.out.println(" Array is sorted : " + checkifitsSorted(arr));
        int[] duplicateArray = {1,2,2,3,4,4,4,5,5};
        System.out.println("Distinct Array : " + removeDuplicateFromSortedArray(duplicateArray));
        System.out.println("Reverse the Array : " + reverseArray(array).stream().toList());
        int[] ar = {1,0,2,0,3,0,4,0,5};
        System.out.println("Moved 0's to end : " );
        int[] newArray = moveZerosToEnd(ar);
        for (int i=0;i< newArray.length-1 ; i++){
            System.out.print(newArray[i] + " ");
        }
    }
    //Moving zeros to end

    static int[] moveZerosToEnd(int[] array){
        int n = array.length;
        int[] temp = new int[n];
        int j=0;
        for (int i=0; i < n -1; i++){
            if(array[i] != 0) {
                temp[j++]=array[i];
            }
        }
        while(j < n){
            temp[j++] = 0;
        }
        return  temp;
    }

    //Array reverse
    static ArrayList<Integer> reverseArray(int[] Array){
        ArrayList<Integer> reverseArray = new ArrayList<>();
        for (int i = Array.length-1; i >=0 ;i--){
            reverseArray.add(Array[i]);
        }
        return reverseArray;
    }

    //Remove duplicate from sorted Array

    static List<Integer> removeDuplicateFromSortedArray(int[] array){

        HashSet<Integer> s= new HashSet<>();
        for (int i = 0;i < array.length; i++){
            if(!s.contains(array[i]))
                s.add(array[i]);
        }
        return s.stream().toList();
    }

    //check if array is sorted or not
    static boolean checkifitsSorted(Integer[] Array){

        for(int i=0;i< Array.length - 1 ;i++){
            if(Array[i] > Array[i+1])
                return false;

        }
        return true;
    }

    //find the leader in array
     static ArrayList<Integer> findLeader(Integer[] array){
            ArrayList<Integer> leaders = new ArrayList<>();
            Integer n = array.length;
            Integer maxToRight = array[n-1];

            leaders.add(maxToRight);
            for (int i= n-2;i>=0 ; i--){
                if(array[i] > maxToRight){
                    maxToRight = array[i];
                    leaders.add(maxToRight);
                }
            }
         Collections.reverse(leaders);
            return leaders;
     }



    //find second largest number
    static Integer findSecondLargest(int[] array){
        Integer secondMax = 0;
        Integer max = 0;
        for(int i=0;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        for (int i=0; i< array.length && array[i]!= max; i++){
            if(array[i] > secondMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }
    static Integer findLargest(int[] array){

        Integer max = 0;
        for(int i=0;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }



    //Finding the alternate arrays using recursions
    static ArrayList<Integer> getAlternates(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        getAlternateRecursive(array,0,arrayList);
        return arrayList;
    }
    static void getAlternateRecursive(int[] array,int i,ArrayList<Integer> arraylist){
        if ( i < array.length){
            arraylist.add(array[i]);
            getAlternateRecursive(array,i+=2,arraylist);
        }
    }
}
