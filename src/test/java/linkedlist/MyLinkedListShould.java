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
}
