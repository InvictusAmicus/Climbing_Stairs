package tests;

import inputDomain.Input;
import inputDomain.InputChecker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LegalInputTest {
	
	Input oneFlightStairwell;
	Input illegalStairwell;
	Input illegalStrides;
	
	@BeforeClass
	public void setup() {
		
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
		Assert.assertTrue(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalStairwell.getStairs());
		Assert.assertFalse(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalStrides.getStairs());
		Assert.assertTrue(isValidSteps);
		
		boolean isValidStride = InputChecker.checkStride(oneFlightStairwell.getStrideLength());
		Assert.assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkStride(illegalStairwell.getStrideLength());
		Assert.assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkStride(illegalStrides.getStrideLength());
		Assert.assertFalse(isValidStride);
		
	}
	

	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public void dispose() {
		
	}
}
