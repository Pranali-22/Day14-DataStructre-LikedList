/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class NodeClass<K extends Comparable<K>> implements NodeInterface{

	    private K key;
	    private NodeClass next;
		private NodeClass head; 
		private NodeClass tail;
	   
		//Constructors
		public NodeClass(K key) {
		       
	        this.key = key;
	        this.next = null;
	        this.head = null;
	        this.tail = null;
	    }
	   
	    public NodeClass() {
	    	this.key = null;
	        this.next = null;
	        this.head = null;
	        this.tail = null;
		}

		//getter and setter methods
		public K getKey() {
			return key;
		}
		
		public void setKey(K key) {
			this.key = key;
		}
		
	    public NodeClass<K> getNext() {
			return next;
	    }

	    public void setNext(NodeClass<K> nextNode) {
	    	nextNode.next = this;		
		}
	    
	    public NodeClass<K> getHead() {
			return head;
		}
	    
	    public void setHead(NodeClass<K> head) {
			this.head = head;
		}
	    
	    	    
	    //function to display linked list
	    public void displayLinkedList()
	    {
	        if(head == null)
	            System.out.println("Empty Linked list");
	        else{
	        	NodeClass<K> node = this.getHead();
		    	while(node.next != null){	    		
		    		System.out.print(node.getKey()+" -> ");
		    		node = node.next;	    		
		    	}
		    	System.out.print(node.getKey());
	        }
	    }

	    //Function to add node at start of linked list
	    public void addNodeAtStart(NodeClass newNode)
	    {
	        if (head == null)
	        {
	            head = newNode;
	            newNode.next = null;
	        }else
	        {
	            NodeClass temp = head;
	            head = newNode;
	            newNode.next = temp;
	        }
	        System.out.println("\nLinked list after adding "+newNode.key+" at start");
	    	this.displayLinkedList();
	    }
	    
	    ////Function to add node at end of linked list
	    public void addNodeAtEnd(NodeClass newNode)
	    {
	    	if ( head == null){
	            head = newNode;
	            tail = newNode;
	            newNode.next = null;
	        }
	    	else{
	    		
	            tail.next = newNode;
	            newNode.next =null;
	            tail = tail.next;
	        }
	        System.out.println("\nLinked list after adding "+newNode.key+" at end");
	    	this.displayLinkedList();

	    }
	    
	    ////Function to add node at middle of linked list
	    public void addNodeAtMiddle(NodeClass node1, NodeClass node2, NodeClass nodeToAdd) {
	    	System.out.println("\nLinked list before adding "+nodeToAdd.key+" in middle");
	    	this.displayLinkedList();
	    	
	    	node1.next = nodeToAdd;
	    	nodeToAdd.next =  node2;
	    	
	    	System.out.println("\nLinked list after adding "+nodeToAdd.key+" in middle");
	    	this.displayLinkedList();
	    }
	    
	    //Function to delete first node from linked list
	    
	    public void pop() {
	    	if(head == null) {
	    		System.out.println("Empty Linked list"); 
	    	}
	    	else {
	    		head = head.next;
	    	}
	    	System.out.println("\nLinked list after pop ");
	    	this.displayLinkedList();
	    }

	    //Function to remove last node from linked list
		public void popLast() {
			if(head == null) {
	    		System.out.println("Empty Linked list"); 
	    	}
	    	else {
	    		NodeClass temp = head;
	    		while(temp.next.next != null) {
	    			temp = temp.next;
	    		}
	    		temp.next = null;
	    	}
	    	System.out.println("\nLinked list after poping last node ");
	    	this.displayLinkedList();
		}
		
		//Function to search for a key
		public NodeClass findNodeUsingKey(Integer searchKey) {			
			if(head == null) {
	    		System.out.println("Empty Linked list"); 
	    		return null;
	    	}
			NodeClass temp = head;
			while(head!=null) {
				if(temp.key == searchKey) {
					System.out.println("Key "+temp.key+" found.");
					return temp; 
				}
				
				temp = temp.next;				
			}
			return null;
		}
		
		
		//Add node to linkedlist
	    public void addNode(NodeClass newNode) {
	    	  
	    	NodeClass<K> resultNode = findNodeUsingKey(30);	    	
	    	newNode.next =  resultNode.next;
	    	resultNode.next = newNode;
	    }

}
