/*
 * Użyteczne funkcje:
 *    - Refactor -> Rename
 */

package edu.kis.vh.stacks.stackimplementation;

/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">stack</a> data structure. This structure in basically implement two methods: 
 * <br>   - {@link StackList#pushElement(int)} - add element into the stack,
 * <br>   - {@link StackList#pop()} - get last added element from the stack and remove it.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class StackList implements Stackable {

	private Node last;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#getTotal()
	 */
	@Override
	public int getTotal() {
		int count = -1;
		Node current = last;
		
		while (current != null) {
			++count;
			current = current.getPrev();
		}
		
		return count;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#push(int)
	 */
	@Override
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	// TODO: This method is needed? 
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#isFull()
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#top()
	 */
	@Override
	public int top() {
		if (isEmpty()) {
			// TODO: Maybe if list is empty, than method should throw exception just like 'EmptyListException'.
			return Stackable.STACK_EMPTY;
		}
		return last.getValue();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty()) {
			// TODO: Maybe if list is empty, than method should throw exception just like 'EmptyListException'.
			return Stackable.STACK_EMPTY;
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
