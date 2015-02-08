package linkedlist;

public interface Node {

	Node add(String string);

	Boolean contains(String string);

	Integer size();

	String getDebugValues();

	String at(int index);

}
