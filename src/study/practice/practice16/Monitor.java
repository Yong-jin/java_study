package study.practice.practice16;

public class Monitor {
	
	//속성(필드)
	int inch; //인치수
	String company; //제조사
	String model; //모델명
	
//	Monitor(){}
	
	//생성자(초기화)
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
	//메소드(동작/기능)
	void printInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf("[모니터정보] 제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
	}
	
//	void printInfo(String company, String model, int inch) {
//		//제조사:삼성 모델명:더프레임 인치:65인치
//		System.out.printf("[모니터정보] 제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
//	}
	
}

//모니터 클래스 생성
//		*속성
//		인치수(int타입)
//		제조사(String타입)
//		모델명(String타입)
//
//		*생성자
//		매개변수로 3개를 모두 받아서 저장하는 생성자
//
//		*메소드
//		가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
