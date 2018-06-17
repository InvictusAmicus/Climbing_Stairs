package tests;

import logic.Climber;
import inputDomain.Input;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
	public static void setup() {
		
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
		assertEquals(oneFlightAnswer, climber.climb(oneFlightStairwell.getStairs()));

		int twoFlightsAnswer = 12;
		assertEquals(twoFlightsAnswer, climber.climb(twoFlightStairwell.getStairs()));
		
	}
	

	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public static void dispose() {
		
	}
}
