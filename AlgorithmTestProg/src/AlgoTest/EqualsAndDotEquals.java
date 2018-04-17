package AlgoTest;

import java.util.ArrayList;

public class EqualsAndDotEquals {

	public static void main(String[] args) {
		//String a1 = "hello";
		//String a2 = "hello";
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<String> ar2 = new ArrayList<String>();
		ar1.add("hello");
		ar2.add("hello");
		System.out.println(ar1.get(0).equals(ar2.get(0)));
	}

}
