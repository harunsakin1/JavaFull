package com.haruns._01_Factory.Ornek02;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape= shapeFactory.getShape(ShapeType.CIRCLE);
		shape.draw();
		shape=shapeFactory.getShape(ShapeType.RECTANGLE);
		shape.draw();
		shape=shapeFactory.getShape(ShapeType.SQUARE);
		shape.draw();
	}
}