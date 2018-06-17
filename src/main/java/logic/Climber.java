package logic;

import inputDomain.InputChecker;
	
public class Climber {
	
	int strideLength;
	public static final int STRIDES_PER_LANDING = 2;
	
	public Climber() {}
	
	public Climber(int strideLength) {
		this.strideLength = strideLength;
	}

	public String climb(int[] stairs) {
		
		if(!InputChecker.checkSteps(stairs))
		{
			return("{\"message\": \"Invalid staircase\"}");
		}
		if(!InputChecker.checkStride(strideLength))
		{
			return("{\"message\": \"Invalid stride length\"}");
		}
		
		int numOfFloors = stairs.length;
		int numOfStrides = STRIDES_PER_LANDING * (numOfFloors-1);
		
		for(int i = 0; i < numOfFloors; i++){
			numOfStrides += stairs[i]/strideLength;
			if(stairs[i]%strideLength != 0) {
				numOfStrides += 1;
			}
		}
		return Integer.toString(numOfStrides);
	}

}
