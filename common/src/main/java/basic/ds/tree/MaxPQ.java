package basic.ds.tree;



public class MaxPQ<Key extends Comparable<Key>> {

	private Key[] pq;
	private int N;
	
	public MaxPQ(int capacity){
		pq = (Key[]) new Comparable[capacity];
	}
	public boolean isEmpty(){
		return N==0;
	}
	/*public Key delMax(){
		int max = 0;
		for(int i=0;i<N;i++){
			if(less(max, i)) {
				max = i;
			}
			MyUtil.exch(max,N-1);
		}
		return pq[--N];
	}*/
	private boolean less(int i,int j){
		return pq[i].compareTo(pq[j]) < 0;
	}
	private void exch(int i,int j){
		/*int swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;	*/
	}
	private void swim(int k){
		while( k > 1 && less(k/2,k)){
			exch(k,k/2);
			k = k/2;
		}
	}
	//Need to understand more.
	private void sink(int k){
		
		while(k*2 <= N){
			int j  = 2*k;
			if(j < N && less(j,j+1)) j++;
			exch(k,j);
			k = j;
		}
	}
	public Key delMax(){
		Key max = pq[1];
		exch(1,N--);
		sink(1);
		pq[N+1] = null;
		return max;
	}
	
}
