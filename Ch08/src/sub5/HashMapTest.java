package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 	날짜 : 2024.01.10
 * 	이름 : 김준형
 * 	내용 : Java HashMap 실습하기
 */
public class HashMapTest {
	public static void main(String[] args) {
		
		//Map 생성
		HashMap<Character, String> map = new HashMap<>();
		
		//데이터 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		//Map 크기
		System.out.println("map 크기 : " +map.size());
		
		//Map 데이터 추출
		System.out.println("map A값 : " +map.get('A'));
		System.out.println("map B값 : " +map.get('B'));
		System.out.println("map C값 : " +map.get('C'));
		
		//Map 반복문
		for(char k :map.keySet()) {
			
			System.out.println(k + " - " +map.get(k));
		}
		
		//List와 Map을 이용한 자료구조
		List<Map <Integer, Apple>> myList = new ArrayList<>();
		
		Map <Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 3000));
		m1.put(103, new Apple("일본", 3000));
		
		Map <Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 3000));
		m2.put(203, new Apple("호주", 3000));
		
		Map <Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 3000));
		m3.put(303, new Apple("인도", 3000));
		
		myList.add(m1);
		myList.add(m2);
		myList.add(m3);
		
		//한국사과
		Map<Integer, Apple> resultMap = myList.get(0);
		Apple apple1 = resultMap.get(101);
		apple1.show();
		
		//호주사과
		Map<Integer, Apple> resultMap2 = myList.get(1);
		Apple apple2 = resultMap2.get(203);
		apple2.show();

		//메서드 체인
		myList.get(1).get(203).show();
				
		
		//태국사과
		Map<Integer, Apple> resultMap3 = myList.get(2);
		Apple apple3 = resultMap3.get(302);
		apple3.show();
		
		myList.get(2).get(302).show();
		
		
	}
}
