package linkedlist;

import java.util.Optional;

public class PersistentList {

	private String value;
	private int size = 0;
	private final Optional<PersistentList> next;

	public PersistentList() {
		next = Optional.empty();
	}

	private PersistentList(final String value, final PersistentList next) {
		this.value = value;
		this.next = Optional.of(next);
	}

	public int size() {
		return size;
	}

	public PersistentList add(final String element) {
		final PersistentList result = new PersistentList(element, this);
		result.size = size + 1;
		return result;
	}

	public boolean contains(final String element) {
		if (size == 0) {
			return false;
		}
		return value.equals(element) || next.orElse(new PersistentList()).contains(element);
	}

}
