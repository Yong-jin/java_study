package study.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = {
				"leo", "kiki", "eden"
		};
		String[] completion1 = {
				"eden", "kiki"
		};
			
		String[] participant2 = {
				"marina", "josipa", "nikola", "vinko", "filipa"
		};
		String[] completion2 = {
				"marina", "josipa", "nikola", "filipa"
		};
		
		
		String[] participant3 = {
				"mislav", "stanko", "ana", "mislav"
		};
		String[] completion3 = {
				"mislav", "stanko", "ana"
		};
		
		String result1 = solution(participant1, completion1);	//leo
		String result2 = solution(participant2, completion2);	//vinko
		String result3 = solution(participant3, completion3);	//mislav
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
//		if(!result1.equals("leo")) {
//			//정답이 아니네~
//		}
	}
	
	public static String solution(String[] participant, String[] completion){
		
		/*
		//ArrayList 활용
		//1. 참가자 목록에서 완주자 목록에 있는 이름을 하나씩 지우기
		List<String> partList = new ArrayList<String>(List.of(participant));
		List<String> compList = new ArrayList<String>(List.of(completion));

		//		System.out.println(partList);
		
		for(String s : compList) {
			partList.remove(s);
		}
		
		//System.out.println(partList);
		
		return partList.get(0); //이름 리턴
		*/
		
		/*
		//HashSet 활용
		//2. 완주자 목록 추가.  ->   참가에서 한개씩 지우기
		Set<String> compSet = new HashSet<String>();
		for(String s : completion) {
			compSet.add(s);  //완주자 목록
		}
		
		//참가자 값을 compSet에서 확인해서 있는지 확인?
		
		for(String s : participant) {
			if(compSet.contains(s)) {   // 있다? 삭제
				compSet.remove(s);
			} else {  // 없다? 완주 못했다
				return s;   //조건 안에있는 return 실행이 안될수도 있다로 판단됨
			}
		}
		
		return null;  //리턴 명시 필수
		*/
		
		//3. HashMap 활용
		
		//  이름	     갯수
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		
		for(String s : participant) {
			
			pMap.put(s,  pMap.getOrDefault(s, 0) + 1 );
			/*
			if(pMap.containsKey(s)) { //이미 그 이름이 있다
				pMap.put(s, pMap.get(s) + 1);
			} else {  //그 이름이 없다
				pMap.put(s, 1);
			}
			*/
		}
		
		for(String s : completion) {
			pMap.put(s, pMap.get(s) - 1);
			
//			if(pMap.get(s) == 0)
//				pMap.remove(s);
		}
		
		for(String key : pMap.keySet()) {
			if(pMap.get(key) == 1) { //미완주자   (완주자들은 밸류가 0이다)
				return key;
			}
		}
		
		return null;
	}
	

}
