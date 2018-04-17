

public class SelectionSort<X extends Comparable<X>> implements Sort<X> {

    @Override
    public void sort(X[] xs, int from, int to) {
        for(int i=from;i<to;i++) {
        	int min =  i;
        	for(int j=i+1;j<to;j++) {
        		if(less(xs[j],xs[min])) {
        			min = j;
        		}
        	}
        	X t = xs[i];
			xs[i] = xs[min];
			xs[min] = t;
        }
    }
    private boolean less(Comparable x, Comparable y) {
    	return x.compareTo(y)<0;
    }
}
