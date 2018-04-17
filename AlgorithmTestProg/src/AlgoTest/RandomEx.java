package AlgoTest;

import java.util.Date;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		/*Random randomno = new Random();
		int min = 0;
		int max = 1;
	      // get next next pseudorandom value 
	      int value = randomno.nextInt(100);
	      System.out.println("Value is: " + value);
	       double value1  = value/100.0;

	      // check the value  
	      System.out.println("Value is: " + value1);*/
		Random r1 = new Random();
		Random r2 = new Random();
		for(int i=0;i<100;i++) {
			System.out.println(r1.nextInt(10000));
		}
		System.out.println(new Date());	
		System.out.println(new Date(0L));	

	}

}
