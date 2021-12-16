package fr.laboiteadodo.nonserializablepgpoint;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Default
public class CityDao {
	private final EntityManager entityManager;

	@Inject
	public CityDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void create(City city) {
		entityManager.persist(city);
		entityManager.flush();
	}

	public List<City> find() {
		var builder = entityManager.getCriteriaBuilder();
		var criteriaQuery = builder.createQuery(City.class);

		return entityManager.createQuery(criteriaQuery).getResultList();
	}
}
