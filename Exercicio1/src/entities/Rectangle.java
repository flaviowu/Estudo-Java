package entities;

public class Rectangle {

	public double w;
	public double h;
	
	public double area() {
		return w*h;
	}
	public double perimetro() {
		return (w+h)*2;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(w,2)+Math.pow(h,2));
	}
}

