//Michael Ivey

package Triangle;

import GeometricObject.GeometricObject;

public abstract class Triangle extends GeometricObject {
	private double side1 = 1.0; //base
	private double side2 = 1.0; //height
	private double side3 = 1.0;	//hypotenuse
	
	
	
	public Triangle() {
		
	}


	public Triangle(double side1, double side2, double side3) {		
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getArea(){
		return (this.side1*this.side2) * .5;
		
	}
	
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3);
		
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getDateCreated()=" + getDateCreated()
				+ ", toString()=" + super.toString() + ", getArea()="
				+ getArea() + ", getPerimeter()=" + getPerimeter()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
