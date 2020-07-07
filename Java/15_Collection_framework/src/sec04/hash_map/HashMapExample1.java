package io.wisoft.java_seminar.chap15.sec04.hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

  public static void main(String[] args) {
    // Map 컬렉션 생성
    Map<String, Integer> map = new HashMap<String, Integer>();

    // 객체 저장
    map.put("김승빈", 85);
    map.put("홍길동", 90);
    map.put("박혜원", 80);
    // 기존 "홍길동"키가 같기 때문에 제일 마지막에 저장한 값으로 대치
    map.put("홍길동", 95);
    System.out.println("총 Entry 수: " + map.size());

    // 객체 찾기
    System.out.println("\t홍길동 : " + map.get("홍길동"));
    System.out.println();
    
    // 객체를 하나씩 처리
    Set<String> keySet = map.keySet(); // key Set 얻기
    Iterator<String> keyIterator = keySet.iterator();
    while (keyIterator.hasNext()) {
      String key = keyIterator.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

    // 객체 삭제
    map.remove("홍길동"); // 키로 Map.Entry 제거
    System.out.println("총 Entry 수: " + map.size());

    // 객체를 하나씩 처리
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
    Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

    while (entryIterator.hasNext()) {
      Map.Entry<String, Integer> entry = entryIterator.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

    // 객체 전체 삭제
    map.clear(); // 모든 Map.Entry 삭제
    System.out.println("총 Entry 수: " + map.size());
 }

}
