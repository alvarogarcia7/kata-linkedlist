package linkedlist;

public interface Node<Type> {

	Node<Type> add(String string);

	Boolean contains(String string);

	Integer size();

	String toString();

	String at(int index);

	Node<Type> addAt(int index, String string);

}
