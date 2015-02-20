package linkedlist;

import java.util.function.Function;

public class LinkedNode<Type> implements Node<Type> {

	private Node<Type> node;
	private final Type value;

	public LinkedNode(final Type string) {
		value = string;
		node = new EmptyNode<Type>();
	}

	@Override
	public Node<Type> add(final Type string) {
		node = node.add(string);
		return this;
	}

	@Override
	public Boolean contains(final Type string) {
		return value.equals(string) || node.contains(string);
	}

	@Override
	public Integer size() {
		return 1 + node.size();
	}

	@Override
	public String toString() {
		return value + ", " + node.toString();
	}

	@Override
	public Type at(final int index) {
		if (index == 0) {
			return value;
		} else {
			return node.at(index - 1);
		}
	}

	@Override
	public Node<Type> addAt(final int index, final Type string) {
		if (0 == index) {
			final LinkedNode<Type> newNode = new LinkedNode<Type>(string);
			newNode.node = this;
			return newNode;
		} else {
			node = node.addAt(index - 1, string);
			return this;
		}
	}

	@Override
	public <Result> Node<Result> each(final Function<Type, Result> function) {
		final LinkedNode<Result> linkedNode = new LinkedNode<>(function.apply(value));
		linkedNode.node = node.each(function);
		return linkedNode;
	}

}
