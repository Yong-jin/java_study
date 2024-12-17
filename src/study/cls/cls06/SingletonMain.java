package study.cls.cls06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//외부생성불가
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		Singleton st = Singleton.getInstance();
		
		Singleton st2 = Singleton.getInstance();
		
		Singleton st3 = Singleton.getInstance();
		
		Singleton st4 = Singleton.getInstance();
		
	}

}
