package linkedlist;

public class PersistentList {

	private String value;
	private int size = 0;

	public int size() {
		return size;
	}

	public PersistentList add(final String string) {
		final PersistentList result = new PersistentList();
		result.size = size + 1;
		result.value = string;
		return result;
	}

	public boolean contains(final String element) {
		if (size == 0) {
			return false;
		}
		return value.equals(element);
	}

}
