package AlgoTest;

public class LinkedList<Item> {
	private class Element{
		Item item;
		Element next;
		Element(Item i,Element n){
			item = i;
			next = n;
		}
	}
	private Element head=null;
	public void add(Item item) {
		Element tail = head;
		head = new Element(item,tail);
	}
	public Item remove() {
		Item result = head.item;
		head = head.next;
		return result;
	}
	public Item getHead() {
		return isEmpty()?null:head.item;
	}
	public boolean isEmpty() {
		return head==null;
	}

}
