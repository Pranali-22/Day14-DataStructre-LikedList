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
	        NodeClass<Integer> fourthNode = new NodeClass<Integer>(40);
	        
	        NodeClass<Integer> nodeList = new NodeClass<Integer>();
	        	               
	        nodeList.AddNodeInAscendingOrder(firstNode);
	        nodeList.AddNodeInAscendingOrder(secondNode);
	        nodeList.AddNodeInAscendingOrder(thirdNode);
	        nodeList.AddNodeInAscendingOrder(fourthNode);
	        
	        nodeList.displayLinkedList();
	       
	    }
}