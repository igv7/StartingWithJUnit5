package starting.with.junit5;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class NewAsserts {

	@Test
	void test() {
		List<String> actual = Arrays.asList("one", "two", "three"); //("one", "two", "three");
		List<String> expected = new ArrayList<>(actual);
//		Set<String> expected = new HashSet<>(actual);
//		Set<String> expected = new TreeSet<>(actual);
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void testAssertingAll() {
		assertAll(
				() -> assertThat("www.google.com", startsWith("www")),
				() -> assertThat("www.google.com", endsWith("com")),
				() -> assertThat("12345", isA(String.class)),
				() -> assertThat("They differ!", "10", is("10"))
				);
	}
	
	@Test
	void testLinesMatch() {
		List<String> actualLines = Arrays.asList("Happy New Year!".split(" "));
		assertLinesMatch(Arrays.asList("Happy","New","Year!"), actualLines) ;
	}

}
