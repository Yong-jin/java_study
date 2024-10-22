package study.refer;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3};
		
		System.out.println( arr1[0] == arr1[1] );
		//						int == int
		
		String[] arr2 = {"A", "B", "C"};
		
		System.out.println( arr2[0] == arr2[1] );
		//	arr2 String 	String == String   (주소 비교)
		//   				arr2[0].equals(arr2[1])  값 비교
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		
		String[][] arr3 = { {"A", "B", "C"}, {"D","E","F"}};
		
		//	String			String
		// arr3[0][1] == arr3[1][2] 주소
		// arr3[0][1].equals(arr3[1][2]) 주소 
		
		
		// arr3[0][2];
	}

}
