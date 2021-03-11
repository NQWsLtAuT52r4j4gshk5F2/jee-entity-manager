package web.service.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import web.service.response.Status;

@RequestScoped
@Path("/test")
@Produces("application/json")
@Consumes("application/json")
public class Test {

	@GET
	public Response test() {
		return Response.ok(new Status("OK", 200)).build();
	}
}
