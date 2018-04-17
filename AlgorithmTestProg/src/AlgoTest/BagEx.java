package AlgoTest;
import java.util.*;

public class BagEx {

	public static void main(String[] args) {
		BagArray<String> a = new BagArray<String>();
		//BagArrayInbuilt<String> a = new BagArrayInbuilt<String>();

		for(int i=0;i<35;i++) {
			a.add("aa");
		}
		System.out.println(a);
		Iterator iter = a.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());	
			System.out.println(iter.hasNext());	
		}
	}

}
