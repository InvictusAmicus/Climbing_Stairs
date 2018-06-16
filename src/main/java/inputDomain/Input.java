package inputDomain;

public class Input {
	
	private int[] stairs;
	private int strideLength;
	
	Input(){}
	
	public Input(int[] stairs, int strideLength){
		this.stairs = stairs;
		this.strideLength = strideLength;
	}

	public int[] getStairs() {
		return stairs;
	}

	public int getStrideLength() {
		return strideLength;
	}

}
