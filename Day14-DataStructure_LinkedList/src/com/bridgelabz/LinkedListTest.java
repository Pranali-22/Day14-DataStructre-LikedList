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
	       
	        // add nodes to nodeList
	        NodeClass<Integer> nodeList = new NodeClass<Integer>();
	        
	        nodeList.addNodeAtStart(thirdNode);
	        
	        nodeList.addNodeAtStart(secondNode);
	        
	        nodeList.addNodeAtStart(firstNode);        	               
	        
	        //display the linked list
	        System.out.println("\nDisplaying Entire Linked list");
	        nodeList.displayLinkedList();

	    }
}
