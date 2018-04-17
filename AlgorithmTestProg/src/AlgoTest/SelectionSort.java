package AlgoTest;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 7, 2, 3, 5, 8, 1 };
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int t = a[i];
			a[i] = a[min];
			a[min] = t;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
