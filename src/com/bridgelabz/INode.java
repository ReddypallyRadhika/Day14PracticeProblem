/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public interface INode<K> {
	K getKey();

	void setKey(K Key);

	INode<K> getNext();

	void setKey(INode<K> next);

	void setNext(INode<K> tempNode);

}
