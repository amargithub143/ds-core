package com.amar.datastructures;

/**
 * @author R
 *
 */
public class SingleLinkedList {

	private Node head;
	private Node tail;

	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insert(Object obj, Integer position) throws Exception {
		if (position == null) {
			if (head == null) {
				Node node = new Node(obj, null);
				head = node;
				tail = node;
				node.setIndex(1);
			} else if (head == tail) {
				Node node = new Node(obj, null);
				node.setIndex(tail.getIndex() + 1);
				tail = node;
				head.setNext(tail);
			} else {
				Node node = new Node(obj, null);
				node.setIndex(tail.getIndex() + 1);
				tail.setNext(node);
				tail = node;
			}
		} else {

			Node nextNode = getNode(position);
			nextNode.setIndex(position + 1);

			Node targetNode = new Node(obj, null);
			targetNode.setIndex(position);
			targetNode.setNext(nextNode);

			Node previousNode = getNode(position - 1);
			previousNode.setNext(targetNode);

			while (nextNode.getNext() != null) {
				int index = nextNode.getIndex();
				System.out.println(nextNode.getIndex());
				nextNode = nextNode.getNext();
				nextNode.setIndex(index + 1);
			}
		}
	}

	public void traverse() {
		Node node = head;
		while (node != null) {
			System.out.println("The Node is =====>>>" + node);
			node = node.getNext();
		}
	}

	public void delete() throws Exception {
		if (head == null) {
			throw new Exception("The Linked List is empty");
		} else if (head != null && head == tail) {
			head = null;
			tail = null;
		} else {
			Node node = head;
			while (node != null) {
				if (node.getNext() == tail) {
					node.setNext(null);
					tail = node;
				}
				node = node.getNext();
			}
		}
	}

	public Node getNode(int position) throws Exception {

		if (position < head.getIndex() || position > tail.getIndex()) {
           throw new Exception("Index is greater or less than,pls check");
		}

		Node node = head;
		Node resultNode = null;
		while (node != null) {
			if (node.getIndex() == position) {
				resultNode = node;
			}
			node = node.getNext();
		}
		return resultNode;
	}

	public static void main(String[] args) throws Exception {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insert("AMAR1", null);
		singleLinkedList.insert("AMAR2", null);
		singleLinkedList.insert("AMAR3", null);
		singleLinkedList.insert("AMAR4", null);

		singleLinkedList.insert("AMAR5", null);

		singleLinkedList.traverse();

		System.out.println("The SingleLinked List is ===========>>>>>>>>>>" + singleLinkedList);

		// singleLinkedList.delete();

		// System.out.println("The SingleLinked List is ===========>>>>>>>>>>" +
		// singleLinkedList);

		singleLinkedList.traverse();

		singleLinkedList.insert("AMAR6", 10);

		// System.out.println("The Node at specific Index is " +
		// singleLinkedList.getNode(4));
		System.out.println("The SingleLinked List is ===========>>>>>>>>>>" + singleLinkedList);
		singleLinkedList.traverse();

	}
}
