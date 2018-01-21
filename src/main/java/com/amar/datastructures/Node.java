package com.amar.datastructures;

public class Node {

	private int index;
	private Object value;
	private Node next;

	public Node(Object value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [index=" + index + ", value=" + value + ", next=" + next + "]";
	}
}
