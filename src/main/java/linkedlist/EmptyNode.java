package linkedlist;

public class EmptyNode implements Node {

	public Node add(final String string) {
		return new LinkedNode(string);
	}

	public Boolean contains(final String string) {
		return false;
	}

	public Integer size() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public String at(final int index) {
		return null;
	}

	public Node addAt(final int index, final String string) {
		if (index == 0) {
			return add(string);
		}
		return null;
	}

}
