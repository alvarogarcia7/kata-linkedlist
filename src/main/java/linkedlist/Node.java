package linkedlist;

import java.util.function.Function;

public interface Node<Type> {

	Node<Type> add(Type string);

	Boolean contains(Type string);

	Integer size();

	@Override
	String toString();

	Type at(int index);

	Node<Type> addAt(int index, Type string);

	<Result> Node<Result> each(Function<Type, Result> mapper);

}
