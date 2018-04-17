package AlgoTest;

import java.util.Random;

public class QuickSort {


	public static void main(String[] args) {
		int a[] = { 7, 2, 3, 5, 8 };
		int lo = 0;
		int hi = a.length-1;
		Random r = new Random();
		for(int i=a.length-1;i>0;i--) {
			int j = r.nextInt(i);
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]);
		}
		System.out.print("\n");
		sort(a,lo,hi);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void sort(int[] a,int lo, int hi) {
		if(hi<=lo) return;
		int j = partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	
	public static int partition(int[] a,int lo, int hi) {
		int i = lo;
		int j = hi+1;
		while(true) {
			while(a[++i]<a[lo]) {
				if(i==hi) {
					break;
				}
			}
			while(a[lo]<a[--j]) {
				if(j==lo) {
					break;
				}
			}
			if(i>=j) {
				break;
			}
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		int t = a[lo];
		a[lo] = a[j];
		a[j] = t;
		return j;
	}
}
