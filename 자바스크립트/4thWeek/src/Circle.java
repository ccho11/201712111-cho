
public class Circle {
	private int radius;
	private Point center;
	double pie = 3.14;
	
	
	public double calcArea() {
		return radius*radius*pie;
	}
	
	
	public Circle(Point p,int r) {
		center = p;
		radius = r;
	}
	
	@Override
	
	public String toString() {
		return center + ", �������� " + radius + " ���� ���̴� " + calcArea();
	}

}
