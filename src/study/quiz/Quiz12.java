package study.quiz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz12 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String str = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}"
				;
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj = (JSONObject)jsonParser.parse(str);
		
		JSONArray employees = (JSONArray)jsonObj.get("employees");
		
		for(int i=0; i<employees.size(); i++) {
			JSONObject employee = (JSONObject)employees.get(i);
			
			System.out.println("id : " + employee.get("id"));
			System.out.println("name : " + employee.get("name"));
			System.out.println("position : " + employee.get("position"));
			System.out.println("salary : " + employee.get("salary"));
			
			JSONArray skills = (JSONArray)employee.get("skills");
			System.out.print("skills : ");
			for(int j=0; j<skills.size(); j++) {
				System.out.print( skills.get(j) + " ");
			}
			System.out.println();
		}
		
		JSONObject company = (JSONObject)jsonObj.get("company");
		System.out.println("company");
		System.out.println("name : " + company.get("name"));
		System.out.println("address : " + company.get("address"));
		System.out.println("established : " + company.get("established"));
		
		JSONArray departments = (JSONArray)company.get("departments");
		
		System.out.println("departments");
		for(int i=0; i<departments.size(); i++) {
			JSONObject department = (JSONObject)departments.get(i);
			
			System.out.println("name : " + department.get("name"));
			
			JSONArray emps = (JSONArray)department.get("employees"); 
			
			System.out.print("employees : ");
			for(int j=0; j<emps.size(); j++){
				System.out.print( emps.get(j) + " ");
			}
			System.out.println();
		}
		
		
		JSONArray projects = (JSONArray)jsonObj.get("projects");
		
		for(int i=0; i<projects.size(); i++) {
			JSONObject project = (JSONObject)projects.get(i);
			
			System.out.println("title : " + project.get("title"));
			System.out.println("budget : " + project.get("budget"));
			
			JSONArray team = (JSONArray)project.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.println(team.get(j));
			}
		}
		
		
	}

}
