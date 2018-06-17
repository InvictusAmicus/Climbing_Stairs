package endpoint;

import inputDomain.Input;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import service.ClimbingService;
import util.JSONUtil;

@Path("/stairway")
public class StairwellEndpoint {
	
	JSONUtil util = new JSONUtil();
	
	@Path("/climb")
	@POST
	@Produces({"application/json"})
	public String returnStrideCount(String formData) {
		
		Input data = util.getObjectForJSON(formData, Input.class);
		ClimbingService climbingService = new ClimbingService();
		String jsonString = climbingService.attemptClimb(data.getStairs(), data.getStrideLength());
		return jsonString;
	}

}
