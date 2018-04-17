package AlgoTest;

public class InsertionSort {

	public static void main(String[] args) {
		char a[] = { 'a', 'r', 'b', 'w', 'c' };
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
					char t=a[j];
					a[j]=a[j-1];
					a[j-1] = t;
				}else {
					break;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
