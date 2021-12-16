package fr.laboiteadodo.nonserializablepgpoint;

import java.io.IOException;

import javax.persistence.Persistence;

public class Application {
	public static void main(String[] args) throws InterruptedException, IOException {
		var sessionFactory = Persistence.createEntityManagerFactory("fr.laboiteadodo.nonserializablepgpoint");
		var entityManager = sessionFactory.createEntityManager();
		var cityDao = new CityDao(entityManager);
		var city = new City() {{ setCoordinates(new Point(47.476837416, -0.556125995444)); }};
		cityDao.create(city);
	}
}
