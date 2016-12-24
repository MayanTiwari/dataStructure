package helpers;

import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue<E> implements Iterable<E>{

	private LinkedList<E> list = new LinkedList<E>();

	public void enqueue(E item) {
		list.addLast(item);
	}

	public E dequeue() {
		return list.poll();
	}

	public boolean hasItems() {
		return !list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public void addItems(MyQueue<? extends E> q) {
		while (q.hasItems())
			list.addLast(q.dequeue());
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}
