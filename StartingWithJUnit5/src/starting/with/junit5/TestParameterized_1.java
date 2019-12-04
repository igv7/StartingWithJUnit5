package starting.with.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestParameterized_1 {

	@ParameterizedTest
	@ValueSource(strings = {"6674t", "jg;", "", "kkmgnorern"})
	void testLength_Greater_Than_Zero(String arg) {
		assertTrue(arg.length() > 0);
	}

}
