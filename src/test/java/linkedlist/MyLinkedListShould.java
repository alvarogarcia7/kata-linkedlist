package linkedlist;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyLinkedListShould {

	@Test
	public void be_empty_by_default() {
		final MyLinkedList sut = new MyLinkedList();
		assertThat(sut.size(), is(0));
	}

}
