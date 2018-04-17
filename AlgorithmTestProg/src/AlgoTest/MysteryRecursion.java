package AlgoTest;

public class MysteryRecursion {
	
	static String mystery(String str) {
		int l = str.length();
		if(l<=1) {
			return str;
		}
		String a = str.substring(0,l/2);
		String b = str.substring(l/2,l);
		return mystery(b) + mystery(a);
	}

	public static void main(String[] args) {
		System.out.println(mystery("abcdefgh"));

	}

}
