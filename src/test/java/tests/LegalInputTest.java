package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LegalInputTest {
	
	Input oneFlightStairwell;
	Input illegalStairwell;
	Input illegalSteps;
	Climber climber;
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
		
		illegalSteps = new Input(oneFlightSteps, -strideLength);
	}
	
	@Test
	public void checkLegalityTest() {
		
		boolean isValidSteps = InputChecker.checkSteps(oneFlightStairwell.getStairs());
		Assert.assertTrue(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalStairwell.getStairs());
		Assert.assertFalse(isValidSteps);
		
		isValidSteps = InputChecker.checkSteps(illegalSteps.getStairs());
		Assert.assertTrue(isValidSteps);
		
		boolean isValidStride = InputChecker.checkStride(oneFlightStairwell.getStride());
		Assert.assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkSteps(illegalStairwell.getStride());
		Assert.assertTrue(isValidStride);
		
		isValidStride = InputChecker.checkSteps(illegalSteps.getStride());
		Assert.assertFalse(isValidStride);
		
		
		fail("Not yet implemented");
	}
	

	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public void dispose() {
		
	}
}
