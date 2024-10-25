package study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		// 기본값 : 0
		
		//저장
		for(int i=0; i<5; i++) {
			//i: 0~4
			for(int j=0; j<5; j++) {
				//j: 0~4
				if(i>j) {
					arr[i][j] = 3;
				} else if (i<j) {
					arr[i][j] = 2;
				} else {
					arr[i][j] = 1;
				}
			}
		}
		
		//출력
		for(int i=0; i<5; i++) {
			//i: 0~4
			for(int j=0; j<5; j++) {
				//j: 0~4
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		for(int i=1;i<=5;i++) {// i:				 1 2 3 4 5
				 
			for(int j=1;j<=i-1;j++) {  //j:1 j<=i-1; 0 1 2 3 4
				System.out.print("3 ");//		     0 1 2 3 4
			}
			
			System.out.print("1 ");  //1 한개 출력
			
			
			for(int j=4-i;j>=0;j--) { //j:4-i j>=0;  3 2 1 0 -1
				System.out.print("2 ");//			 4 3 2 1 0 	
			}
			System.out.println();
		}
		*/
		
	}

}








