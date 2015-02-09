package linkedlist;

public class LinkedNode<Type> implements Node<Type> {

	private Node<Type> node;
	private final String value;

	public LinkedNode(final String string) {
		value = string;
		node = new EmptyNode<Type>();
	}

	public Node<Type> add(final String string) {
		node = node.add(string);
		return this;
	}

	public Boolean contains(final String string) {
		return value.equals(string) || node.contains(string);
	}

	public Integer size() {
		return 1 + node.size();
	}

	@Override
	public String toString() {
		return value + ", " + node.toString();
	}

	public String at(final int index) {
		if (index == 0) {
			return value;
		} else {
			return node.at(index - 1);
		}
	}

	public Node<Type> addAt(final int index, final String string) {
		if (0 == index) {
			final LinkedNode<Type> newNode = new LinkedNode<Type>(string);
			newNode.node = this;
			return newNode;
		} else {
			node = node.addAt(index - 1, string);
			return this;
		}
	}

}
