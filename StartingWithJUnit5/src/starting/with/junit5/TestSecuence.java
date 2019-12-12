package starting.with.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestSecuence {
	
	@BeforeAll
	static void initAll(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
		System.out.println("before all tests");
	}
	
	@AfterAll
	static void destroyAll(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
		System.out.println("after all tests");
	}

	@Test
	void test(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
		System.out.println("in test()");
	}
	
	@Test
	@Order(1)
	void test1(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
//		System.out.println("in test()");
	}
	
	@Test
	@Order(2)
	void hiThere(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
//		System.out.println("in test()");
	}
	
	@Test
	@Order(3)
	void test3(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
//		System.out.println("in test()");
	}
	
	@Test
	@Order(4)
	void hello(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
//		System.out.println("in test()");
	}
	
	@Test
	@Order(5)
	void test2(TestInfo info) {
		System.out.println("in " +info.getDisplayName());
//		System.out.println("in test()");
	}
	
	@Test
	@DisplayName("When string is null, throw an NPE")
	@SuppressWarnings("all")
	void testException() {
		String string = null;
		assertThrows(NullPointerException.class, () -> string.length());
	}
	
//	@Test
	@RepeatedTest(5) //(name = "Repeated test", value = 5)
	void testRepited() {
		System.out.println("in testRepited()");
	}
	
	@Disabled("Because it's just an illustrations")
	@Test
	void disabled() {
		System.out.println("disabled...");
	}

}
