//Data Structure: Linked List
package com.karlbill.datastructures;


public class Node<T>{
	T data;
	Node<T> nextNode;

	Node(T object){
		this(object, null);
	}

	Node(T object, Node<T> node){
		data = object;
		nextNode = node;
	}

	T getData(){
		return data;
	}

	Node<T> getNext(){
		return nextNode;
	}
}