package constructor;

public class Circle {
	private double r;
	private double length;
	private double area;

	public Circle(double r) {
		this.r = r;
	}

	public void calc() {
		length = 2 * Math.PI * r;
		area = Math.PI * r * r;
	}

	public void print() {

	}
}
