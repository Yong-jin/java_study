package study.quiz.quiz13;

import java.util.List;

public class CustomerDTO {	//고객 정보 저장용 (포장박스)
	
	int id;
	String name;
	
	List<Contact> contacts;
	Address address;
	List<Order> orders;
	
}
