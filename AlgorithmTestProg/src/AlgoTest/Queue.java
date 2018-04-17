package AlgoTest;

public interface Queue<Item> {
	public void enqueue(Item item);
	public Item dequeue();
	public boolean isEmpty();
}
