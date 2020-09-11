package csc1302;
/*@author Preetham Thelluri
 * The purpose of this lab is to see how certain methods can be overridden and used. 
 * In this case, we are overriding the toString() method.
 * */
public class Rectangle {
	int x = 0;
	int y = 0;
	double height = 0;
	double width = 0;
	
	public void setFields(int newx, int newy, double newheight, double newwidth) {
		x = newx;
		y = newy;
		height = newheight;
		width = newwidth;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getheight() {
		return height;
	}
	public double getwidth() {
		return width;
	}
	public double area() {
		return(height * width);
	}
	public double perimeter() {
		return(2*(height + width));
	}
	public String toString() {
		return("Rectangle [x = " + x + ", y = " + y + ", height = " + height + ", width = " + width + "] Area is " + (int) (height * width) + ".");
	}
}
