package fr.laboiteadodo.nonserializablepgpoint;

import java.util.List;

import javax.persistence.EntityManager;

public class CityDao {
	private final EntityManager entityManager;

	public CityDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void create(City city) {
		entityManager.persist(city);
	}

	public List<City> find() {
		var builder = entityManager.getCriteriaBuilder();
		var criteriaQuery = builder.createQuery(City.class);

		return entityManager.createQuery(criteriaQuery).getResultList();
	}
}
