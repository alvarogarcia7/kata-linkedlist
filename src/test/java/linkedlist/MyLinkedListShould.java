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
	public void find_another_existing_element() {
		sut.add("string1");
		sut.add("string2");
		assertThat(sut.contains("string1"), is(true));
	}

}
