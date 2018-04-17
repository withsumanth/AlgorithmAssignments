package AlgoTest;

public class ShellSort {

	public static void main(String[] args) {
		int a[] = { 7, 2, 3, 5, 8, 1,4,6,45,32,34,74,55 };
		int n = a.length;
		int h=1;
		while(h<n/3) {
			h=3*h +1;
		}
		while(h>=1) {
			for(int i=h;i<n;i++) {
				for(int j=i;j>=h && (a[j]<a[j-1]); j=j-h) {
					int t=a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
			h=h/3;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
