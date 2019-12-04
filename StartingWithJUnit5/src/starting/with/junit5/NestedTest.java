package starting.with.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Test")
class NestedTest {

	@BeforeAll
	static void beforeAllOuter() {
		System.out.println("---Before All in Outer---");
	}
	
	@BeforeEach
	void beforeEachOuter() {
		System.out.println("\tbefore Each in Outer---");
	}
	
	@AfterAll
	static void afterAllOuter() {
		System.out.println("---After All in Outer---");
	}
	
	@AfterEach
	void afterEachOuter() {
		System.out.println("\tafter Each in Outer---");
	}
	
	@Test
	void testOuter1() {
		System.out.println("\t---in testOuter1()");
	}
	
	@Test
	void testOuter2() {
		System.out.println("\t---in testOuter2()");
	}
	
	
	@Nested
	@DisplayName("Nested ArrayList")
	class ArrayListRelatedTests {
		
		List<String> list;
		
		@BeforeEach
		void beforeEachAL() {
			System.out.println("\t\tbefore each in NestedAL");
			list = Arrays.asList("one", "two", "three");
		}
		
		@AfterEach
		void afterEachAL() {
			System.out.println("\t\tafter each in NestedAL");
		}
		
		@Test
		void testALNotNull() {
			System.out.println("\t\t--- in testALNotNull");
			assertNotNull(list);
		}
		
		@Test
		void testALSize() {
			System.out.println("\t\t--- in testALSize");
			assertEquals(3, list.size());
		}
	}
	
	
	
	@Nested
	@DisplayName("Nested TreeSet")
	class TreeSetRelatedTests {
		
		Set<String> set;
		
		@BeforeEach
		void beforeEachSet() {
			System.out.println("\t\tbefore each in NestedALSet");
			set = new TreeSet<>(Arrays.asList("one", "two", "two"));
		}
		
		@AfterEach
		void afterEachSet() {
			System.out.println("\t\tafter each in NestedSet");
		}
		
		@Test
		void testSetNotNull() {
			System.out.println("\t\t--- in testSetNotNull");
			assertNotNull(set);
		}
		
		@Test
		void testSetSize() {
			System.out.println("\t\t--- in testSetSize");
			assertEquals(2, set.size());
		}
	}
	
	

}
