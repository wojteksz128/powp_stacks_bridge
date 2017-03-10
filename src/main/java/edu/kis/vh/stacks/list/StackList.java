package edu.kis.vh.stacks.list;

public class StackList {

	private Node last;

	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty()) {
			return -1;
		}
		return last.getValue();
	}

	public int pop() {
		if (empty()) {
			return -1;
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
