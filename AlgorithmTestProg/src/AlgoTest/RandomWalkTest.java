package AlgoTest;

import java.util.Random;

public class RandomWalkTest {
	
	public static void main(String[] args) {
		int total = 0; 
	    for(int i = 0; i<100; i++){
	        RandomWalk rand  = new RandomWalk();
	        int steps = rand.getSteps();
	        total+=steps;
	    }
	    System.out.println("The average is: " + ((total/2) / 100));
	    }

}
