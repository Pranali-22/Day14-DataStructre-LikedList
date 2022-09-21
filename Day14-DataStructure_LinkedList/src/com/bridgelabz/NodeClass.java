/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class NodeClass<K extends Object> {

	    private K key;
	    private NodeClass next;  
	   
	    public NodeClass(K key) {
	       
	        this.key = key;
	        this.next = null;
	    }
	   
	    public NodeClass() {
	    	this.key = null;
	        this.next = null;
		}

		public K getKey() {
			return key;
		}

		// link  node to next of current node
	    public void setNext(NodeClass<K> nextNode) {
			this.next = nextNode;
			
		}
	    
	    //Display linked list
	    public void displayLinkedList() {
	    	NodeClass<K> node = this;
	    	while(node.next != null){	    		
	    		System.out.print(node.getKey()+" -> ");
	    		node = node.next;	    		
	    	}
	    	System.out.print(node.getKey());
	    }

}
