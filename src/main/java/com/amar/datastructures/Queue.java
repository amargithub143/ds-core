package com.amar.datastructures;

/**
 * @author R
 *
 */
public class Queue {

	private int front;
	private int rear;
	private int capacity;

	private Object[] objectArr;

	private Queue() {
		front = -1;
		rear = -1;
		capacity = 5;
		objectArr = new Object[capacity];
	}

	public Object frontValue() throws Exception {
		if (front == -1) {
			System.out.println("The Array is Empty");
			throw new Exception();
		}
		return objectArr[front];
	}

	public Object rearValue() {
		if (rear == -1) {
			System.out.println("The Array is Empty");
		}
		return objectArr[rear];
	}

	public void traverseQueue() {
		for (Object object : objectArr) {
			if (object != null) {
				System.out.println("The Value is ========>>>>" + object);
			}
		}
	}

	public void push(Object obj) {
		if (front == -1) {
			front = front + 1;
		}
		if (rear == capacity - 1) {
			Object[] tempArr = objectArr;
			capacity = capacity + 5;
			objectArr = new Object[capacity];
			for (int i = 0; i < tempArr.length; i++) {
				objectArr[i] = tempArr[i];
			}
		}
		rear = rear + 1;
		System.out.println("The size is =========>>>>" + objectArr.length);
		objectArr[rear] = obj;

	}

	public void pop() throws Exception {
		if (front == -1) {
			System.out.println("The Array is empty");
			throw new Exception();
		}
		objectArr[front] = null;
		front = front + 1;
	}

	public static void main(String[] args) throws Exception {
		Queue obj = new Queue();
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);

		obj.push(600);

		obj.traverseQueue();
	}

}
