package org.example.datastructure.BinaryTreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class DemoClient {

    public static void main(String[] args) {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.left = new BinaryNode(2);
        binaryNode.left.left = new BinaryNode(4);
        binaryNode.left.right = new BinaryNode(5);
        binaryNode.right = new BinaryNode(3);
        binaryNode.right.right = new BinaryNode(6);
        inOrderTraversal(binaryNode);
        System.out.println();
        preOrderTraversal(binaryNode);
        System.out.println();
        postOrderTraversal(binaryNode);
        System.out.println();
        DepethFirstSearch(binaryNode);
    }

    private static  void DepethFirstSearch(BinaryNode root){
        System.out.println("Breath first search");
        if (root == null)
            return;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode node = queue.poll();
            if(node !=null) {
                System.out.print(node.data + "-->");
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    private static void postOrderTraversal(BinaryNode binaryNode) {
        if(binaryNode == null)
            return;
        inOrderTraversal(binaryNode.left);
        inOrderTraversal(binaryNode.right);
        System.out.print(binaryNode.data + " -> ");

    }

    static void inOrderTraversal(BinaryNode binaryNode){
        if(binaryNode == null)
            return;
        inOrderTraversal(binaryNode.left);

        System.out.print(binaryNode.data + " -> ");

        inOrderTraversal(binaryNode.right);
    }
    static void preOrderTraversal(BinaryNode binaryNode){
        if(binaryNode == null)
            return;

        System.out.print(binaryNode.data + " -> ");
        inOrderTraversal(binaryNode.left);
        inOrderTraversal(binaryNode.right);
    }

}
