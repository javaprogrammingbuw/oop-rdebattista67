public class Point2D {
	double x;
	double y;

	// --- CONSTRUCTORS

	public Point2D() {
		x = 0.0;
		y = 0.0;
	}

	public Point2D(double dx, double dy) {
		x = dx;
		y = dy;
	}

	// --- METHODS

	/**
	* This method will set the x value.
	*
	* @param{dx} The new value.
	*/
	public void setX(double dx) {
		x = dx;
	}

	/**
	* This method will return the x value.
	*
	* @return The current x value.
	*/
	public double getX() {
		return x;
	}

	// TODO : continue here
}

