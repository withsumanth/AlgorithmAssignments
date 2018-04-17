package AlgoTest;

public class CopyByValue {
	int number=0;
	int[] arr = {0};
	
	public int increment(int number) {
		number++;
		return number;
	}
	
	public int increment2() {
		number++;
		return number;
	}
	
	public int[] incrementarr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		return arr;
	}
	
	public int[] incrementarr2() {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		return arr;
	}
}
