package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		
		num
		
		for(시작; 어떤조건; 증감)
		    i=1; i<=10; i++
		    i=num; i<=10; i++
		    i=1;   i<=num; i++
		    i=1; i<=10; i=i+num 
		
		for	i:~
			for j:~
			줄바꿈
		
		print("*");
		
		라인 : 5개 i:1~5
		
		*****		:5번		j=1; j<=5; j++;		i:5
		****		:4번		j=1; j<=4; j++;		i:4
		***			:3번		j=1; j<=3; j++;		i:3
		**			:2번		j=1; j<=2; j++;		i:2
		*			:1번		j=1; j<=1; j++;		i:1
		*/
		
		for(int i=5; i>=1; i--) {	//:i : 5 4 3 2 1
			for(int j=1; j<=i; j++) {
				//i:5  j:1 2 3 4 5
				//i:4  j:1 2 3 4 
				//i:3  j:1 2 3 
				//i:2  j:1 2 
				//i:1  j:1
				System.out.print(j);
			}
			System.out.println();
		}
	
		
		/*
		
		*****		:5번		j=1; j<=(6-1); j++;		i:1
		****		:4번		j=1; j<=(6-2); j++;		i:2
		***			:3번		j=1; j<=(6-3); j++;		i:3
		**			:2번		j=1; j<=(6-4); j++;		i:4
		*			:1번		j=1; j<=(6-5); j++;		i:5
		
		*/
		for(int i=1; i<=5; i++) {	//i: 1 2 3 4 5
			for(int j=1; j<=(6-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		
		*****		:5번		j=0; j<=(5-1); j++;		i:1
		****		:4번		j=0; j<=(5-2); j++;		i:2
		***			:3번		j=0; j<=(5-3); j++;		i:3
		**			:2번		j=0; j<=(5-4); j++;		i:4
		*			:1번		j=0; j<=(5-5); j++;		i:5
		
		*/
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<=(5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		
		*****		:5번		j=1; j<=(5-0); j++;		i:0
		****		:4번		j=1; j<=(5-1); j++;		i:1
		***			:3번		j=1; j<=(5-2); j++;		i:2
		**			:2번		j=1; j<=(5-3); j++;		i:3
		*			:1번		j=1; j<=(5-4); j++;		i:4
		
		*/
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		
		*****		:5번		j=5; j>=i; j--;		i:1
		****		:4번		j=5; j>=i; j--;		i:2
		***			:3번		j=5; j>=i; j--;		i:3
		**			:2번		j=5; j>=2; j--;		i:4
		*			:1번		j=5; j>=i; j--;		i:5
		
			54321
			5432
			543
			54
			5
		*/
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
			54321		i:1		j:5~1
			4321		i:2		j:4~1
			321			i:3		j:3~1
			21			i:4		j:2~1
			1			i:5		j:1~1
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=(6-i); j>=1; j--) {	//
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/*

		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****

		*/
		
		System.out.println("============================");
		
		//4줄
		//i: 1 2 3 4
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/*

		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6

		*/
		
		/*
		System.out.println("============================");
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		
		System.out.println(num + "의 약수");
		for(int i=1; i<=num; i++) {
			//i: 1 2 3 4 ...
			//num : 입력값
			if(num%i == 0) {
				System.out.print(i + " ");
			}
			
		}
		*/
		
		
		
		/*

		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5		-> 9라인
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		

		입력 : 3			-> 5라인

		*
		**
		***
		**
		*
		
		*/
		
		/*
		System.out.println("============================");
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		
		//입력받은 값
		
		//~ num  늘어나는형태
		for(int i=1; i<=num; i++) {	//i:1 2 3 4 5
			for(int j=1; j<=i; j++) {	//j:1   12  123  1234  12345
				System.out.print("*");
			}
			System.out.println();
		}
		
		//num-1 ~ 점점 줄어드는 형태
		// 4 3 2 1 
		for(int i=num-1; i>=1; i--) {	//i: 4 3  2 1
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		System.out.println("============================");
		/*

		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
*/
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				//System.out.print(j);
				sum = sum + j; 
			}
			//System.out.println();
		}
		System.out.println("총합 : " + sum);
		
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + ( i * (10 - (i-1) ) );
		}
		System.out.println("총합 : " + sum);
		
		
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) { //i:1~10
			currentSum = currentSum + i; // 1  , 1+2, 1+2+3, 1+2+3+4 ...
			sum = sum + currentSum;
		}
		System.out.println("총합 : " + sum);
		
		
		System.out.println("============================");

		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		*/
		int total = 0;
		int i=1;
		
		for(i=1; total<100; i++) {	//i:200
			
			if(i%2 == 0) { //짝수 -		//198
				total = total - i;		// -198  => -99
			} else {  //홀수 +		//199
				total = total + i;	//-99 + 199 => 100
			}
		}
		System.out.println("누적합 : " + total + " 얼마까지 계산했는가 : " + (i-1));
		
		
		total = 0;
		i=1;
		while(true) {
			if(i%2 == 0) {
				total = total - i;	//199
			} else {
				total = total + i;	
			}
			 
			if(total >= 100) {
				break;
			}
			
			i++;
		}
		System.out.println("누적합 : " + total + " 얼마까지 계산했는가 : " + i);
		
		
		total = 0;
		i=0;
		while(true) {
			i++;		//1-2+3
			if(i%2 == 0) {
				total = total - i;	//199
			} else {
				total = total + i;	
			}
			 
			if(total >= 100) {
				break;
			}
			
			
		}
		System.out.println("누적합 : " + total + " 얼마까지 계산했는가 : " + i);
			
	
		
		
	}

}
