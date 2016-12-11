package basic.ds.sorting;
import helpers.*;

public class InsertionSort extends SortClass {

	@Override
	public int[] Sort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					Utils.exch(a, j, j - 1);
				} else
					break;
			}
		}
		return a;
	}
}
