package AlgoTest;

import java.util.Random;

public class QuickSortDijkstra3way {

	public static void main(String[] args) {
		Comparable a[] = { 7, 2, 3, 5, 8 };
		int lo = 0;
		int hi = a.length-1;
		Random r = new Random();
		for(int i=a.length-1;i>0;i--) {
			int k = r.nextInt(i);
			Comparable t = a[i];
			a[i] = a[k];
			a[k] = t; 
		}
		sort(a,lo,hi);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void sort(Comparable a[] , int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		int lt = lo;
		int gt = hi;
		Comparable v = a[lo];
		int i = lo;
		while(i<=gt) {
			int cmp = a[i].compareTo(v);
			if(cmp<0) {
				exch(a,lt++,i++);
			}else if(cmp>0) {
				exch(a,i,gt--);
			}else {
				i++;
			}
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}
	
	public static void exch(Comparable a[] , int lo, int hi) {
		Comparable t = a[lo];
		a[lo] = a[hi];
		a[hi] = t;
	}

}
