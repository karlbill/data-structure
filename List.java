//Data Structure: Linked List
package com.karlbill.datastructures;

import com.karlbill.datastructures.Node;
import com.karlbill.datastructures.EmptyListException;

public class List<T>{
	private Node<T> firstNode;
	private Node<T> lastNode;
	private String name;

	public List(){
		this("list");
	}

	public List(String listName){
		name = listName;
		firstNode = lastNode = null;
	}

	public boolean isEmpty(){
		return firstNode == null;
	}

	public void insertAtFront(T insertItem){
		if(isEmpty())
			firstNode = lastNode = new Node<T>(insertItem);
		else
			firstNode = new Node<T>(insertItem, firstNode);
	}

	public void insertAtBack(T insertItem){
		if(isEmpty())
			firstNode = lastNode = new Node<T>(insertItem);
		else
			lastNode = lastNode.nextNode = new Node<T>(insertItem);
	}

	public T removeFromFront()throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);
		
		T removedItem = firstNode.data;

		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
				
		return removedItem;
	}

	public T removeFromBack() throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);
		
		T removedItem = lastNode.data;

		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else{
			Node<T> current = firstNode;
			
			while(current.nextNode != lastNode)
				current = current.nextNode;

			lastNode = current;
			current.nextNode = null;
		}

		return removedItem;
	}

	public void print(){
		if(isEmpty()){
			System.out.printf("Empty %s%n", name);
			return;
		}

		System.out.printf("The %s is: ", name);
		
		Node<T> current = firstNode;
		while(current != null){
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		System.out.println();
	}
}








