/**
 * By Mark Yates
 * ASUID 1207697747
 * Test Seat L-A-10
 * Assignment 2
 *
 * The test file for the AddingMachine Class
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testConstructor() {
		AddingMachine testMachine = new AddingMachine();
		assertNotNull(testMachine);
	}
	
	@Test
	void testGetTotal() {
		AddingMachine testMachine = new AddingMachine();
		assertEquals(testMachine.getTotal(), 0);
	}
	
	@Test
	void testAdd() {
		AddingMachine testMachine = new AddingMachine();
		testMachine.add(3);
		testMachine.add(4);
		assertEquals(testMachine.getTotal(), 7);
	}
	
	@Test
	void testSubtract() {
		AddingMachine testMachine = new AddingMachine();
		testMachine.subtract(2);
		testMachine.subtract(1);
		assertEquals(testMachine.getTotal(), -3);
	}
	
	@Test
	void testAddAndSubtract() {
		AddingMachine testMachine = new AddingMachine();
		testMachine.add(7);
		testMachine.subtract(4);
		assertEquals(testMachine.getTotal(), 3);
	}
	
	@Test
	void testClear() {
		AddingMachine testMachine = new AddingMachine();
		testMachine.add(73);
		testMachine.clear();
		assertEquals(testMachine.getTotal(), 0);
	}
	
	@Test
	void testAddAfterClear() {
		AddingMachine testMachine = new AddingMachine();
		testMachine.subtract(50);
		testMachine.clear();
		testMachine.add(12);
		assertEquals(testMachine.getTotal(), 12);
	}
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
