/**
 * 
 */
package com.bridgelabz;
import java.util.*;

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
	        
	        NodeClass<Integer> nodeList = new NodeClass<Integer>();
	        	        
	        // add nodes at end of nodeList 
	        nodeList.addNodeAtEnd(firstNode);	        
	        nodeList.addNodeAtEnd(secondNode);	        
	        nodeList.addNodeAtEnd(thirdNode);
	        
	        System.out.println();
	        
	        //Add node with value 40 next to 30
	        System.out.println("Add node with value 40 next to node with value 30 ");
	        NodeClass<Integer> fourthNode = new NodeClass<Integer>(40);
	        nodeList.addNode(fourthNode);
	        
	        
	        //display the linked list
	        System.out.println("\nDisplaying Entire Linked list");
	        nodeList.displayLinkedList();

	    }
}
