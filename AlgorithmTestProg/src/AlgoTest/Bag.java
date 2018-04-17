package AlgoTest;

public interface Bag<Item> extends Iterable<Item>{
	void add(Item item);
	Boolean isEmpty();
	int size();
}
