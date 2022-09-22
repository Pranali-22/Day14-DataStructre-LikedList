/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class NodeClass<K extends Object> implements NodeInterface{

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
}
