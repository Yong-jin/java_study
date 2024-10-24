package study.practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		1.
		2x + 4y = 10 이 만족하는
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)

		//2x + 4y = 10
		//2+8= 10	x:1 y:2
		//6+4= 10	x:3 y:1
		
		//x: 1 ~ 10
		//y: 1 ~ 10
		
		//x:1
		//y:1 2 3 4 5 .. 10
		//x:2
		//y:1 2 3 4 5 .. 10
		//..
		//x:10
		//y:1 2 3 4 5 .. 10
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				//x y
				//x:1 y:2 y:3~10
				//x:3 y:1 y:2~
				//x:4 y:1
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y);
				}
			}
		}
		
		// x:1~10 
		//for(int x=1; 2*x<10; x++) {
		//for(int y=1; 4*y<10; y++) {
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				
				if(2*x + 4*y > 10) {
					break;
				}
				
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y);
				}
				
			}
		}
		*/
		/*
		2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		
		30 20
		30-20 = 10
		50 100
		100-50= 50
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {	//num1 더 크다
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		} else { //num2가 더 크다   | num1 == num2
			System.out.printf("%d - %d = %d\n", num2, num1, num2-num1);
		}
		*/
		
		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		ex) 입력 0 0 1 0
		결과 도
		입력 0 1 0 1
		결과 개
		*/
		
		Scanner scanner = new Scanner(System.in);
		/*
		int y1, y2, y3, y4;
		
		System.out.print("입력 : ");
		y1 = scanner.nextInt();
		y2 = scanner.nextInt();
		y3 = scanner.nextInt();
		y4 = scanner.nextInt();
		
		int count = y1+y2+y3+y4;
		*/
		int[] yArr = new int[4]; // index: 0 1 2 3
		int count = 0;
		System.out.print("입력 : ");
		
		for(int i=0; i<yArr.length; i++) {
			yArr[i] = scanner.nextInt();
			count += yArr[i];
			
//			count = count + scanner.nextInt();	
		}
		/*
		for(int i=0; i<yArr.length; i++) {
			yArr[i] = scanner.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<yArr.length; i++) {
			//i: 0 1 2 3
			count = count + yArr[i];
			//				yArr[0] yArr[1] yArr[2] yArr[3]
		}
		*/
		
		switch(count) {
		case 0:
			System.out.println("결과 모");
			break;
		case 1:
			System.out.println("결과 도");
			break;
		case 2:
			System.out.println("결과 개");
			break;
		case 3:
			System.out.println("결과 걸");
			break;
		default:
			System.out.println("결과 윷");
			break;
		//case 4:
		}
		
		if(count==0) {
			
		} else if(count == 1) {
			
		} else if(count == 2) {
			
		} else if(count == 3) {
			
		} else {
			
		}
		
		/*
		if(일 == 1 && 이 ==0 && 삼 ==0 && 사 == 0
		||
		일 == 0 && 이 ==1 && 삼 ==0 && 사 == 0
		||
		일 == 0 && 이 ==0 && 삼 ==1 && 사 == 0
		1 0 0 0	= 1
		0 1 0 0	= 1
		0 0 1 0 = 1
		0 0 0 1 = 1
		
		1 1 0 0 = 2
		1 0 0 1 = 2
		
		1 1 0 1 = 3
		1 0 1 1 = 3
		0 1 1 1 = 3
		
		1 1 1 1 = 4
		 
		0 0 0 0 = 0
		
		뒤집어진 갯수 : 1 도 / 2 개 / 3 걸 / 4 윷 / 0 모
		*/
		
		
		/*
		4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//        123
		//        012
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
		*/
		
	}

}
