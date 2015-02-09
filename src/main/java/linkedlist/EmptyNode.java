package linkedlist;

public class EmptyNode<Type> implements Node<Type> {

	public Node<Type> add(final Type string) {
		return new LinkedNode<Type>(string);
	}

	public Boolean contains(final Type string) {
		return false;
	}

	public Integer size() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}

	public Type at(final int index) {
		return null;
	}

	public Node<Type> addAt(final int index, final Type string) {
		if (index == 0) {
			return add(string);
		}
		return null;
	}

}
