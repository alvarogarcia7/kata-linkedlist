package linkedlist;

import java.util.function.Function;

public class EmptyNode<Type> implements Node<Type> {

	@Override
	public Node<Type> add(final Type string) {
		return new LinkedNode<Type>(string);
	}

	@Override
	public Boolean contains(final Type string) {
		return false;
	}

	@Override
	public Integer size() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public Type at(final int index) {
		return null;
	}

	@Override
	public Node<Type> addAt(final int index, final Type string) {
		if (index == 0) {
			return add(string);
		}
		return null;
	}

	@Override
	public <Result> Node<Result> each(final Function<Type, Result> mapper) {
		return null;
	}

}
