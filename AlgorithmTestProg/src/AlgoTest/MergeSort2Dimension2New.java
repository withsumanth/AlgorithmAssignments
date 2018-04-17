package AlgoTest;

public class MergeSort2Dimension2New {

	static int aux[];
	public static void main(String[] args) {
		int[][] a1 = {{1,2,3,4},{3,7,8,9}};
		int[] arr = mergeSort(a1,0,a1.length);
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
	
	public static int[] mergeSort(int[][] list,int lo,int hi){
		if(lo==hi) {
			return list[lo];
		}
		if(lo<hi) {
			int mid = (lo+hi)/2;
			int[] l1 = mergeSort(list,lo,mid);
			int[] l2 = mergeSort(list,mid+1,hi);
			return merge(l1,l2);
		}else {
			return null;
		}
		 
	}
	
	 public static int[] merge(int[] l1,int[] l2){
		 int[] aux = new int[l1.length+l2.length];
		 int n = 0;
		 for(int i=0;i<l1.length;i++) {
			 aux[n++] = l1[i];
		 }
		 for(int i=0;i<l1.length;i++) {
			 aux[n++] = l1[i];
		 }
		 int i = 0;
			int j = (l1.length+l2.length)/2 +1;
			int mid = (l1.length+l2.length)/2;
			for (int k = 0; k < l1.length+l2.length; k++) {
				if (i > mid) {
					aux[k] = aux[j++];
				} else if (j > l1.length+l2.length) {
					aux[k] = aux[i++];
				} else if (aux[j] < aux[i]) {
					aux[k] = aux[j++];
				} else {
					aux[k] = aux[i++];
				}
			}
			return aux;
	 }
}
