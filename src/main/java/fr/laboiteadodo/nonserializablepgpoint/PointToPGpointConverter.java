package fr.laboiteadodo.nonserializablepgpoint;

import javax.persistence.*;

import org.postgresql.geometric.PGpoint;

@Converter
public class PointToPGpointConverter implements AttributeConverter<Point, PGpoint> {
	@Override
	public PGpoint convertToDatabaseColumn(Point attribute) {
		return new PGpoint(attribute.getX(), attribute.getY());
	}

	@Override
	public Point convertToEntityAttribute(PGpoint dbData) {
		return new Point(dbData.x, dbData.y);
	}
}
