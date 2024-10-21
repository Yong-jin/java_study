package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		for(초기; 조건; 증감){
			실행문;
		}
		
		while(조건){
			실행문;
		}
		
		 */
		//5번만 출력
		
		
		for(int i=1; i<=5; i++) {	
			// i: 1 2 3 4 5
			System.out.println("피곤하다");				
		}
		
		int j = 1;
		while(j<=5) {
			System.out.println("졸리다");
			j++;
		}
		
		/*
		while(true) {
			System.out.println("무한");
		}
		*/
		int k = 10;
		do {
			System.out.println("k do while");
		} while(k<5);
		
		
		k = 1;
		while(true) {
			//무한루프
			
			k++; //k: 2 3 4 5 6 7 8 9 10 
			
			if(k == 10) {	//참
				break; //멈추기
			}
			
			System.out.println(k);	//1 2 3 4 5 6 7 8 9
			
		}
		
		//
		System.out.println("===================");
		for(int i=1; i<=10; i++) {

			if(i == 5)
				continue;
			
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		}
	}

}











