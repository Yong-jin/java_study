package study.practice.practice18;

public class Triangle {

	int width; //밑변
	int height; //높이
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double)width * height / 2;
	}
	
}
