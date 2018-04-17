
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       if (args.length>0) ParSort.cutoff = Integer.parseInt(args[0]);
        Random random = new Random(0L);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(50);
        ParSort.sort(array, 0, array.length);
       for (int i : array) System.out.println(i);
        if (array[0]==11) System.out.println("Success!");
    }
}
