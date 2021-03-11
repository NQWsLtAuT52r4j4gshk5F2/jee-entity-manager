package web.service.rest;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import web.service.model.User;

@RequestScoped
@Path("/test")
@Produces("application/json")
@Consumes("application/json")
public class Test {
	@PersistenceContext
	EntityManager em;

	@GET
	public Response test() {
		User user = em.find(User.class, 0L);
		return Response.ok(user).build();
	}
}
