package logic;

import inputDomain.InputChecker;
	
public class Climber {
	
	int strideLength;
	public static final int STRIDES_PER_LANDING = 2;
	
	public Climber() {}
	
	public Climber(int strideLength) {
		this.strideLength = strideLength;
	}

	public int climb(int[] stairs) {
		
		if(!InputChecker.checkSteps(stairs))
		{
			System.out.println("{\"message\": \"Invalid staircase\"}");
		}
		if(!InputChecker.checkStride(strideLength))
		{
			System.out.println("{\"message\": \"Invalid stride length\"}");
		}
		
		int numOfFloors = stairs.length;
		int numOfStrides = STRIDES_PER_LANDING * (numOfFloors-1);
		
		for(int i = 0; i < numOfFloors; i++){
			numOfStrides += stairs[i]/strideLength;
			if(stairs[i]%strideLength != 0) {
				numOfStrides += 1;
			}
		}
		return numOfStrides;
	}

}
