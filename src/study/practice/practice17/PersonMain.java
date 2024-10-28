package study.practice.practice17;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "나사람";
		p1.gender = "남";
		p1.age = 35;
		p1.tall = 195.7;
		// ... .
		System.out.println(p1.name + p1.gender);
		
		Person p2 = new Person("이름삼", "여", 31, 167, 76.4, "학생", "O", 10, false);
		p2.printPersonInfo();
	}

}
