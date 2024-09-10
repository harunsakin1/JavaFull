package com.haruns._01_Factory.Ornek02;

public class ShapeFactory implements AbstractFactory{
	
	public  Shape getShape(ShapeType shapeType){
		return switch (shapeType){
			case CIRCLE -> new Circle();
			case SQUARE -> new Square();
			case RECTANGLE -> new Rectangle();
			default -> new Circle();
		};
	}
}