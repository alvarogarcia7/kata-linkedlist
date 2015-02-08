package linkedlist;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListShould {

	private MyLinkedList sut;

	@Before
	public void setUp() {
		sut = new MyLinkedList();
	}

	@Test
	public void be_empty_by_default() {
		assertThat(sut.size(), is(0));
	}

	@Test
	public void have_one_element_after_adding_one_element() {
		sut.add("anyString");
		assertThat(sut.size(), is(1));
	}

	@Test
	public void find_an_existing_element() {
		sut.add("anyString");
		assertThat(sut.contains("anyString"), is(true));
	}

	@Test
	public void not_find_an_element_on_an_empty_list() {
		assertThat(sut.contains("anyString"), is(false));
	}

	@Test
	public void not_find_a_non_existing_item() {
		sut.add("otherString");
		assertThat(sut.contains("anyString"), is(false));
	}

	@Test
	public void insertAt_the_end() throws Exception {
		sut.add("otherString");

		sut.addAt(1, "myString");

		assertThat(sut.at(0), is("otherString"));
		assertThat(sut.at(1), is("myString"));
	}

	@Test
	public void insertAt_the_beginning() throws Exception {
		sut.add("otherString");

		sut.addAt(0, "myString");

		assertThat(sut.at(0), is("myString"));
		assertThat(sut.at(1), is("otherString"));
	}

	@Test
	public void acceptance_test() {
		sut.add("string1");
		assertThat(sut.size(), is(1));
		sut.add("string2");
		assertThat(sut.size(), is(2));
		sut.add("string3");
		assertThat(sut.size(), is(3));
		assertThat(sut.contains("string1"), is(true));
		assertThat(sut.contains("string2"), is(true));
		assertThat(sut.contains("string3"), is(true));

	}

}
