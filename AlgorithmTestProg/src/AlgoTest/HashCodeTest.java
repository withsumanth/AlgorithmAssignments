package AlgoTest;

public class HashCodeTest {

	public static void main(String[] args) {
		 String a = "Aa";
		 String b = "BB";
		 int h=0;
		 for(int i=0;i<a.length();i++) {
			 h = h*31+ a.charAt(i);
		 }
		 System.out.println("calculated = "+h);
		 System.out.println("original = "+a.hashCode());
		 System.out.println("original = "+b.hashCode());
		 if(a.equals(b)) {
			 System.out.println("Equals in");
		 }
		 if(a.hashCode()==b.hashCode()) {
			 System.out.println("hascode in");
		 }
	}

}
