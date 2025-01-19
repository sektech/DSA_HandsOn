package org.example.datastructure.Tree;

import java.util.Scanner;

public class TreeDemo {

    public static void main(String[] args) {
        TreeDemo demo = new TreeDemo();
        demo.populate(new Scanner(System.in));
        demo.display();
    }
    public Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node :");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void display(){
        display(root, "Root -->");
    }
    public void display(Node node, String text){
        if(node != null){
            System.out.println(text + node.data);
        }
        if(node.left !=null) display(node.left, "\t left-->");
        if(node.right != null) display(node.right, "\t right-->");
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left node of " + node.data);
        boolean left = scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of left node :" + node.data);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node);
        }
        System.out.println("Do you want to enter the right node of " + node.data);
        boolean right = scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value of right node :" + node.data);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node);
        }

    }
}
