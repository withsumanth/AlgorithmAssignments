package AlgoTest;

public class CopyByValueTest {
	
	public static void main(String[] args) {
		CopyByValue c = new CopyByValue();
		/*c.number = 0;
		c.increment(c.number);
		System.out.println(c.number);*/
		
		c.arr[0] = 0;
		c.incrementarr2();
		System.out.println(c.arr[0]);
	}

}
