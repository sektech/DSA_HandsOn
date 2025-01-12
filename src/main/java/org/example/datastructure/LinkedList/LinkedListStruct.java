package org.example.datastructure.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListStruct {
    private Node head;

    public void display(){
        if (head == null ) {
            System.out.println("Linked List is empty");
            return;
        }
        Node node = head;
        System.out.print("head-->");
        while (node.getNextNode()!=null){
            System.out.print(node.getData() + "-->");
            node = node.getNextNode();
        }
        System.out.print(node.getData());
    }

    public void reverse(){
        if (head == null ) {
            System.out.println("Linked List is empty");
            return;
        }
       Node node = head;
        System.out.print("head-->");
        Stack<Node> newLinkedList = new Stack<>();

        while (node!=null){
            newLinkedList.push(node);
            node = node.getNextNode();
        }
        Node reverseHeadNode =null;
        for (Node node1 : newLinkedList){
            node1.setNextNode(reverseHeadNode);
            reverseHeadNode = node1;
        }

        Node node2 = reverseHeadNode;
        System.out.print("head-->");
        while (node2.getNextNode()!=null){
            System.out.print(node2.getData() + "-->");
            node2 = node2.getNextNode();
        }
        System.out.print(node2.getData());

    }

    public Integer searchLinkedList(int data){
        Node node = head;
        while(node != null && node.getNextNode()!=null){
            if(node.getData()==data){
                return 1;
            }
            node = node.getNextNode();
        }
        return -1;

    }

    public void insertAt(int data,int position){

       if(position == 1){
           Node newNode = new Node(data);
           newNode.setNextNode(head);
           head = newNode;
       }
       Node previousNode = head;
       int count = 1;
       while(count < position - 1 && previousNode!= null){
           previousNode = previousNode.getNextNode();
           count++;
       }
       //3rd pos   -   1(1) 2(2) 3(3)  4 5
        Node newNode = new Node(data);
        newNode.setNextNode(previousNode.getNextNode());
        previousNode.setNextNode(newNode);
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
        {
            Node node = head;
            while (node.getNextNode()!=null){
                node = node.getNextNode();
            }
            node.setNextNode(newNode);
        }
    }

    public void deleteFirstNode(){

        if (head==null) {
            System.out.println("\n No records to delete");
            return;
        }
        Node tempNode = head;
        head = tempNode.getNextNode();

    }

    public void deleteLastNode(){
        if (head==null) {
            System.out.println("\n No records to delete");
            return;
        }
        Node tempNode = head;
        while (tempNode.getNextNode()!=null){
            tempNode = tempNode.getNextNode();
            Node lastTempNode = tempNode.getNextNode();
            if(lastTempNode != null && lastTempNode.getNextNode() == null){
                tempNode.setNextNode(null);
            }
        }
    }


    public void deleteAtPost(int position){
        if(position==1) {
            deleteFirstNode();
            return;
        }
        Node currentHead = head;
        for(int i = 1; i < position - 1 && currentHead !=null ;i++){
            currentHead = currentHead.getNextNode();
        }
        Node currentToNext = currentHead.getNextNode();
        currentHead.setNextNode(currentToNext.getNextNode());
    }

    public int findLengthOfLinkedList(){
        Node node = head;
        int count = 1;
        if(node == null){
            return 0;
        }
        while(node.getNextNode()!=null)
        {
            node = node.getNextNode();
            count++;
        }
        return count;
    }
    public int findIndex(int data){
        Node node = head;
        int count = 0;
        if(node == null){
            return -1;
        }

        while(node.getNextNode()!=null)
        {
            if(node.getData() == data)
                return count;
            node = node.getNextNode();
            count++;
        }
        return -1;
    }

    public int getKthFromLast(int k){
        Node node = head;
        int count = 1;
        if(node == null){
            return 0;
        }
        while(node.getNextNode()!=null)
        {
            node = node.getNextNode();
            count++;
        }
        int IndexToFind = count-k;
        if (IndexToFind < 0) return 0;
        node = head;
        for(int i= 0; i< IndexToFind;i++){
            node = node.getNextNode();
        }
        return node.getData();
    }
    public int getMiddle(){
        Node node= head; int count = 1;
        if (head == null) return 0;
        while(node!=null)
        {
            node = node.getNextNode();
            count++;
        }

        System.out.println("\n reminder : " + count/2);
        node = head;
        for(int i = 0; i< count/2;i++){
            node = node.getNextNode();
        }
        System.out.println("\n middle node: " + node.getData());
        return  node.getData();

    }

    public Node reverseHeadNode(){
        Node newReversedNode = null;
        Node node = head;
        while(node!= null){
            Node newNode = new Node(node.getData());
            newNode.setNextNode(newReversedNode);
            newReversedNode = newNode;
            node = node.getNextNode();
        }
        return newReversedNode;
    }


}
