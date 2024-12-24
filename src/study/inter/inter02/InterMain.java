package study.inter.inter02;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.callPhone = new IPhone();
		p.call("1231313");
		
		p.callPhone = new GalaxyPhone();
		p.call("1231124131");
		
		p.callPhone = new LGPhone();
		p.call("1231124131");
	}
}
