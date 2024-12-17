package study.cls.cls04;

import java.util.Scanner;

//import java.util.Scanner;

public class IPadMain {
	
	//Java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPad p1 = new IPad(); //인스턴스 객체 생성
		
		p1.owner = "내꺼";
		p1.powerOn();
		
		
		IPad p2 = new IPad();
		p2.owner = "니꺼";
		
		System.out.println(p1.owner);
		
		System.out.println(IPad.madeBy);
		
		IPad.check();
		
		System.out.println(p1.madeBy);	// IPad.madeBy
		System.out.println(p2.madeBy);
		System.out.println(IPad.madeBy);
		
		Math.random();
		Integer.parseInt("134");
		
		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		
		
	}

}
