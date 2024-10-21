package study.practice;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기
 
		for/while 반복
		
		단순 횟수만 반복 vs 연산(실행문) 참여
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345

		//2.
		11111
		22222
		33333
		44444
		55555
		*/
		
		System.out.println("===============");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		
		System.out.println("===============");
		for(int i=1; i<=5; i++) {
			System.out.println("12345");
		}
		
		System.out.println("===============");
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				//실행문
				System.out.print(j);
			}
			
			System.out.println();
		}
		/*
		i: 1 
		j: 1 2 3 4 5 	"12345"
		
		i: 2
		j: 1 2 3 4 5	"12345"
		
		i: 3
		j: 1 2 3 4 5	"12345"
		
		i: 4
		j: 1 2 3 4 5	"12345"
		
		i: 5
		j: 1 2 3 4 5	"12345"
		*/		
		
		System.out.println("===============");
		System.out.println("11111");
		System.out.println("22222");
		System.out.println("33333");
		System.out.println("44444");
		System.out.println("55555");
		
		System.out.println("===============");
		for(int i=1; i<=5; i++) {
			System.out.println(11111 * i);
		}
		
		System.out.println("===============");
		for(int i=11111; i<=55555; i=i+11111) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				//실행문
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*
		i: 1 1 1 1 1  	"11111"
		j: 1 2 3 4 5 
		
		i: 2 2 2 2 2 	"22222"
		j: 1 2 3 4 5	
		
		i: 3 3 3 3 3 	"33333"
		j: 1 2 3 4 5	
		
		i: 4 4 4 4 4	"44444"
		j: 1 2 3 4 5	
		
		i: 5 5 5 5 5	"55555"
		j: 1 2 3 4 5	
		*/	
	}	

}
