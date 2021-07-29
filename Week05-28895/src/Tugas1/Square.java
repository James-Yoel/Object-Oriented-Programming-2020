package Tugas1;

public class Square extends Shape{
private int side;
	
	public Square() {}
	public Square(int side, String color) {
		super(color);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public double getArea() {
		return side * 4;
	}
	
	public double getWide() {
		return side * side;
	}
}
