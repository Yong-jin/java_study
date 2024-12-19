package study.practice.practice24;

public class Sink {

	int width;	// 2000 mm
	int height; // 450  mm
	int depth;
	String color;
	String material;
	/*
		- 가로, 세로, 깊이 사이즈
		- 색상
		- 재질
	 */
	public int getWidth() {   //mm
		return width;
	}
	
	public double getWidthAsCm() {     //Meter, Cm
		return width/10.0;  //450 mm -> 45cm 
		// 1280 -> 128cm
		// 1305 -> 130.5cm
	}
}
