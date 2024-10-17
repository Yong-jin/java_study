package study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술
		System.out.println( 1+1 );
		System.out.println( 9-4 );
		System.out.println( 3*1 );
		System.out.println( 7/3.0 );
		System.out.printf("%.2f\n", 7/3.0 );
		System.out.println( 9%5 );
		
		//부호
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		
		System.out.println("================================");
		//증감
		int x = 10;
		System.out.println( x-- );	//9	// ++변수 +를 먼저  변수++ +를 나중에
		System.out.println( x );	//9
		
		int y = 20;
		System.out.println( ++y );	// 21
		System.out.println( y );	// 21
		
		int z = 30;
		System.out.println( z+1 );	// 30+1  => 31
		System.out.println( z );	// 30
		
		int q = 1;	// 2
		int w = 3;  // 2
		int e = 10 + ++q;	//10 + 2;  -> 12
		int r = 3 + w--; // 3 + 3 -> 6  w--
		
		System.out.printf("%d %d %d %d\n", q,w,e,r);
		
		boolean isFinished = false;
		System.out.println( !isFinished );
		System.out.println( isFinished );		
		
		// isSleep  true   false    !isSleep
		
		//비교
		System.out.println( 1 == 2 );	//false
		System.out.println( 1 != 2 );	//true
		System.out.println( 3 < 5  );	//true
		System.out.println( 4 <= 4 );	//true
		System.out.println( 5 > 10 );	//false
		System.out.println( 9 >= 8 );	//true
		boolean b1 = (9 >= 8);
		
		System.out.println("--------------------------");
		//논리
		boolean b2 = ( 10 > 6 ) && ( 10 > 5);
		//				true		 true
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || ( 10 < 4 );
		//				true		false	  
		System.out.println(b3);
		
		boolean b4 = ( 2 >= 1) && !( 3<4 );
		//				true        false
		System.out.println( b4 );
		//System.out.println( !b4 );
		
		//대입
		int a = 30;
		
		a += 30;	// a = a + 30;
		a -= 5; 	// a = a - 5;
		a *= 3;     // a = a * 3;
		a /= 2;     // a = a / 2;
		a %= 4;		// a = a % 4;
		
		// a += 1;    a = a + 1;
		
		//삼항
		int point = -50;
		
		// 0 ~ 200 : 생수
		// 201 ~  : 커피
		
		String eventItem = (point <= 200) ? "생수" : "커피" ;
		System.out.println(eventItem);
		
		eventItem = (point > 200) ? "커피" : "생수";
		
		// 0 ~ 200: 생수			
		// 201 ~ 300 : 커피
		// 301 ~  : 맥주
		
		//			-50 > 200
		eventItem = (point > 200) ? ( point > 300 ? "맥주" : "커피" ) : ( point >= 0 ? "생수" : "사은품 없음" );
								// 201~
		System.out.println(eventItem);
		
		eventItem = (point > 200) ? ( ( point>=201 && point<=300  ) ? "맥주" : "커피" ) : "생수";
			//							 	false
		
		
		// (point >= 0 && point <= 200 )
		
	
		
	}

}


