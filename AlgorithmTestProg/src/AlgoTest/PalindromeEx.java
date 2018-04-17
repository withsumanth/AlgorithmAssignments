package AlgoTest;

public class PalindromeEx {

	public static void main(String[] args) {
		String str = "abcbaa";
		int n = str.length();
		boolean check = true;
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) {
	        	check=false;
	        }
	    if(check) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
	    

	}

}
