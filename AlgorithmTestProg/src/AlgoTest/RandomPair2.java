package AlgoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomPair2 {

	public static void main(String[] args) {
		/*ArrayList<Pair> pairs = new ArrayList<Pair>();

        int[] a={0,1,2,3,4};
        int[] b={5,6,7,8,9,10};

        for (int i = 0; i<a.length; i++) {
            pairs.add(new Pair(a[i], b[(int) Math.round(Math.random())]));
        }*/
		HashSet<Pair> pairs = new HashSet<Pair>();
		Random r1 = new Random();
		Random r2 = new Random();
		for (int i = 0; i<10; i++) {
            int i1 = r1.nextInt(10);
            int i2 = r2.nextInt(10);
            //if(i1!=i2) {
            	 pairs.add(new Pair(i1,i2));
            //}
        }
		//Pair pairs = new Pair(r1.nextInt(10),r2.nextInt(10));
        //Collections.shuffle(pairs);
        System.out.println(pairs);

	}

}
