package linkedlist;

public interface Node {

	Node add(String string);

	Boolean contains(String string);

	Integer size();

	String toString();

	String at(int index);

	Node addAt(int index, String string);

}
