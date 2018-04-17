package AlgoTest;

public class Tuple {
	int a;
	double b;
	Tuple(int a,double b){
		this.a  = a;
		this.b = b;
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		Tuple t = (Tuple) o;
		if(t.a == a && t.b == b) {
			return true;
		}
		return false;
	}
	
	
	public int hashCode() {
		int result = a;
		result = 31*result + new Double(b).hashCode();
		return result;
	}
	
	public void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
