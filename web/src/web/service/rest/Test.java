package web.service.rest;

import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import bean.hibernate.UserTransactionTest;
import web.service.model.User;

@Stateful
@RequestScoped
@Path("/test")
@Produces("application/json")
@Consumes("application/json")
public class Test {
	@Inject
	UserTransactionTest ut;

	@GET
	@Path("/{id}")
	public Response test(@PathParam("id") Long id) {
		User user = ut.findUser(id);

		if (user != null)
			return Response.ok(user).build();
		else {
			web.service.response.Status status = new web.service.response.Status(Status.NOT_FOUND.getReasonPhrase(),
					Status.NOT_FOUND.getStatusCode());
			return Response.status(Status.NOT_FOUND).entity(status).build();
		}
	}
}
