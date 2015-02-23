package linkedlist;

public class PersistentList {

	private int size = 0;

	public int size() {
		return size;
	}

	public PersistentList add(final String string) {
		size++;
		final PersistentList result = new PersistentList();
		result.size = size;
		return result;
	}

}
