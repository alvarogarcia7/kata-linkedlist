package linkedlist;

public class PersistentList {

	private int size = 0;

	public int size() {
		return size;
	}

	public PersistentList add(final String string) {
		final PersistentList result = new PersistentList();
		result.size = 1;
		return result;
	}

}
