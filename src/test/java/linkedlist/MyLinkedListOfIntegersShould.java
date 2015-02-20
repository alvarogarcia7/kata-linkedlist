package linkedlist;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListOfIntegersShould {

	MyLinkedList<Integer> sut;

	@Before
	public void setUp() {
		sut = new MyLinkedList<Integer>();
	}

	@Test
	public void contain_objects() {
		addBasicDataset();

		assertThat(sut.contains(1), is(true));
		assertThat(sut.contains(2), is(true));
	}


	@Test
	public void apply_a_map_to_the_same_type() throws Exception {
		addBasicDataset();

		final MyLinkedList<Integer> each = sut.each(x -> x + 1);

		assertThat(each.at(0), is(2));
		assertThat(each.at(1), is(3));
	}

	@Test
	public void apply_a_map_to_a_different_type() throws Exception {
		addBasicDataset();

		final MyLinkedList<String> each = sut.each(x -> String.valueOf(x));

		assertThat(each.at(0), is("1"));
		assertThat(each.at(1), is("2"));
	}

	private void addBasicDataset() {
		sut.add(1);
		sut.add(2);
	}

}
