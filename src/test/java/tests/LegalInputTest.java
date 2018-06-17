package tests;

import inputDomain.Input;
import inputDomain.InputChecker;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LegalInputTest {
	
	Input oneFlightStairwell;
	Input illegalStairwell;
	Input illegalStrides;
	
	@BeforeClass
	public static void setup() {
		
	}
	
	@Before
	public void init() {
		
		int strideLength = 2;
				
		int[] oneFlightSteps = {10};
		oneFlightStairwell = new Input(oneFlightSteps, strideLength);
		
		int[] illegalSteps = {-1};
		illegalStairwell = new Input(illegalSteps, strideLength);
		
		illegalStrides = new Input(oneFlightSteps, -strideLength);
	}
	
	@Test
	public void checkLegalityTest() {
		
		boolean isValidSteps = InputChecker.checkSteps(oneFlightStairwell.getStairs());
		assertTrue(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalStairwell.getStairs());
		assertFalse(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalStrides.getStairs());
		assertTrue(isValidSteps);
		
		boolean isValidStride = InputChecker.checkStride(oneFlightStairwell.getStrideLength());
		assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkStride(illegalStairwell.getStrideLength());
		assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkStride(illegalStrides.getStrideLength());
		assertFalse(isValidStride);
		
	}
	

	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public static void dispose() {
		
	}
}
