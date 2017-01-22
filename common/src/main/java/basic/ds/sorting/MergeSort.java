package basic.ds.sorting;

import com.sun.scenario.effect.Merge;

public class MergeSort extends SortClass {

	@Override
	public int[] Sort(int[] a) {
		int N = a.length;
		int[] auxArray = new int[N];
		// Copy Data.
		for (int i = 0; i <= N - 1; i++) {
			auxArray[i] = a[i];
		}
		_mergeSort(a, auxArray, 0, N - 1);
		// a = _bottonUpSort(a);
		return a;

	}

	private static void _mergeSort(int[] a, int[] auxArray, int low, int high) {

		if (high <= low)
			return;
		// Get the mid point.
		// int N = high+1;
		int mid = low + (high - low) / 2;
		_mergeSort(a, auxArray, low, mid);
		_mergeSort(a, auxArray, mid + 1, high);
		// Merge
		_merge(a, auxArray, low, mid, high);
	}

	private static void _merge(int[] a, int[] auxArray, int low, int mid, int high) {
		for (int k = low; k <= high; k++)
			auxArray[k] = a[k];

		int j = mid + 1;
		int i = low;
		for (int k = low; k <= high; k++) {
			if (i > mid)
				a[k] = auxArray[j++];
			else if (j > high)
				a[k] = auxArray[i++];
			else if (auxArray[j] < auxArray[i]) {
				a[k] = auxArray[j++];
			} else {
				a[k] = auxArray[i++];
			}
		}
	}

	// This is not working
	private static int[] _bottonUpSort(int a[]) {
		int[] auxArray = new int[a.length];
		// Copy Data.
		for (int i = 0; i <= a.length - 1; i++) {
			auxArray[i] = a[i];
		}
		// Upper loop
		// this loop is for
		for (int width = 1; width < a.length; width = width * 2) {
			for (int i = 0; i < a.length; i = i + 2 * width) {
				int low = i;
				int mid = i + width;
				int high = i + 2 * width;
				_merge(a, auxArray, i, mid, high);
			}
		}
		return a;
	}
	// New practice------------------------------------------------------------

	public void newMergeSort(int[] a, int[] aux, int low, int high) {
		// Base case
		if (low >= high) {
			return;
		}
		int mid = low + (high - low) / 2;
		newMergeSort(a, aux, low, mid);
		newMergeSort(a, aux, mid + 1, high);

		newMerge(a, aux, low, mid, high);
	}

	public static void newMerge(int[] a, int[] aux, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		for (int k = 0; k <= high; k++) {
			if (i > mid)
				aux[k] = a[j++];
			else if (j > high)
				aux[k] = a[i++];
			else if (a[i] < a[j]) {
				aux[k] = a[i++];
			} else
				aux[k] = a[j++];
		}
	}
}
