package search;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

	private Node root;

	private class Node {
		private Key key;
		private Value value;
		private Node leftNode, rightNode;
		private int N;

		public Node(Key key, Value value, int N) {
			this.key = key;
			this.value = value;
			this.N = N;
		}
	}

	public int size() {
		return size(root);
	}

	private int size(Node x) {
		if (x == null)
			return 0;
		else
			return x.N;
	}

	public Value get(Key key) {
		return get(root, key);
	}

	/**
	 * 查找一个元素
	 * @param x
	 * @param key
	 * @return
	 */
	public Value get(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			return get(x.leftNode, key);
		else if (cmp > 0)
			return get(x.rightNode, key);
		else
			return x.value;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	/**
	 * 插入一个元素
	 * @param x
	 * @param key
	 * @param value
	 * @return
	 */
	public Node put(Node x, Key key, Value value) {
		if (x == null)
			return new Node(key, value, 1);
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.leftNode = put(x.leftNode, key, value);
		else if (cmp > 0)
			x.rightNode = put(x.rightNode, key, value);
		else
			x.value = value;

		x.N = size(x.leftNode) + size(x.rightNode) + 1;
		return x;
	}

	public Key min() {
		return min(root).key;
	}

	/**
	 * 获得最小值
	 * @param x
	 * @return
	 */
	private Node min(Node x) {
		if (x == null)
			return null;
		if (x.leftNode != null)
			return min(x.leftNode);
		else
			return x;
	}

	public Key max() {
		return max(root).key;
	}

	
	/**
	 * 获取最大值
	 * @param x
	 * @return
	 */
	private Node max(Node x) {
		if (x == null)
			return null;
		if (x.rightNode != null)
			return max(x.rightNode);
		else
			return x;
	}

	
	public Key floor(Key key){
		Node x = floor(root,key);
		if(x == null) return null;
		return x.key;
	}
	
	/**
	 * 向上取整
	 * @param x
	 * @param key
	 * @return
	 */
	private Node floor(Node x,Key key){
		if(x == null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0) 
			return x;
		if(cmp < 0) 
			return floor(x.leftNode, key);
		else{
			Node t = floor(x.rightNode, key);
			if(t != null) return t;
			else return x;
		}
		
	}
	
	public Key select(int k){
		return select(root,k).key;
	}
	
	/**
	 * 返回指定排名為k的鍵
	 * @param x
	 * @param k
	 * @return
	 */
	private Node select(Node x,int k){
		if(x == null) return null;
		
		int t = size(x.leftNode);
		if(t > k) 
			return select(x.leftNode,k);
		else if(t > k) 
			return select(x.rightNode,k-t-1);
		else 
			return x;
	}
	
	public int rank(Key key){
		return rank(root, key);
	}
	
	/**
	 * 返回指定鍵為key的元素的排名
	 * @param x
	 * @param key
	 * @return
	 */
	private int rank(Node x,Key key){
		if(x == null) return 0;
		
		int cmp = key.compareTo(root.key);
		if(cmp < 0) 
			return rank(x.leftNode,key);
		if(cmp > 0) 
			return 1+size(x.leftNode)+rank(x.rightNode,key);
		else 
			return size(x.leftNode);
	}
	
	
}
