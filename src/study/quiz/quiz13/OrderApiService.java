package study.quiz.quiz13;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OrderApiService {
	
	//외부에 누구 고객의 주문정보 조회
	
	//오늘날짜 주문정보 조회
	
	public static CustomerDTO orderInfo() throws ParseException {
		
		//어딘가 주소 지정
		//요청 변수 지정 (+인증키 지정)
		//요청
		//응답 받은 데이터
		String s = "{"
				+ "\"id\": 1,"
				+ "\"name\": \"John Doe\","
				+ "\"contacts\": ["
				+ "{"
				+ "\"type\": \"email\","
				+ "\"value\": \"john.doe@example.com\""
				+ "},"
				+ "{"
				+ "\"type\": \"phone\","
				+ "\"value\": \"01023456789\""
				+ "}"
				+ "],"
				+ "\"address\": {"
				+ "\"street\": \"123 Main Street\","
				+ "\"city\": \"Seoul\","
				+ "\"zipcode\": \"12345\""
				+ "},"
				+ "\"orders\": ["
				+ "{"
				+ "\"orderId\": \"ORD-001\","
				+ "\"date\": \"2024-07-09\","
				+ "\"items\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"Smartphone\","
				+ "\"quantity\": 2"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"Laptop\","
				+ "\"quantity\": 1"
				+ "}"
				+ "]"
				+ "},"
				+ "{"
				+ "\"orderId\": \"ORD-002\","
				+ "\"date\": \"2024-07-10\","
				+ "\"items\": ["
				+ "{"
				+ "\"id\": 3,"
				+ "\"name\": \"Headphones\","
				+ "\"quantity\": 1"
				+ "}"
				+ "]"
				+ "}"
				+ "]"
				+ "}";
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		//json 포맷 -> 파싱 -> customerDTO 내부 변수 잘 매핑
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(s);
		
		JSONArray orders = (JSONArray)obj.get("orders");
		
		for(int i=0; i<orders.size(); i++) {
			JSONObject order =  (JSONObject)orders.get(i);
			System.out.println(order.get("orderId"));
			System.out.println(order.get("date"));
			
			JSONArray items = (JSONArray)order.get("items");
			
			for(int j=0; j<items.size(); j++) {
				JSONObject item = (JSONObject)items.get(j);
				System.out.println(item.get("id"));
				System.out.println(item.get("name"));
				System.out.println(item.get("quantity"));
			}
		}
		
		
		
		return customerDTO;
	}
}




















