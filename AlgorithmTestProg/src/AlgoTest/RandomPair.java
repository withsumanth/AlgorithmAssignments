package AlgoTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomPair {

	public static void main(String[] args) {
		/*ArrayList a = new ArrayList();
		for(int i = 0;i <10; i++)
		    a.add(i);
		Collections.shuffle(a);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count1 =0;
		int count2 = 1;
		for(int i=0;i<5;i++) {
			map.put((Integer)a.get(count1), (Integer)a.get(count2));
			count1+=2;
			count2+=2;
		}
		
		System.out.println(map);*/
		Random random = new Random();
	    List<Integer> listaCartoes = new ArrayList<Integer>();

	    for(int i=0; i<10;i++)
	    {
	       int r = random.nextInt(10) + 1;
	       if(!listaCartoes.contains(r)) 
	       {
	          listaCartoes.add(r);
	          listaCartoes.add(r);
	          ++i;
	       }
	    }

	    Collections.shuffle(listaCartoes);
	    System.out.println(listaCartoes);
		/*HashSet a = new HashSet();
		Random r1 = new Random();
		Random r2 = new Random();
		for(int i=0;i<10;i++) {
			a.add(r.nextInt(10));
		}
		System.out.println(a);*/
	}

}
