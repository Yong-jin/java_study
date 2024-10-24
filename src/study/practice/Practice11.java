package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		연습문제 - 1

		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력하세요 : ");
		int num = scanner.nextInt(); //입력받기
		//num % 2 == 0	// 0 1 
		
		if(num%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		switch(num%2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
		
		System.out.println( (num%2==0 ? "even" : "odd")  );
		*/
		
		/*

		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		7	14	21	28	35	42 ...
			

		 
		System.out.print("정수를 입력 : ");
		int num = scanner.nextInt();
		if(num%7 == 0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		*/
		
/*
		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.

		int sum = 0;
		for(int i=1; i<=1000; i++) {
			//i: 1 ~ 1000
			if(i%5 == 0) { //5의 배수
				sum = sum + i;
			}
		}
		System.out.println("1~1000까지 5의 배수합 : " + sum);
		
		sum = 0;
		for(int i=5; i<=1000; i=i+5) {
			//i: 5 10 15 20 ...
			sum = sum + i;
		}
		System.out.println("1~1000까지 5의 배수합 : " + sum);
		
		sum = 0;
		int i = 1;
		while(i<=1000) {
			if(i%5 == 0)
				sum = sum + i;
			
			i++;
		}
		System.out.println("1~1000까지 5의 배수합 : " + sum);
	*/	
		
	/*
		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		ex) 입력 : 10
		결과 : **********
	
		System.out.print("1~50 정수 입력 하세요 : ");
		int num = scanner.nextInt();
		// num 5
		// num 10
		
		//if(num >= 1 && num <= 50)
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		
	*/
		
	/*
		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		ex) 1 - 2 + 3 - 4 .....
	
		//int result = 1-2+3-4+5-6+7-8+9-10;
		int result = 0;
		for(int i=1; i<=10; i++) {
			
			if(i%2 == 0) { //짝수
				result = result - i;
			} else {  //홀수
				result = result + i;
			}
			
		}
		System.out.println(result);
		
		
		result = 0;
		for(int i=1; i<=10; i=i+2) { //홀수
			result = result + i;
		}
		
		for(int i=2; i<=10; i=i+2) { //짝수
			result = result - i;
		}
		System.out.println(result);
	*/
		
	/*
		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
	 
	
		int total = 0;
		
		//i: 1 ~ 1000 
		//누적합이 > 1000
		
//		for(int i=1; i<=1000; i++) { 
//		  +계산
//		  
//		  if(total >= 1000)
//		  	break;
//		}
		
//		for(int i=1; total<1000; i++) {
//		}
		
		int i=1;
		while(total<1000) {
			total = total + i;	//1 + 2  +3 
			i++;//4
		}
		System.out.println("누적 값 : " + total);
		// 1+2+3+....+43+44+45
		
		total = 0;
		i = 1;
		while(true) {
			total = total + i;
			i++;
			
			if(total >= 1000)
				break;
		}
		System.out.println("누적 값 : " + total);
	*/
	
	/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
	*/
		System.out.print("몇단 출력할래? (1~9) : ");
		int num = scanner.nextInt();
		//num = 3;
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %3d\n",num, i, num*i);
		}
		
	}

}










