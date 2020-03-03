package figures;

public class Triangle implements Figure {

	private String colour; 
	
	private double firstCathet;

	private double secondCathet;
	
	public Triangle(String colour, double firstCathet, double secondCathet) {
		this.colour = colour;
		this.firstCathet = firstCathet;
		this.secondCathet = secondCathet;
	}

	@Override
	public void draw() {
		System.out.println("Draw a triangle...");
	}

	@Override
	public double getSquare() {		
		return 0.5 * firstCathet * secondCathet;
	}

	@Override
	public String getColour() {
		return colour;
	}
	
	private double getHypotenuse() {
		return Math.sqrt(firstCathet * firstCathet + secondCathet * secondCathet);
	}

	@Override
	public String toString() {
		return "[Figure: triangle, square = " + getSquare() + ", hypotenuse = " + getHypotenuse() + ", colour = " + colour + "]";
	}

}
