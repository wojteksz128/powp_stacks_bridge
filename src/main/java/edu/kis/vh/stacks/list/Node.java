package edu.kis.vh.stacks.list;

public class Node {

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
