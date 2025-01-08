package study.practice.practice32;

import java.util.List;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//student 정보 가져와~
		//그거 가져와서 한번 출력~ 
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list1 = studentDAO.findStudentList(); //전체 학생정보
		
		System.out.println("*********전체 리스트 *************");
		for(StudentDTO s : list1) {
			System.out.println(s);
			
			//System.out.println((ConvertDateUtil.convertLocalDateTimeToString(s.getBrithday())));
			//LocalDateTime  yyyy-mm-dd
		}
		
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(3); //3학년 학생정보
		
		
		System.out.println("*********3학년 리스트 *************");
		for(StudentDTO s : list2) {
			System.out.println(s);
		}
		

		//저장을 하려는 StudentDTO 객체
		//insert 호출
		
		StudentDTO saveStudent = new StudentDTO(2, "이름", "아이디2", 5, "9901011234123", "2000-05-31", "010-1234-1234", 180, 80, 305, 405, 9999);
		int result = studentDAO.saveStudent(saveStudent);
		System.out.println(result);  // > 0 
	}

}







