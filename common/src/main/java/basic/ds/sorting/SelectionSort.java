package basic.ds.sorting;
import helpers.*;

public class SelectionSort extends SortClass {
	@Override
	public int[] Sort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[min]) {
					min = j;
					Utils.exch(a, i, min);
				}

			}
		}

		return a;
	}
}
