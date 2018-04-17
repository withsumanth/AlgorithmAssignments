package AlgoTest;

import java.util.*;

public class TupleTest {

	public static void main(String[] args) {
		Tuple t1 = new Tuple(100,200);
		Tuple t2 = new Tuple(200,200);
		/*System.out.println(t.hashCode());
		t.show();
		Integer i;
		i=(int) 'a';
		int b = 'a';
		List<Integer> list = new ArrayList();
		System.out.println(i);*/
		if(t1.equals(t2)) {
			System.out.println("Equal");
		}
		if(t1.hashCode() == t2.hashCode()) {
			System.out.println("Equal Hashcode");
		}
	}

}
