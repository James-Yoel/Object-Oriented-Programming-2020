package Tugas1;

public class Triangle extends Shape{
private int base, height;
	
	public Triangle() {}
	public Triangle(int base, int height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getArea() {
		return height * 3;
	}
	
	public double getWide() {
		return (base * height)/2;
	}
}
