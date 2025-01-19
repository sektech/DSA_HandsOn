package org.example.datastructure.Stack;

public class StackViaLinkedList {
        private Node head;


        public boolean push(int data){
            Node newNode = new Node(data);
            if(head == null) {
               newNode.nextNode = head;
               head = newNode;
           }else
           {
            Node temp = head ;
            newNode.nextNode = temp;
            head = newNode;
           }
            return true;
        }

        public void display(){
            Node node = head;
            while (node!=null){
                System.out.print(node.data + "\n |  \n ");
                node = node.nextNode;
            }
        }

    public int pop() {
        int popData = -1;
        if (head !=null){
            popData = head.data;
            head  = head.nextNode;
        }
        return popData;
    }
    public int peak(){
            if (head != null){
                return head.data;
            }
            else
            {
                System.out.println("stack is empty");
                return -1;
            }
    }
}
