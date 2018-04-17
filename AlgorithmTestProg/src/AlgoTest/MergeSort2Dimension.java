package AlgoTest;

public class MergeSort2Dimension {

	static int aux[];
	public static void main(String[] args) {
		int[][] a1 = {{1,2,3,4},{3,7,8,9}};
		int[] a;
		int count= 0;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				count++; 
			}
		}
		a = new int[count];
		int tempCount = 0;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a[tempCount++] = a1[i][j]; 
			}
		}
		int lo = 0;
		int hi = tempCount-1;
		aux = new int[count];
		sort(a,lo,hi);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void sort(int[] a,int lo, int hi) {
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
