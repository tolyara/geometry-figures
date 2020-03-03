package figures;

public class Square implements Figure {

	private String colour;

	private double side;

	public Square(String colour, double side) {
		this.colour = colour;
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Draw a square...");
	}

	@Override
	public double getSquare() {
		return side * side;
	}

	@Override
	public String getColour() {
		return colour;
	}

	public double getSide() {
		return side;
	}

	@Override
	public String toString() {
		return "[Figure: square, square = " + DECIMAL_FORMAT.format(getSquare()) + ", side = "
				+ DECIMAL_FORMAT.format(side) + ", colour = " + colour + "]";
	}

}
