package study.practice.practice24;

public class TrashCan {

	int liter;  // 10L
	String color;
	
	int percent; // 100%  90 95 80 0 
	
	boolean isCoverOpened; //쓰레기통 뚜껑 열렸나? 닫혔나?
	/*
	(*주방에 여러개가 있다)
	- 몇리터
	- 색상
	- 용량이 몇퍼센트나 찼는지
	- 쓰레기를 채운다
	- 쓰레기통을 연다
	- 쓰레기통을 닫는다
	- 쓰레기통을 비운다
	*/
	public void openCover() {
		isCoverOpened = true;
	}
	
	public void closeCover() {
		isCoverOpened = false;
	}
	
	public void cleanTrashCan() {
		percent = 0;
	}
	
	public void insertTrash(int percent) {  // 20% 
		this.percent += percent;
	}
	
	public void insertTrashLiter(int liter) { // 3L 
		percent = percent + (liter/this.liter * 100);
		
		//         10     +  (3L/10L) * 100
		//			10    +		30 = 40 
	}
}
