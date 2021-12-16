package fr.laboiteadodo.nonserializablepgpoint;

import javax.persistence.Entity;

@Entity
public class City {
	private Point coordinates;

	public Point getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}
}
