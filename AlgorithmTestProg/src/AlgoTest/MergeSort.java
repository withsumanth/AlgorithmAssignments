package AlgoTest;

public class MergeSort {

	static int aux[];
	public static void main(String[] args) {
		 int a[] = { 1,2,3,4};
		 aux = new int[a.length];
		int lo = 0;
		int hi = a.length-1;
		sort(a,lo,hi);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void sort(int[] a,int lo, int hi) {
		System.out.println("sort in");
		if(hi<=lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		
		//Test if array is already in order
		if(a[mid]<a[mid+1]) {
			return;
		}
		merge(a,lo,hi,mid);
	}
	
	public static void merge(int[] a,int lo, int hi, int mid) {
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
