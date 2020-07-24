/*
 Trevor Applegate
3/3/2020
CSC 501 Advanced Data Structures
Assignment 2 module 6
class MyStack

Uses class Node

Class to create a stack data structure using a linked list implimentation

Has private variables for Head node and length

Has methods for creating the stack, pushing new nodes to the stack, popping
nodes off the stack, peeking at the head node, popping the head node, getting
the size of the stack.

 */


public class MyStack {
    
    private Node head = null;
    private int length = 0;
    
    public MyStack()
    {
        
    }
    
    //push a new node onto the stack
    public void push(int data)
    {
        Node newNode = new Node(data);//create a new node with int data
        
        if(length>0)//if there are already items in the stack
        {
            newNode.setNext(head);//set newNodes next to previous head
            head = newNode;//move head to new node
            incrimentLength();//increase the length
        }
        //otherwise list is empty and head will not have a next pointer
        else
        {        
        //otherwise its an empty stack, just make newNode head
        head = newNode;
        incrimentLength();//increase the length
        }
    }//end push
    
    public int pop()
    {
        //if stack is empty
        if(length==0)
        {
            return -9999;//default value for empty stack
        }
        
        //otherwise stack is not empty, return head data
        
        Node tempNode = head;//create a temp node to hold data in head
        
        head=head.getNext();//set head to next
        
        decrimentLength();//decrease the length of the stack
        
        return tempNode.getData();//returns the data in tempNode        
    }//end pop()
    
    //check to see if list is empty, returns true for empty, false otherwise
    public boolean isEmpty()
    {
        //if list is empty
        if(head==null)
        {
            return true;//return true
        }
        
        //otherwise return false
        return false;
    }//end isEmpty()
    
    //incriment length
    private void incrimentLength()
    {
        length++;
    }//end incriment length
    
    //decriment length
    private void decrimentLength()
    {
        length--;
    }//end decriment length
    
    //look at the data in the top node of the stack
    public int peek()
    {
        //if stack is empty
        if(length==0)
        {
            return -9999;//return default value for empty stack
        }        
        
        //return int data stored in head
        return head.getData();        
    }//end peek
    
    //get the length of the list
    public int getSize()
    {
        return length;//return the length of the list
    }//end getSize
    
}//end stack class



