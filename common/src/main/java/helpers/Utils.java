package helpers;

public final class Utils {
	public static void exch(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static void exch(int i, int j) {
		int swap = i;
		i = j;
		j = swap;
	}

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
}
