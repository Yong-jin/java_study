package study.api;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {

	public static void main(String[] args)  {

		List<ArplInfo> arplList = null;
		try {
			arplList = ArplApiService.forecastDustArplInfoList("2024-12-21");

			for(ArplInfo info : arplList) {
				System.out.println( info.toString() );
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ArplInfo 객체 -> DB 저장
		
		//ArplDAO
		ArplDAO arplDAO = new ArplDAO();
		
		int count = 0;
		for(ArplInfo ai : arplList) {
			count += arplDAO.saveArplInfo(ai);
		}
		System.out.println(count + "개 저장성공");
		
		//API -> 데이터확보 -> 저장
		//누적해서 데이터를 계속 저장/활용
			//1)기존 데이터 delete -> 새로 insert
			//2)MERGE 처리
		
//		int result = arplDAO.saveArplInfo(arplList.get(0));
//		if(result > 0) {
//			System.out.println("저장 잘 됨");
//		}
	}
	
	
	
	
	
	//메소드 요청 응답 예시
	public String aprlDustInfoToday(int code) {	//100 200 300
		if(code == 100)
			return "오늘은 먼지가 깨끗합니다";
		else if (code == 200 )
			return "오늘은 먼지가 안깨끗";
		else if (code == 300 )
			return "ABDDOE";  //ABDDOE 먼지가 너무 안좋아서 집에있어라
		else
			return "잘못된 요청입니다";
	}

}











