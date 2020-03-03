package figures;

public class Trapeze implements Figure {

	private String colour;

	private double firstBase;

	private double secondBase;

	private double height;

	public Trapeze(String colour, double firstBase, double secondBase, double height) {
		this.colour = colour;
		this.firstBase = firstBase;
		this.secondBase = secondBase;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Draw a trapeze...");
	}

	@Override
	public double getSquare() {
		return 0.5 * (firstBase + secondBase) * height;
	}

	@Override
	public String getColour() {
		return colour;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "[Figure: trapeze, square = " + DECIMAL_FORMAT.format(getSquare()) + ", height = "
				+ DECIMAL_FORMAT.format(height) + ", colour = " + colour + "]";
	}

}
