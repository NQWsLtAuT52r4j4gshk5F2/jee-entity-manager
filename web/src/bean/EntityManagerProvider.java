package bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
@LocalBean
@ApplicationScoped
public class EntityManagerProvider {

	@Produces
	@PersistenceContext(unitName = "hbdb")
	@EM(name = "em")
	private static EntityManager em;

	public EntityManagerProvider() {

	}
}
