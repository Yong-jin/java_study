package study.practice.practice24;

public class GasRange {
	/*
		가스렌지
		- 화구가 몇인지
		- 어디 브랜드인지
		- 가격이 얼마인지
		- 불을 켠다
		- 불을 끈다
		- 불세기르 조절한다.
	 */
	int fireCount;
	String brand;
	int price;
	
	int fireLevel; //불단계 ( 0 ~ 10 )
	
	public void fireOn() {
		fireLevel = 1;
	}
	
	public void fireOff() {
		fireLevel = 0;
	}
	
	// setFireLevel(9);
	public void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
}
