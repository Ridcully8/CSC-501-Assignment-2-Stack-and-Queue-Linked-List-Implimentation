/*
Trevor Applegate
3/3/2020
CSC 501 Advanced Data Structures
Assignment 2 module 6
class MyQueue

Class to create a queue data structure using alinked list implimentation
has private variables for current length, total capacity, head and tail nodes
Has methods for adding to the queue, popping from the queue, peeking at the head
of the queue, getting current size, total capacity, and checking if queue is 
empty

Uses class Node
 */
public class MyQueue {
    
    //int for length
    private int length=0;
    
    //int for capacity
    private int capacity;
    
    //private nodes to point to head and tail node
    private Node head;
    private Node tail;
    
    //default queue with length of 10
    public MyQueue()
    {
        capacity =10;
    }//end MyQueue
    
    //constructor for a queue of user supplied length
    MyQueue(int capacity)
    {
       this.capacity=capacity; 
    }//end MyQueue for user supplied length
    
    
    //functionto add an int to the end of the queue
    public void enqueue(int x)
    {        
        //create new node to add
        Node newNode = new Node(x);
        
        //if queue is empty
        if(length==0)
        {            
            //set head and tail to the new node
            head = newNode;
            tail=newNode;
            
            //incriment length
            incrimentLength();            
        }//end adding to empty queue
        
        //check if queue is full, cannot add to a full queue
        else if(length==capacity)
        {
            System.out.println("Error Queue is full, cannot enqueue to a full queue");
        }
        
        //add to a non empty and non fullqueue
        else if(length<capacity)
        {
            //set new nodes next pointer to previous tail
            tail.setNext(newNode);
            
            //update tail pointer
            tail=newNode;
            
            //ncriment length
            incrimentLength();
            
        }//end adding node to a non empty and non full queue        
        
    }//end enqueue
    
    //return the first item in the queue and pop the node from the queue
    //returns -9999 if queue is empty
    public int dequeue()
    {
        //if queue is empty return -9999
        if(length==0)
        {
            return -9999;
        }//end if for empty queue
        
        //create new node to add
        
        //create an int to hold the data in head
        int temp;
        
        //set temp to the data stored in head
        temp = head.getData();
        
        //set head to the node after head
        head = head.getNext();
        
        //decriment length
        decrimentLength();
        
        return temp;    
        
    }//end dequeue
    
    //return int value contained in the head node WITHOUT popping it
    public int peek()
    {
        //if the queue is empty
        if(length==0)
        {
            return -9999;
        }
        
        //returns the data in head node
        return head.getData();
    }//end peek
    
    
    //getSize of the queue
    public int getSize()
    {
        //returns length
        return length;
    }//end getSize
    
    //get capacity of the queue
    public int getCapacity()
    {
        //returns capacity
        return capacity-length;
    }//end getCapacity
    
    //is empty, returns true if empty, false otherwise
    public boolean isEmpty()
    {
        if(length==0)//checks for empty queue
        {
            return true;
        }        
        //otherwise its not empty
        return false;
        
    }//end isEmpty
    
    //check if there is spare capacity, returns true if there is capacity, false otherwise
    public boolean isFull()
    {
        if(length==capacity)//if length is equal to capacity, queue is full
        {
            return true;
        }
        
        //otherwise its not full
        return false;
    }//end isFull
    
    //incriment length
    private void incrimentLength()
    {
        length++;
    }//end incriment length
    
    //decriment length
    private void decrimentLength()
    {
        length--;
    }//end decrimentLength
    
}//end MyQueue class
