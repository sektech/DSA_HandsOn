package org.example.datastructure.Array;

public class CloneArraryMethod_Demo {

    public static void main(String[] args) {

        int Array[] = {1,2,3,4,5};

        for (int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] copyArry = Array.clone();
        for (int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n" + Array.toString() + " " + copyArry.toString());
    }
}
