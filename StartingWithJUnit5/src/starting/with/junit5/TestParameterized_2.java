package starting.with.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestParameterized_2 {

//	@ParameterizedTest
//	@CsvSource({"QWERTY, qwerty", "  ''  ,  ''  ", "12345, 12345"}) //(value = {"QWERTY, qwerty", "  ''  ,  ''  ", "12345, 12345"})
//	void testToLowerCase(String arg, String lowered) {
//		assertEquals(lowered, arg.toLowerCase());
//	}
	
//	@ParameterizedTest
//	@CsvFileSource(resources = "myFile.csv")
////	@DisplayName("CsvFileSource")
//	void testToLowerCase(String arg, String lowered) {
//		assertEquals(lowered, arg.toLowerCase());
//	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "myFile.csv")
//	@DisplayName("CsvFileSource testLength")
	void testLength(String arg, int length) {
		assertEquals(length, arg.length());
	}

}
