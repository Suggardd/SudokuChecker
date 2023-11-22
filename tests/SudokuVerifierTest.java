import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String sht = "1";
String shtMid = "4173698256321589479587243168254371697915864";
String sTooLong = "4173698256321589479587243168254371697915864323469127582896435715732916841648752935293";
String wayTooShort = "";
String ofCharacters = "aBcDeFgHiJkLmNoPqRsTuVwXyZaBcDeFgHiJkLmNoPqRsTuVwXyZaBcDeFgHiJkLmN";
String ofSpecials = "!@#$%^&*()_+-=[]{}|;:'\\\",.<>?/`!@#$%^&*()_+-=[]{}|\\\\;:'\\\",.<>?/~`!@#$%^&*()_+-=[]";
String ofSpace = "                                                                               ";

SudokuVerifier v = new SudokuVerifier();


	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void test1(){
		int a = v.verify(sht);
		assertEquals(-1, a);
	}
	@Test
	public void test2() {
		int a = v.verify(shtMid);
		assertEquals(-1, a);
	}
	@Test
	public void test3() {
		int a = v.verify(sTooLong);
		assertEquals(-1, a);
	}
	@Test
	public void test4() {
		int a = v.verify(wayTooShort);
		assertEquals(-1, a);
	}
	@Test
	public void test5() {
		int a = v.verify(ofCharacters);
		assertEquals(-1, a);
	}
	@Test
	public void test6() {
		int a = v.verify(ofSpecials);
		assertEquals(1, a);
	}
	@Test
	public void test7() {
		int a = v.verify(ofSpace);
		assertEquals(-1, a);
	}
	
	
	
	
	
}
