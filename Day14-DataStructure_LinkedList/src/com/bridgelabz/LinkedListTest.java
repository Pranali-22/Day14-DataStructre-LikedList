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
	        
	        /*// add nodes at start to nodeList 
	        nodeList.addNodeAtStart(thirdNode);	        
	        nodeList.addNodeAtStart(secondNode);	        
	        nodeList.addNodeAtStart(firstNode);    
	        */
	        
	        // add nodes at end of nodeList 
	        nodeList.addNodeAtEnd(firstNode);	        
	        nodeList.addNodeAtEnd(secondNode);	        
	        nodeList.addNodeAtEnd(thirdNode);
	        
	        
	        //add node at middle of linked list
	        /*nodeList.addNodeAtEnd(firstNode);	        
	        nodeList.addNodeAtEnd(thirdNode);
	        nodeList.addNodeAtMiddle(firstNode, thirdNode, secondNode);
	        */
	        
	        
	        //Delete first element in linked list
	        //nodeList.pop();
	        
	        //Delete last element in linked list
	        nodeList.popLast();
	        
	        //display the linked list
	        System.out.println("\nDisplaying Entire Linked list");
	        nodeList.displayLinkedList();

	    }
}
