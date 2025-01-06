package org.example.datastructure.LinkedList;

import java.util.Arrays;

public class ClientDemo {

    public static void main(String[] args) {
        LinkedListStruct linkedListStruct = new LinkedListStruct();
        linkedListStruct.insertAtStart(23);
        linkedListStruct.insertAtStart(25);
        linkedListStruct.insertAtEnd(26);
        linkedListStruct.insertAtStart(22);
        linkedListStruct.insertAtStart(21);
       // head-->21-->22-->24-->25-->23-->26
        //head-->21-->22-->25-->23-->
        //head-->21-->24-->25-->23-->26
        linkedListStruct.insertAt(24,2);
        linkedListStruct.display();
       // linkedListStruct.deleteAtPost(1);
        linkedListStruct.deleteAtPost(3);
     //   linkedListStruct.deleteLastNode();
       // linkedListStruct.deleteLastNode();
      //  linkedListStruct.deleteFirstNode();
        //linkedListStruct.deleteFirstNode();

        System.out.println();
        linkedListStruct.display();
        System.out.println();
        System.out.printf( linkedListStruct.searchLinkedList(34) >0 ? "Record %s found" : "Record %s not found", 34);

       // linkedListStruct.delete(23);
    }
}
