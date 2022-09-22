/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public interface NodeInterface {
	
	public void displayLinkedList();
	
	public void addNodeAtStart(NodeClass node);
	
	public void addNodeAtEnd(NodeClass node);
	
	public void addNodeAtMiddle(NodeClass node1, NodeClass node2, NodeClass nodeToAdd);
	
	public void pop();
	
	public void popLast();

}
