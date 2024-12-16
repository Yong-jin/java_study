package study.practice.practice20;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			1.
			두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
			모든 경우의 수를 출력하는 프로그램을 작성하시오.
			
			1~6  3 2 1 5 4 
			1~6  3 4 5 1 2
		
		for(int i=1; i<=6; i++) { //주사위 1
			//i: 1 2 3 4 5 6
			for(int j=1; j<=6; j++) { //주사위 2
				//j: 1 2 3 4 5 6
				if( i + j == 6 ) {
					System.out.println( i + " , " + j );
				}
			}
		}
		
		*/
		
		
		/*
			2.
			로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
			최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
			로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
			1) Math.random() 활용
			2) int[] lotto = new int[6]; 활용
			
			1 15 20 22 23 41
			20 23 23 23 15 19
		*/
		
//		int[] lotto = new int[6];
		
		
		//1~45 랜덤한 값 뽑기
		//배열안에 중복된 값이 있는지 확인
		// 중복있다? -> 그럼 다시 뽑기
		// 중복없다? -> 저장하고 다음 숫자 뽑기
		// 총 6개 숫자가 뽑히면? 종료
		
		
		//1)
//		int index = 0;
//		boolean isDuplicated = false;
//		
//		while(true) {
//			//랜덤값 뽑기
//			int value = (int)(Math.random()*45) + 1;
//
//			//중복체크
//			isDuplicated = false;
//			
//			for(int i=0; i<index; i++) {
//				if( lotto[i] == value ) { 
//					//중복이다. 동일한 숫자가 이미 있다
//					isDuplicated = true; //중복체크
//					break;
//				}
//			}
//			
//			//중복이다?
//			/*
//			if(isDuplicated) { //중복O 
//								
//			} else {  //중복X
//				lotto[index] = value;
//				index++;
//			}
//			*/
//			
//			/*
//			if(isDuplicated == false) {
//				lotto[index] = value;
//				index++;
//			}
//			*/
//			if(isDuplicated) {
//				continue;
//			}
//			
//			lotto[index] = value;
//			index++;
//			
//			// 0 1 2 3 4 5 
//			if(index == 6) {
//				break;
//			}
//		}
		
		//2)
		
		//i: 0  1  2  3 4 5 / 6
		//  10 15 20 25 33
//		for(int i=0; i<6; i++) { // i값 조정 0 1 2 3 4 5   6 
//			lotto[i] = (int)(Math.random()*45) + 1;
//			
//			for(int j=0; j<i; j++) {
//				if(lotto[i] == lotto[j]) {  //중복 O ? 
//					i--;
//					break;
//				}
//			}
//		}
		
//		for(int i=0; i<6; i++) {
//			int value = (int)(Math.random()*45) + 1; // 1~45
////			System.out.println(value);
//			lotto[i] = value;
//		}

//		for(int i=0; i<lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
		 
		/*
			3.
			우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
			반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
			각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
			
			ex)
			1반 : 10 10 10 10 10
			2반 : 20 20 20 20 20
			3반 : 30 30 30 30 30
			
			1반 평균 : 10
			2반 평균 : 20
			3반 평균 : 30
			전체 평균 : 20
		*/
		
		/*
		int[][] points = new int[3][5]; 
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print( (i+1) + " 반 : ");
			for(int j=0; j<5; j++) {
				points[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0;
		int classTotal = 0;
		for(int i=0; i<3; i++) {
			
			classTotal = 0;
			for(int j=0; j<5; j++) {
				classTotal += points[i][j];
			}
			total = total + classTotal;
			System.out.println( (i+1) + "반의 평균 : " + (classTotal/5.0) );
		}
		System.out.println("전체 평균 : " + total/15.0);
		*/
		
		
		
		/*
		int[] point1 = new int[5];
		int[] point2 = new int[5];
		int[] point3 = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1반 : ");
		for(int i=0; i<5; i++) {
			point1[i] = scanner.nextInt();
		}
		
		System.out.print("2반 : ");
		for(int i=0; i<5; i++) {
			point2[i] = scanner.nextInt();
		}
		
		System.out.print("3반 : ");
		for(int i=0; i<5; i++) {
			point3[i] = scanner.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=0; i<5; i++) {
			sum1 = sum1 + point1[i];
			
			sum2 = sum2 + point2[i];
			
			sum3 = sum3 + point3[i];
		}
		
		int sum = sum1 + sum2 + sum3;
		
		System.out.println("1반 평균 : " + sum1/5.0);
		System.out.println("2반 평균 : " + sum2/(double)5);
		System.out.println("3반 평균 : " + (double)sum3/5);
		
		System.out.println("전체 평균 : " + (double)sum/(double)15);
		*/
		
		
		/*
			4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
			각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
			
			ex)
			int[][] arr =
			{
				{10, 20, 30},
				{20, 30, 40},
				{30, 40, 50}
			};
			이 주어지는 경우 최종 결과는
			10 20 30 60
			20 30 40 90
			30 40 50 120
			60 90 120 270
		 */
		
		int[][] arr =  // [3][3]
			{
				{10, 20, 30},
				{20, 30, 40},
				{30, 40, 50}
			};
		
		int[][] newArr = new int [4][4];   // arr.length+1  arr[0].length+1
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j]; // 원래 위치 그대로 복사
				
				newArr[i][3] += arr[i][j];
				newArr[3][j] += arr[i][j];
				newArr[3][3] += arr[i][j];				
			}
		}
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
				System.out.print(newArr[i][j] + "  ");
			}
			System.out.println();
		}
			

	}

}
