package AlgoTest;

public class Counter {
	
	String name;
	int count;
	final int a =1;
	
	Counter(String name){
		this.name = name;
	}
	
	void increment(){
		count++;
	}
	
	int show() {
		return count;
	}
	
	//public int hashCode() {
		//return 2;
	//}
	
	
	

	public static void main(String[] args) {
		Counter c1 = new Counter("heads");
		Counter c2 = new Counter("heads");
		c1.increment();
		c1.increment();
		c2.increment();
		System.out.println("heads = "+c1.show());
		System.out.println("tails = "+c2.show());
		System.out.println(c2.hashCode());
		System.out.println(c1.hashCode());
		if(c1.equals(c2)) {
			System.out.println("in");
		}
	}

}
