package study.quiz;

public class Quiz07 {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크", 80);
		System.out.println(orc.toString());
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		//OrcWarrior ow = new OrcWarrior("오크전사", 120, 3);
		Orc ow = new OrcWarrior("오크전사", 120, 3);
		System.out.println(ow.toString());
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
//		String str = "Orc { name: " + name + " , hp: " + hp + " } ";
//		return str;
		return String.format("Orc { name: %s , hp : %d }", name, hp);
	}
}

class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		return String.format("OrcWarrior { name: %s , hp : %d , armor : %d }", name, hp, amor);
	}
}
