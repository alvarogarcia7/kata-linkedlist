package linkedlist;

public class EmptyNode<Type> implements Node<Type> {

	public Node<Type> add(final String string) {
		return new LinkedNode<Type>(string);
	}

	public Boolean contains(final String string) {
		return false;
	}

	public Integer size() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}

	public String at(final int index) {
		return null;
	}

	public Node<Type> addAt(final int index, final String string) {
		if (index == 0) {
			return add(string);
		}
		return null;
	}

}
