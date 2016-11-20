package basic.ds.algo.common;

public class LinkList<TT> {
	public int Count = 0;

	private class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	// Top element
	private Node<TT> head;
	private Node<TT> tail;

	public void setHead(Node<TT> node) {
		head = node;
	}

	public Node<TT> getHead() {
		return this.head;
	}

	public boolean AddAfter(TT data) {

		if (Count <= 0)
			return false;

		if (data == null)
			return false;

		Node<TT> currentElem = head;
		// First element.
		if (this.head.data.equals(data)) {
			Node<TT> newElement = new Node<TT>(data);
			newElement.next = this.head.next;
			head.next = newElement;
			Count++;
			return true;
		}
		/*
		 * if(this.tail.data.equals(data)){ Node<TT> newElement = new
		 * Node<TT>(data); newElement.next = null; tail.next = newElement; tail
		 * = newElement; return true; }
		 */
		// Middle element.
		while (currentElem.next != null) {
			if (currentElem.next.data.equals(data)) {
				Node<TT> newElement = new Node<TT>(data);
				newElement.next = currentElem.next;
				currentElem.next = newElement;
				if (newElement.next == null) {
					tail = newElement;
				}
				Count++;
				return true;
			}
			currentElem = currentElem.next;
		}

		return false;
	}

	public boolean deleteAfter(Node<TT> element) {

		Node<TT> currentElement = this.head;
		// Head null case Case
		if (this.head == null)
			return false;
		// Element null case.
		if (element == null)
			return false;

		// Head match element.
		if (this.head.data.equals(element.data)) {
			this.head = this.head.next;
			if (this.head.next == null) {
				this.tail = null;
			}
			Count--;
			return true;
		}

		// Middle element
		while (currentElement != null && currentElement.next != null) {
			if (currentElement.next.data.equals(element.data)) {
				currentElement.next = element.next;
				if (element.next == null) {
					this.tail = currentElement;
				}
				Count--;
				return true;
			}

			currentElement = currentElement.next;
		}
		return false;

	}

	public boolean insertAfter(Node<TT> element, TT data) {
		return false;
	}
}
