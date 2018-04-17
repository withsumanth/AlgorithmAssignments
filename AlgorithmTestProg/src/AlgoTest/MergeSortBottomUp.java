package AlgoTest;

public class MergeSortBottomUp {
	static int aux[];
	public static void main(String[] args) {
		 int a[] = { 7, 2, 3, 5, 8 };
		 aux = new int[a.length];
		 int n = a.length;
		for(int sz=1;sz<n;sz = sz+sz) {
			for(int lo=0;lo<n-sz;lo+=sz+sz) {
				merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1, n-1));
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void merge(int[] a,int lo, int mid, int hi) {
		for (int k = lo; k <=hi; k++) {
			aux[k] = a[k];
		}
		int i = lo;
		int j = mid+ 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (aux[j] < aux[i]) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}
}
