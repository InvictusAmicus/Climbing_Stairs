package service;

import logic.Climber;

public class ClimbingService {

	Climber climber;
	
	public String attemptClimb(int[] stairs, int stride)
	{
		climber = new Climber(stride);
		return climber.climb(stairs);
	}
}
