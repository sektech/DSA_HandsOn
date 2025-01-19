package org.example.datastructure.Stack;

public class StackViaArray {
    static final Integer MAX = 1000;
    int top;
    int[] stactData = new int[MAX];

    public StackViaArray(){ top = -1;}

    public boolean push(int data){
        if (top > MAX - 1) {
            System.out.println("Stack is overflow");
            return false;
        }else
        {
            stactData[++top] = data;
            return true;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else
        {
           return stactData[top--];
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else
        {
            return stactData[top];
        }
    }
}
