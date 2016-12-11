package basic.ds.tree;
import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

	private class Node {

		private Key key;
		private Value val;
		private Node left, right;
		private int count;

		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
		}
	}

	private Node root;

	public void put(Key key, Value val) {
		root = put(root, key, val);
	}

	public int size() {
		return size(root);
	}

	private int size(Node x) {
		if (x == null)
			return 0;
		return x.count;
	}

	// Number of compares : 1 + depth of node.
	private Node put(Node root, Key key, Value val) {

		if (root == null)
			return new Node(key, val);
		int cmp = key.compareTo(root.key);
		if (cmp < 0)
			put(root.left, key, val);
		else if (cmp > 0)
			put(root.right, key, val);
		else if (cmp == 0)
			root.val = val;
		root.count = 1 + size(root.left) + size(root.right);

		return root;
	}

	// the numbers of compared is equal to 1 + depth of node
	public Value get(Key key) {
		Node x = root;
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if (cmp < 0)
				x = x.left;
			if (cmp > 0)
				x = x.right;
			else if (cmp == 0)
				return x.val;
		}

		return null;
	}

	public Key floor(Key key) {
		Node x = floor(root, key);
		if (x == null)
			return null;
		return x.key;
	}

	private Node floor(Node x, Key key) {
		Node x1;
		int cmp = key.compareTo(x.key);
		if (cmp == 0)
			return x;

		if (cmp < 0)
			floor(x.left, key);

		Node temp = floor(x.right, key);
		if (temp != null)
			return temp;
		else
			return x;
	}

	public int rank(Key key) {
		return rank(root, key);
	}

	public void deleteMin() {
		deleteMin(root);
	}

	private Node deleteMin(Node x) {
		if (x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}

	private int rank(Node x, Key key) {
		/*if (x == null)
			return 0;
		int cmp = key.compareTo(x.key);

		if (cmp < 0)
			return rank(x.left, key);
		else if (cmp > 0)
			return 1 + rank(x.right, key) + size(x.left);
		else if (cmp == 0)
			return size(x.left);*/
		return 0;
	}

	public void delete(Key key) {
		//root = delete(root);
	}

	//Need to understand more .
	/*private Node delete(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = delete(x.left, key);
		else if (cmp > 0)
			x.right = delete(x.right, key);
		else {
			if (x.right == null)
				return x.left;
			if (x.left == null)
				return x.right;
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.count = size(x.left) + size(x.right) + 1;
		return x;
	}*/

	/*public Iterable<Key> iterator() {
		Queue<Key> q = new Queue<Key>();

	}*/

	private void inorder(Node x, Queue<Key> q) {
		if (x == null)
			return;
		inorder(x.left, q);
		inorder(x.right, q);
	}
}
