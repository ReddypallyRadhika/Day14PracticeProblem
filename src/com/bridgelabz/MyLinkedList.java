/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class MyLinkedList<K> implements INode<Integer> {

	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList(int i) {

		// TODO Auto-generated constructor stub
	}

	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	public void append(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.tail;
			this.tail = newNode;
			this.tail.setNext(tempNode);
		}
	}

	public void printMyNodes()
	{
		System.out.println("My Nodes:"+head);
	}

	public  INode<K> pop()
	{
		INode<K> tempNode = this.head;
		this.head=head.getNext();
		return tempNode;
	}
	public  INode<K> pop1()
	{
		INode<K> tempNode = this.tail;
		this.tail=tail.getNext();
		return tempNode;
	}
	@Override
	public Integer getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(Integer Key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public INode<Integer> getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(INode<Integer> next) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNext(INode<Integer> tempNode) {
		// TODO Auto-generated method stub
		
	}
}
