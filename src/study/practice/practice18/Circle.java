package study.practice.practice18;

public class Circle {

	int radius; //반지름
	
	//Circle(){}
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
//		double area = radius * radius * 3.14;
//		return area;
		return radius * radius * 3.14;
	}
}
