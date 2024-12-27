package study.practice.practice30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	//필드
	String truckName; //트럭 이름 (매장 이름)
	int totalSales; //총매출액
	boolean isOpened; //영업 중 여부
	List<Food> foodList; //판매하는 메뉴 음식 리스트
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(String name, int price) {
		foodList.add( new Food(name, price) );
	}
	
	public void startSales() {
		Scanner scanner = new Scanner(System.in);
		
		isOpened = true;
		System.out.println("====[ 푸트드럭 영업시작 ]====");
		
		while(isOpened) {

			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기  2.주문하기  3.재고관리  4.마감하기");
			System.out.print(">>> 입력 : ");
			
//			String input = scanner.nextLine();
			int menu = 0;
			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			} 
//			try {
//				menu = Integer.parseInt(input);
//			} catch (Exception e) {
//				menu = 0;
//			}
			
			switch(menu){
			case 1: //메뉴보기
				//List
				//index: 0 1 2 
				//사용자번호: 1 2 3 
//				for(Food f : foodList) {
// 					System.out.println(f.getFoodInfo());
//				}
				for(int i=0; i<foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i+1, foodList.get(i).getFoodInfo());
				}
				break;
			case 2: //주문
				for(int i=0; i<foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i+1, foodList.get(i).getFoodInfo());
				}
				System.out.print(">>>주문 메뉴를 선택하세요 : ");
				int orderMenu = scanner.nextInt();
				
				//주문했다~ 재고처리
				// 몇개 주문하시겠어요? 주문 수량 입력 :
				
				break;
			case 3: //재고관리
				
				break;
			case 4: //마감하기
				//매출 / 원가차감 -> 최종 수익?
				isOpened = false;
				System.out.println("====[ 푸트드럭 영업마감 ]====");
				break;
			default:
				System.out.println(">>> 잘못 입력 하셨습니다.\n");
			}
		
		}
	}
	
}