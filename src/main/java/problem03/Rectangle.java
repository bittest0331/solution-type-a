package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
		/* System.out.println(""); */
	}

	@Override
	public void resize(double rate) {
		height = height * rate;
		width = width * rate;
	}

	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}

	@Override
	public double getPerimeter() {
		return width*2 + height*2;
	}
}