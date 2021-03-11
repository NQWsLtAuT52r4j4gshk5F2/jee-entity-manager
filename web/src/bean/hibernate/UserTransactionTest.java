package bean.hibernate;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import bean.EM;
import web.service.model.User;

@Stateful
@LocalBean
@ApplicationScoped
public class UserTransactionTest {
	@Inject
	@EM(name = "em")
	EntityManager em;

	public User findUser(Long id) {
		return em.find(User.class, id);
	}
}
