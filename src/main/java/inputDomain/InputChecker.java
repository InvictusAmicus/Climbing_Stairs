package inputDomain;

public class InputChecker {

	public final static int MAX_FLIGHTS = 30;
	public final static int MAX_STEPS = 20;
	
	public final static int MAX_STRIDE = 4;
	
	public static boolean checkSteps(int[] stairs) {

		int numOfFloors = stairs.length;
		
		if(numOfFloors < 1 ||numOfFloors > MAX_FLIGHTS)
		{
			return false;
		}
		
		for(int i = 0; i < numOfFloors; i++)
		{
			if(stairs[i] < 1 || stairs[i] > MAX_STEPS)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean checkStride(int strideLength) {
		
		if(strideLength < 1 || strideLength > MAX_STRIDE)
		{
			return false;
		}
		return true;
	}

	
}
