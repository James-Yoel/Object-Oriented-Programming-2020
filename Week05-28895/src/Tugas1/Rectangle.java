package Tugas1;

public class Rectangle extends Shape{
private int length, width;
	
	public Rectangle() {}
	public Rectangle(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public double getArea() {
		return length + length + width + width;
	}
	
	public double getWide() {
		return length * width;
	}
}
