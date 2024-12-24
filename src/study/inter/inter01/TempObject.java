package study.inter.inter01;

public class TempObject implements Temp, Temp2 {

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}
	
}
