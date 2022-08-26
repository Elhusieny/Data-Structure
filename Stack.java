package com.example.stack;
public class Stack {
    int top=0;
    int []arr=new int[100];

    public void push(int val)
    {
        if(top==99)
            System.out.println("array is full");
        top++;
        arr[top]=val;

    }
    public void pop()
    {
        top--;

    }
    public int top()
    {
        if(isEmpty())
            System.out.println("stack is empty");

       return arr[top];
    }
    boolean isEmpty()
    {
        return true;
    }

    public static void main(String[] args) {

        Stack s=new Stack();

        s.push(5);
        s.push(6);
        s.push(7);
        s.push(9);


        while(!s.isEmpty())
        {
            System.out.println(s.top());
            s.pop();
        }


    }
}