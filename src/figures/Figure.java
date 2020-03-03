package figures;

import java.text.DecimalFormat;

public interface Figure {
	
	public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00"); 

	public void draw();

	public double getSquare();

	public String getColour();

}
