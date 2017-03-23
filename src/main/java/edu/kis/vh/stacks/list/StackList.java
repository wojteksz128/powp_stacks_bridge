package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.Stack;

/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">stack</a> data structure. This structure in basically implement two methods: 
 * <br>   - {@link StackList#pushElement(int)} - add element into the stack,
 * <br>   - {@link StackList#pop()} - get last added element from the stack and remove it.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class StackList {

	/**
	 * Value returned, when stack is empty.
	 */
	public static final int STACK_EMPTY = -1;
	
	private Node last;
	
	/**
	 * Index of last inserted value into the stack. If stack is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return index of last inserted value
	 */
	public int getTotal() {
		int count = -1;
		Node current = last;
		
		while (current != null) {
			++count;
			current = current.getPrev();
		}
		
		return count;
	}

	/**
	 * Insert value into the stack.
	 * 
	 * @param i inserted value
	 */
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Returns true if the stack contains no elements.
	 * 
	 * @return true if this stack contains no elements
	 */
	public boolean isEmpty() {
		return last == null;
	}

	// TODO: This method is needed? 
	/**
	 * Returns true if stack cannot storied more elements.
	 * 
	 * @return true if this stack cannot storied more elements
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Return last inserted value from the stack without removing it. If stack is empty, than return {@link StackList#STACK_EMPTY}.
	 * 
	 * @return last inserted value
	 */
	public int top() {
		if (isEmpty()) {
			// TODO: Maybe if list is empty, than method should throw exception just like 'EmptyListException'.
			return STACK_EMPTY;
		}
		return last.getValue();
	}

	/**
	 * Return last inserted value from the stack and remove it. If stack is empty, than return {@link StackList#STACK_EMPTY}.
	 * 
	 * @return last inserted value
	 */
	public int pop() {
		if (isEmpty()) {
			// TODO: Maybe if list is empty, than method should throw exception just like 'EmptyListException'.
			return STACK_EMPTY;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
	
	class Node {

		private final int value;		// Zmiana odwoływania się do pola za pomocą getera
		private Node prev;		// Zmiana odwoływania się do pola za pomocą getera
		private Node next;		// Zmiana odwoływania się do pola za pomocą getera

		public Node(int i) {
			value = i;
		}

		int getValue() {
			return value;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(Node prev) {
			this.prev = prev;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}

	}


}
