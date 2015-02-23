package linkedlist;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersistentListShould {

	@Test
	public void create_an_empty_list() throws Exception {
		final PersistentList sut = new PersistentList();

		assertThat(sut.size(), is(0));
	}

	@Test
	public void adding_an_element_returns_another_list() throws Exception {
		final PersistentList sut = new PersistentList();

		final PersistentList oneElement = sut.add("a");

		assertThat(sut, not(equalTo(oneElement)));
	}

	@Test
	public void add_one_element() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a");

		assertThat(oneElement.size(), is(1));
	}

	@Test
	public void add_several_elements() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a").add("b");

		assertThat(oneElement.size(), is(2));
	}

	@Test
	//TODO AGB fix this name - not good enough
	public void be_independent() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a");
		final PersistentList twoElements = oneElement.add("b");

		assertThat(oneElement.size(), is(1));
		assertThat(twoElements.size(), is(2));
	}

}
