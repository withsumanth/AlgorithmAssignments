package AlgoTest;

import java.util.Arrays;

public class MergeSortWithoutAux {

	static int aux[];
	public static void main(String[] args) {
		 int a[] = { 7, 2, 3, 5, 8, 1 };
		 aux = new int[a.length];
		 for (int k = 0; k <a.length; k++) {
				aux[k] = a[k];
			}
		int lo = 0;
		int hi = a.length-1;
		sort(a,aux,lo,hi);
		for (int k = 0; k < a.length; k++) {
			System.out.println(aux[k]);
		}
	}
	
	public static void sort(int[] a,int[] aux,int lo, int hi) {
		if(hi<=lo) return;
		int mid = (hi+lo)/2;
		sort(aux,a,lo,mid);
		sort(aux,a,mid+1,hi);
		merge(a,aux,lo,hi,mid);
	}
	
	public static void merge(int[] a,int[] aux,int lo, int hi, int mid) {
		int i = lo;
		int j = mid+ 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				aux[k] = a[j++];
			} else if (j > hi) {
				aux[k] = a[i++];
			} else if (a[j] < a[i]) {
				aux[k] = a[j++];
			} else {
				aux[k] = a[i++];
			}
		}
	}
}
