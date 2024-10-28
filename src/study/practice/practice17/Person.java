package study.practice.practice17;

public class Person {
//	사람 클래스
//
	String name; 	//	이름
    String gender;	//	성별 "남" "여"		int 1 2 
    int age; 		//	나이 
    double tall;		//	키
    double weight;  //	몸무게
    String job; 	//	직업
    String bloodType;	//	혈액형	"A+ B- O AB"

    //boolean isHealthy;	//	건강상태	true    false
    int healthState; 
    //10 		9 8 7  ... 		1 0
    //매우건강	 건강	 보통 피곤하다 어디가 안좋다 	암 죽기직전 사망
    boolean isSleeping;	//	수면중여부	true	false
    
    Person(){}
    
    Person(String name, String gender, int age, String job){
    	this.name = name;
    	this.gender = gender;
    	this.age = age;
    	this.job = job;
    	
    	this.tall = 0;
    	this.weight = 0;
    	this.bloodType = null;
    	this.healthState = 0;
    	this.isSleeping = false;
    }
    
    Person(String name, String gender, int age, 
    		double tall, double weight, String job, 
    		String bloodType, int healthState, boolean isSleeping){
    	this.name = name;
    	this.gender = gender;
    	this.age = age;
    	this.tall = tall;
    	this.weight = weight;
    	this.job = job;
    	this.bloodType = bloodType;
    	this.healthState = healthState;
    	this.isSleeping = isSleeping;
    }
    
    void printPersonInfo() {
    	System.out.printf("%s %s %d %f %f ... \n", name, gender, age, tall, weight);
    }
}
