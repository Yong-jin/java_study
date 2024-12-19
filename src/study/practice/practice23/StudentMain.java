package study.practice.practice23;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.dept = "컴공";
//		s1.stuNum = 1334;
//		
//		System.out.println("학과:" + s1.dept + " 학번:" + s1.stuNum);
		s1.setDept("컴공");
		s1.setStuNum(1334);
		
		System.out.println("학과:" + s1.getDept() + " 학번:" + s1.getStuNum());
		
	}
}
