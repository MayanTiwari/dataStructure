package basic.ds.sorting;

import helpers.*;

public class SelectionSort extends SortClass {
	/*
	 * @Override public int[] Sort(int[] a) { int N = a.length; for (int i = 0;
	 * i < N; i++) { int min = i; for (int j = i + 1; j < N; j++) { if (a[j] <
	 * a[min]) { min = j; Utils.exch(a, i, min); }
	 * 
	 * } }
	 * 
	 * return a; }
	 */
	@Override
	public int[] Sort(int[] a) {

		if (a.length == 0)
			return null;

		for (int i = 0; i < a.length ; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i)
				Utils.exch(a, i, minIndex);
		}
		return a;
	}
	public int[] SortRecursive(int[] a){
		 rCall(a,0);
		 return a; 
	}
	// 90,45
	private void rCall(int[] a, int start){
		if(start < a.length - 1){
			Utils.exch(a, start, findMinimum(a,start));
			rCall(a,start + 1);
		}
	}
	private int findMinimum(int[] a,int start){
		int min = start;
		for(int i = start; i < a.length ; i++){
			if(a[min] > a[i]){
				min = i;
			}
		}
		return min;
	}
	//Stable Selection sort .
	public void stableSort(int[] a){
		for(int start = 0 ; start < a.length-1; ++start){
			insert(a, start, findMinimum(a, start));
		}
	}
	private void insert(int[] data,int start,int minIndex){
		if(minIndex > start){
			System.arraycopy(data, start, data, start + 1, minIndex - start);
		}
	
	}
	
}
