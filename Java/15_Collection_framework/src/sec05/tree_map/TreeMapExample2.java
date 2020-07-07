package io.wisoft.java_seminar.chap15.sec05.tree_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();
    scores.put(new Integer(87), "홍길동");
    scores.put(new Integer(98), "김승빈");
    scores.put(new Integer(75), "김자바");
    scores.put(new Integer(95), "박혜원");
    scores.put(new Integer(80), "박자바");

    NavigableMap<Integer, String> descendingMap = scores.descendingMap();
    Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
    for (Map.Entry<Integer, String> entry : descendingEntrySet) {
      System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
    }
    System.out.println();

    NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
    Set<Map.Entry<Integer, String>> ascendingEntrySet = descendingMap.entrySet();
    for (Map.Entry<Integer, String> entry : descendingEntrySet) {
      System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
    }
  }

}
