import java.util.Arrays;
import java.util.Random;

public class HashSetCalc {

	static int m; // number of bins/slots
	static int[] arr; // array of Hashes
	static int res[]; // to store count of C1 and B0
	static double iteration = 50.0; //Number of times where program runs to get accurate Value

	public static void main(String[] args) {
		m = 300;
		double avgC = 0.0;
		double avgB = 0.0;
		for (int i = 0; i < iteration; i++) {
			arr = new int[m];
			Arrays.fill(arr, -1);
			res = new int[2];
			hash();
			avgC = avgC + res[0];
			avgB = avgB + res[1];
		}
		System.out.println("Collector prog :"+avgC/iteration);
		System.out.println("Collector theory :"+Math.sqrt(Math.PI * m / 2));
		System.out.println("Bday prog :"+avgB/iteration);
		System.out.println("Bday theory :"+m*Math.log(m));
	}

	//Hash function
	static void hash() {
		boolean checkForFirstIteration = true;
		boolean checkAllElements = false;
		while(true) {
			if(checkForFirstIteration) {
				initializeArray(true);
				checkForFirstIteration = false;
				continue;
			}else {
				checkAllElements = false;
				for(int i=0;i<m;i++) {
					if(arr[i]==-1) {
						initializeArray2();
						checkAllElements = true;
					}
				}
			}
				if(checkAllElements) {
					continue;
				}else {
					break;
				}
		}
	}
	
	//First array initialization to get C1(m)
	static void initializeArray(boolean firstTime) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			Random r = new Random();
			int val = r.nextInt(m);
			int mod = val % m;
			if (arr[mod] == -1) {
				arr[mod] = val;
				res[1]++;
				count++;
			} else if(firstTime){
				res[0] = count;
				break;
			}
		}
	}
	
	//Continue the initialization if the value is not filled in array
	static void initializeArray2() {
		for (int i = 0; i < m; i++) {
			Random r = new Random();
			int val = r.nextInt(m);
			//Hash implementation
			int mod = val % m;
				arr[mod] = val;
				res[1]++;
		}
	}
	
	//For unit test case using same hash function
	static void hashTestCase(int givArr[]) {
		for (int i = 0; i < m; i++) {
			int mod = givArr[i] % m;
			arr[mod] = givArr[i];
		}
	}

}
