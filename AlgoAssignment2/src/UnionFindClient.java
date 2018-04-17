import java.util.Random;
import java.util.Scanner;

public class UnionFindClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Please enter number of sites");
		String input = scanner.nextLine();
		int numOfSites = 0;
		try {
			numOfSites = Integer.parseInt(input);
		}catch(Exception e) {
			System.out.println("Please enter Integer values for number of sites");
			input = "";
			main(args);
		}
		double avg= 0.0;
		for(int i=0;i<200;i++) {
			Random r1 = new Random();
			Random r2 = new Random();
			WQUPC wqupc = new WQUPC(numOfSites);
			int checkValue = 0;
			while(wqupc.count()>1) {
				int a = r1.nextInt(numOfSites);
				int b = r2.nextInt(numOfSites);
				checkValue++;
				while(!wqupc.connected(a, b)) {
		        	wqupc.union(a, b);
		        }
			}
			avg = avg+checkValue;
		}
		System.out.println(avg/200);
	}

}
