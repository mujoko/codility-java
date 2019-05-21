package com.mujoko.codility;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/**
 * @author mwiyono
 */
public class CyclicRotationTest {
	
	private int[] result;
	
	@Test
	public void testBasic() {
		int[]  input = { 1, 2, 3, 4, 5 };
		int rotation = 1;
		int[] expectedResult= {5, 1, 2, 3, 4};
		result = CyclicRotation.solution(input,rotation);
		assertEquals(Arrays.toString(result),Arrays.toString(expectedResult) );
	}
	

	@Test
	public void test2() {
		int[] input = { 6, 7, 8, 1, 8, 7 };
		int rotation = 2;
		int[] expectedResult = {8, 7, 6, 7, 8, 1 };
		result = CyclicRotation.solution(input,rotation);
		assertEquals(Arrays.toString(result),Arrays.toString(expectedResult) );
	}
	

	@Test
	public void test3() {
		int[] input = { 6, 7, 8, 1, 8, 7 };
		int rotation = 3;
		int[] expectedResult = {1,8, 7, 6, 7, 8 };
		result = CyclicRotation.solution(input,rotation);
		assertEquals(Arrays.toString(result),Arrays.toString(expectedResult) );
	}
	
	
}
