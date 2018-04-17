package AlgoTest;

import java.util.Random;

public class RandomWalk {

	   int x = 0; 
	   int y = 0;
	   int steps = 0;
	   Random r = new Random();  
	   public RandomWalk(){


	   do {
	       int num = randInt(1,4);
	       if(num == 1){
	           this.x+=1;

	       }
	       else if(num == 2){
	           this.x-=1;
	       }

	       else if(num == 3){
	           this.y+=1;
	       }
	       else if(num == 4){
	           this.y-=1;
	       }

	       this.steps++;


	   } while((this.x != 0 || this.y != 0) && steps < 100);

	   }
	   

	   public int getSteps(){
	   return this.steps;
	   }


	   public int randInt(int min, int max){
	   Random r = new Random(); 
	   int num  = r.nextInt((max-min) + 1) + min;
	   return num;
	   }
}
