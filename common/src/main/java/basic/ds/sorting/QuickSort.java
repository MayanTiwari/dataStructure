package basic.ds.sorting;
import helpers.*;

public class QuickSort extends SortClass{

	@Override
	public int[] Sort(int[] a) {
		_sort(a,0,a.length-1);
		return a;
	}
	
	private void _sort(int[] a,int lo,int hi){
		if(hi<=lo) return;
		int j =partition(a, lo, hi);
		_sort(a,lo,j-1);
		_sort(a,j+1,hi);
	}
	
	private int partition(int[] a, int lo,int hi){
		 
		int i = lo;
		int j = hi+1;
		while(true){
			//Find the item to swap from left.
			while(a[++i] < a[lo]){
				if(i == hi) {
					break;
				}
			}
				
			//find the item to swap from right.
			while( a[lo] < a[--j] ){
				if(j == lo) {
					break;
				}
			}
				
			//Break the main loop . Check if elements cross each other
			if(i >=j) {
				break;
			}
		    Utils.exch(a, i, j);
		}
		Utils.exch(a, lo, j);
		
		return j;	
		
	}
	public int[] improvedSort(int[] a){
		return null ;
	}
	

}
