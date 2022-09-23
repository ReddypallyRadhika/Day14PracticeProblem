/**
 * 
 */
package com.bridgelabz;

/**
 * UC1 Lets create a simple Linked List of 56, 30 and 70
 */

public class MyNode<K> {
	private K key;
	private MyNode<K> next;

	/**
	 * @param key
	 */
	public MyNode(K key) {

		this.setKey(key);
		this.setNext(null);
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
	public MyNode<K> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(MyNode<K> next) {
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to linked list");
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

	}

}
