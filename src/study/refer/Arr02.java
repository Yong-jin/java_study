package study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[]
		//int[][][] 
		//int[][][][]
		int[][] nArr1 = new int[3][5];
		
		// nArr1.length 3
		
		/*	0  1 2  3 4 
		0	ㅁ ㅁ ㅁ ㅁ ㅁ
		1	ㅁ ㅁ ㅁ ㅁ ㅁ
		2	ㅁ ㅁ ㅁ ㅁ ㅁ
		 */
		
		int[][] nArr2 = new int [2][3];
		// 0 
		
		/*
			0  1 2
		0	ㅁ ㅁ ㅁ
		1	ㅁ ㅁ ㅁ 
		
		*/
		
		int[] nA = {1,2,3,4,5,6};
		
		int[][] nArr3 = { {1,2,3}, {4,5,6} };
				//	2      3
		//			0 1    0 1 2 
		
		System.out.println(nArr3[0][2]);
		
		/*
		0  1 2
	0	1 2 3
	1	4 5 6 
	
	*/	
		//	[2][3]		행의길이 2
		for(int i=0; i<nArr3.length; i++) {
			// i: 0 1 
			
			//					3
			//			   nArr3[0].length
			//			   nArr3[1].length
			for(int j=0; j<nArr3[i].length; j++) {
				// j: 0 1 2 
				System.out.print(nArr3[i][j] + " ");
				// i: 0 0 0 1 1 1 
				// j: 0 1 2 0 1 2 
				// nArr3[0][0] nArr3[0][1] nArr3[0][2]
				// nArr3[1][0] nArr3[1][1] nArr3[1][2]
			}
			System.out.println();
		}
		
		int[][] nArr4 = new int[5][3];
		
		
		
		
	}

}
