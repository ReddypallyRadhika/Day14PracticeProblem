/**
 * 
 */
package com.bridgelabz;

/**UC3
 * Ability to create Linked List by appending 30 and 70 to 56
 * - Node with data 56 is First Created
 * - Next Append 30 to 56
 * - Finally Append 70 to 30
 * - LinkedList Sequence: 56->30->70
 */

public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;

	/**
	 * @param key
	 */
	public MyNode(K key) {

		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the next
	 */
	public INode<K> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(MyNode<K> next) {
		this.next = next;
	}

	@Override
	public void setKey(INode<K> next) {
		// TODO Auto-generated method stub
this.next=next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder myNodeString=new StringBuilder();
		myNodeString.append("MyNode{"+"key=").append(key).append("}");
		if(next!=null)
		{
		myNodeString.append("-->").append(next);
		
		}
		return myNodeString.toString();
	}

	

	@Override
	public void setNext(INode<K> tempNode) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to linked list");
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		MyLinkedList<Integer> firstNode1= new MyLinkedList<Integer>(56);
		MyLinkedList<Integer> secondNode1 = new MyLinkedList<Integer>(30);
		MyLinkedList<Integer> thirdNode1 = new MyLinkedList<Integer>(70);
		firstNode1.add((INode<Integer>) secondNode1);
		secondNode1.add((INode<Integer>) thirdNode1);
		
		MyLinkedList<Integer> firstNode2= new MyLinkedList<Integer>(56);
		MyLinkedList<Integer> secondNode2 = new MyLinkedList<Integer>(30);
		MyLinkedList<Integer> thirdNode2 = new MyLinkedList<Integer>(70);
		firstNode2.append((INode<Integer>) secondNode2);
		secondNode2.append((INode<Integer>) thirdNode2);
		
		//MyLinkedList<Integer> popNode1= new MyLinkedList<Integer>(56);
		//popNode1.pop();
	}

}
