package tests;

import logic.Climber;
import inputDomain.Input;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClimbStairsTest {


	Input oneFlightStairwell;
	Input twoFlightStairwell;
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
		
		int[] twoFlightSteps = {10, 10};
		twoFlightStairwell = new Input(twoFlightSteps, strideLength);

	}
	
	@Test
	public void climbFlightsTest() {
		
		climber = new Climber(oneFlightStairwell.getStrideLength());
		
		int oneFlightAnswer = 5;
		Assert.assertEquals(oneFlightAnswer, climber.climb(oneFlightStairwell.getStairs()));

		int twoFlightsAnswer = 12;
		Assert.assertEquals(twoFlightsAnswer, climber.climb(oneFlightStairwell.getStairs()));
		
	}
	

	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public void dispose() {
		
	}
}
