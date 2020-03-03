package figures;

public class Circle implements Figure {

	private static final double PI = 3.14;

	private String colour;

	private double radius;

	public Circle(String colour, double radius) {
		this.colour = colour;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw a circle...");
	}

	@Override
	public double getSquare() {
		return PI * radius * radius;
	}

	@Override
	public String getColour() {
		return colour;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "[Figure: circle, square = " + getSquare() + ", radius = " + radius + ", colour = " + colour + "]";
	}

}
