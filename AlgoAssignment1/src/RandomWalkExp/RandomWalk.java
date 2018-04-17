package RandomWalkExp;

import java.util.Random;

public class RandomWalk {
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
       double r = random.nextInt(100);
       r = r/100.0;
       
       if(r<0.25) { //East
    	   move(1,0);
       }else if(r<0.5) { //North
    	   move(0,1);
       }else if(r<0.75) { //West
    	   move(-1,0);
       }else if(r<1) { //South
    	   move(0,-1);
       }
     }

    public double distance() {
       return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
        double d= 0.0;
        int noOfRuns = 100;
        for(int i=0;i<noOfRuns;i++) {
        	RandomWalk walk = new RandomWalk();
        	walk.randomWalk(n);
        	d = d + walk.distance();
        }
        System.out.println(n + " steps: " + d/noOfRuns);
    }
}
