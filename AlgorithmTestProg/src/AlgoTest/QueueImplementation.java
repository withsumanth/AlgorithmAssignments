package AlgoTest;

public class QueueImplementation<Item> implements Queue<Item>{
	private Element first=null;
	private Element last = null;
	public void enqueue(Item item) {
		Element old = last;
		last = new Element(item,old);
		if(isEmpty()) {
			first = last;
		}else {
			old.next = last;
		}
	}
	
	public Item dequeue() {
		Item result = first.item;
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		return result;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	private class Element {
		Item item;
		Element next;
		Element(Item i,Element n){
			item = i;
			next = n;
		}
	}
}
