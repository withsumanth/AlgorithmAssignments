package AlgoTest;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("a");
		l.add("b");
		String a = (String) l.remove();
		System.out.println(a);
	}

}
