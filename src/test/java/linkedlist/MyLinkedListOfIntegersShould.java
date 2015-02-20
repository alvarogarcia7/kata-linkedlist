package linkedlist;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListOfIntegersShould {

	MyLinkedList<Integer> localSut;

	@Before
	public void setUp() {
		localSut = new MyLinkedList<Integer>();
	}

	@Test
	public void contain_objects() {
		localSut.add(1);
		localSut.add(2);

		assertThat(localSut.contains(1), is(true));
		assertThat(localSut.contains(2), is(true));
	}

	@Test
	public void apply_a_map_to_the_same_type() throws Exception {
		localSut.add(1);
		localSut.add(2);

		final MyLinkedList<Integer> each = localSut.each(x -> x + 1);

		assertThat(each.at(0), is(2));
		assertThat(each.at(1), is(3));
	}

	@Test
	public void apply_a_map_to_a_different_type() throws Exception {
		localSut.add(1);
		localSut.add(2);

		final MyLinkedList<String> each = localSut.each(x -> String.valueOf(x));

		assertThat(each.at(0), is("1"));
		assertThat(each.at(1), is("2"));
	}

}
