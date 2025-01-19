package org.example.datastructure.Stack;

public class UserDemoClient {

    public static void main(String[] args) {

        StackViaLinkedList stackViaLinkedList = new StackViaLinkedList();
        stackViaLinkedList.push(10);
        stackViaLinkedList.push(20);
        stackViaLinkedList.push(30);
        stackViaLinkedList.push(40);
        stackViaLinkedList.push(50);
        stackViaLinkedList.display();
        System.out.println();
        System.out.println("Top data " + stackViaLinkedList.peak());
        for(int i = 0;i<8;i++) {
            System.out.println("Popped data from Stack :  " + stackViaLinkedList.pop());
        }
        /*

        StackViaArray stack = new StackViaArray();
        for (int i= 0;i<10;i++){
            System.out.println( stack.push(i) == true? "Record Inserted successfully" : "Record Not Inserted successfully");

        }

        System.out.println("Top recod from stack = " + stack.peek());

        for (int i= 0;i<15;i++){
            System.out.println("Record retrieved from stack = " + stack.pop());
        }
    */
    }
}
