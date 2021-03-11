package web.service.rest;

import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import web.service.model.User;

@Stateful
@RequestScoped
@Path("/test")
@Produces("application/json")
@Consumes("application/json")
public class Test {
	@Inject
	EntityManager em;

	@GET
	public Response test() {
		User user = em.find(User.class, 0L);
		return Response.ok(user).build();
	}
}
