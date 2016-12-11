package basic.ds.tree;
import helpers.Utils;


public class UnorderedMaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N;
	
	public UnorderedMaxPQ(int capacity){
		pq = (Key[]) new Comparable[capacity];
	}
	
	public boolean isEmpty(){
		return N==0;
	}
	public void insert(Key x){
		pq[N++] = x;
	}
	public Key delMax(){
		int max = 0;
		for(int i=0;i<N;i++){
			if(Utils.less(max, i)) {
				max = i;
			}
			Utils.exch(max,N-1);
		}
		return pq[--N];
	}
	
}
