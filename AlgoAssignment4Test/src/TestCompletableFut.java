import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFut {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture 
		  = CompletableFuture.supplyAsync(() -> "Hello")
		    .thenCombine(CompletableFuture.supplyAsync(
		      () -> " World"), (s1, s2) -> {
		    	  System.out.println(s1);
		    	  System.out.println(s2);
		    	 return s1 + s2; 
		      });
		System.out.println(completableFuture.get());
	}

}
