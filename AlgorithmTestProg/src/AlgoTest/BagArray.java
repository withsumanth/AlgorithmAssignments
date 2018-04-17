package AlgoTest;

import java.util.Arrays;
import java.util.Iterator;

public class BagArray<Item> implements Bag<Item>{
	
	private Item[] items = null;
	private int count = 0;
	
	public BagArray() {
		grow((Item[])new Object[0],32);
	}
	
	public void add(Item item) {
		if(size()==capacity()) {
			grow(items,2*capacity());
		}
		items[count++] = item;
	}
	
	public int size() {
		return count;
	}
	
	public Boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
	
	public Iterator<Item> iterator(){
		return Arrays.asList(Arrays.copyOf(items,count)).iterator();
	}
	
	private int capacity() {
		return items.length;
	}
	
	private void grow(Item[] source,int size) {
		items = growFrom(source,size);
	}
	
	private static <T> T[] growFrom(T[] from, int size) {
		T[] result = (T[]) new Object[size];
		System.arraycopy(from, 0, result, 0, from.length);
		return result;
	}

}
