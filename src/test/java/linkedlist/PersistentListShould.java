package linkedlist;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersistentListShould {

	@Test
	public void create_an_empty_list() throws Exception {
		final PersistentList sut = new PersistentList();

		assertThat(sut.size(), is(0));
	}

}
