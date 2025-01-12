package org.example.datastructure.LinkedList.examples;

import org.example.datastructure.LinkedList.LinkedListStruct;
import org.example.datastructure.LinkedList.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {


    public static void main(String[] args) {



       // Integer[] numbers = {1,2,3,4,5,6};
        LinkedListStruct linkedListStruct = new LinkedListStruct();
        linkedListStruct.reverseHeadNode();
        for(int i=1;i<5;i++){
            linkedListStruct.insertAtEnd(i);
        }

        linkedListStruct.display();
        System.out.println();
        Node node = linkedListStruct.reverseHeadNode();
        // System.out.println("\nMiddle of Linkedlist = " +
       // linkedListStruct.getMiddle();
       // int i =  linkedListStruct.findLengthOfLinkedList();
      //  System.out.println("\nLength of Linkedlist = " +i);
       // System.out.println("Index of  3 = " + linkedListStruct.findIndex(3));
        //System.out.println("Result = " +  linkedListStruct.getKthFromLast(2));;

    }
}
