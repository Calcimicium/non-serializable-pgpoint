package fr.laboiteadodo.nonserializablepgpoint;

import javax.persistence.*;

@Entity
public class City {
	@Id
	@GeneratedValue(generator = "city_id")
	@SequenceGenerator(name = "city_id", sequenceName = "seq_city_id", allocationSize = 1)
	private Long id;

//	@Convert(converter = PointToPGpointConverter.class)
//	private Point coordinates;

	public Long getId() {
		return id;
	}

//	public Point getCoordinates() {
//		return coordinates;
//	}

//	public void setCoordinates(Point coordinates) {
//		this.coordinates = coordinates;
//	}
}
