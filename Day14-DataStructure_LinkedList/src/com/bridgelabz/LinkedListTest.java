/**
 * 
 */
package com.bridgelabz;


/**
 * @author Dell
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	
	    public static void main(String[] args) {
	       
	    	//Create nodes and link all nodes
	        	       
	        NodeClass<Integer> firstNode = new NodeClass<Integer>(56);
	        NodeClass<Integer> secondNode = new NodeClass<Integer>(30);
	        NodeClass<Integer> thirdNode = new NodeClass<Integer>(70);
	        
	        // link nodes to previous node
	        firstNode.setNext(secondNode);
	        secondNode.setNext(thirdNode);
	        
	        //display the linked list
	        System.out.println("Displaying Linked list");
	        firstNode.displayLinkedList();

	    }
}
