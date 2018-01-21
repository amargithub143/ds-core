package com.amar.datastructures;

public class Stack {

	private int top;
	private int capacity;

	private Object[] stackObjArray;

	public Stack() {
		top = -1;
		this.capacity = 5;
		this.stackObjArray = new Object[capacity];
	}

	public void push(Object object) {
		top = top + 1;

		if (top == capacity) {
			Object[] newArray = stackObjArray;
			increaseSize();
			copyTheData(newArray, stackObjArray);
		}
		stackObjArray[top] = object;
	}

	private void copyTheData(Object[] srcArray, Object[] targetArray) {
		for (int i = 0; i < srcArray.length; i++) {
			stackObjArray[i] = srcArray[i];
		}
	}

	private void increaseSize() {
		capacity = capacity + 5;
		stackObjArray = new Object[capacity];
	}

	public void pop() {
		stackObjArray[top] = null;
		top = top - 1;
	}

	public Object topValue() {
		return stackObjArray[top];
	}

	public Object fetchValueAtSpecficIndex(int i) throws Exception {
		if (i > capacity) {
			throw new Exception();
		} else {
			return stackObjArray[i];
		}
	}

	public void traverseStack() {

		for (Object object : stackObjArray) {
			if (object != null) {
				System.out.println("The Value is ========" + object);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);

		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);

		stack.push(20);

		stack.push(21);

		System.out.println("The top value is ===========>>>>" + stack.topValue());

		stack.pop();

		System.out.println("The top value is ===========>>>>" + stack.topValue());

		stack.traverseStack();

		System.out.println("The value at index is =======>>>>" + stack.fetchValueAtSpecficIndex(05));

		stack.pop();
		stack.traverseStack();

	}

}
