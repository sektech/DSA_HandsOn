package org.example.datastructure.recursion;

public class Demo {

    public static void main(String[] args) {
        System.out.println(fab(3));
        int[] array = {1,2,4,5,6,7,8};
        System.out.println("Found the record : " + binRecursive(array,2,0,array.length-1));
    }


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
    static int binRecursive(int[] arry,int target,int left, int right){
            if(left > right)
                return -1;
            int m = (left+right)/2;
            if (arry[m] == target)
                return arry[m];
            else if (target > arry[m] )
                return binRecursive(arry,target,m+1, right);
            else
               return binRecursive(arry,target,left, m - 1);
    }

    static void  print(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int fab(int n){
      //  System.out.print( n + " ");
        if( n < 2){
            return n;
        }

       return fab(n-1) + fab(n-2);

    }
}
