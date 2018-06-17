package endpoint;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import service.ClimbingService;
//import util.JSONUtil;

@Path("/StairwayToHeaven")
public class StairwellEndpoint {
	
	@Path("/{stairs}/{stride}")
	//@Path("/rise")
	@POST
	@Produces({"application/json"})
	public String returnStrideCount(@PathParam("stairs") int stairs, @PathParam("stride")int stride) {
		
		ClimbingService climbingService = new ClimbingService();
		String jsonString = climbingService.attemptClimb(new int[]{stairs}, 2);
		return jsonString;
	}
	
}
