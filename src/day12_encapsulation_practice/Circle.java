package day12_encapsulation_practice;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("The radius cannot be set to a negative or zero value.");
        }
        this.radius = radius;
    }
    public double calcArea(){
        return Math.PI * radius*radius;
    }
    public double calcPerimeter(){
        return 2*Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area=" + calcArea()+
                ",perimeter" + calcPerimeter()+
                '}';
    }
}

/*
Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.



 */
