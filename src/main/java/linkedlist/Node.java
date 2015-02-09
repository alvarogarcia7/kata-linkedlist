package linkedlist;

public interface Node<Type> {

	Node<Type> add(Type string);

	Boolean contains(Type string);

	Integer size();

	String toString();

	Type at(int index);

	Node<Type> addAt(int index, Type string);

}
