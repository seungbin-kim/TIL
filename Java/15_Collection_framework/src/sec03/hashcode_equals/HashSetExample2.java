package io.wisoft.java_seminar.chap15.sec03.hashcode_equals;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

  public static void main(String[] args) {
    Set<Member> set = new HashSet<>();

    // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장됨
    set.add(new Member("홍길동", 30));
    set.add(new Member("홍길동", 30));

    System.out.println("총 객체수 : " + set.size());
  }

}
