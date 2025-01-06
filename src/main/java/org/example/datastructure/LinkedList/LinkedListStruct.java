package org.example.datastructure.LinkedList;

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
}
