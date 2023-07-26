package com.algorithm.baekjoon;

import java.util.Map;
import java.util.HashMap;

public class ch14_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("A", 100);
        hm.put("B", 101);
        hm.put("C", 102);
        hm.put("C", 103); // 1. 이미 값이 있는 경우 값을 덮습니다.
        if(!hm.containsKey("D")){
            hm.put("D", 104); // 2. 값의 여부를 확인해 덮어쓰기를 방지합니다.
        }
        hm.putIfAbsent("D", 105);

        System.out.println(hm);
        System.out.println(hm.get("A"));
        System.out.println(hm.get("B"));
        System.out.println(hm.get("C"));
        System.out.println(hm.get("D"));


        System.out.println("========================================");


        Map<String, Integer> hm2 = new HashMap<>();
        hm2.put("key1", 1);
        hm2.put("key2", 2);
        hm2.putAll(hm); // 3. hm2 에 hm 의 모든 쌍을 추가해 합침.
        System.out.println(hm2);

        for(String key : hm2.keySet()){ // 4. keySet() 메소드를 이용해 Map에 있는 모든 키를 순회할 수 있다.
            System.out.println("(keySet) " + key + ":" + hm2.get(key));
        }
        hm2.forEach((key, value) -> { // 5. forEach() 메소드와 람다식을 활용해 모든 키, 값을 순회할 수 있습니다.
            System.out.println("(forEach) " + key + " : " + value);
        });


        System.out.println("========================================");


        // 객체키 : equals() 메소드 오버라이딩
        Person p1 = new Person("1", "111111-1111111");
        Person p2 = new Person("2", "222222-2222222");
        Person who = new Person("1", "111111-1111111");

        Map<Person, Integer> hm3 = new HashMap<>();
        hm3.put(p1, 0);
        hm3.put(p2, 1);

        System.out.println("Does map include " + who.getName() + "? => " + hm3.containsKey(who));

        hm3.put(who, 3);
        System.out.println(hm3);

    }
}

class Person{
    private String name;
    private String id;
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object o){ // Object 클래스는 최상위 객체이다.
        if(o instanceof Person){ // 동일한 Person 객체이며
            Person p = (Person) o; // Person 으로 형변환
            return this.id.equals(p.id) && this.name.equals(p.name); // 필드값이 같은 경우 동일한 객체로 간주한다.
        }
        return false; // 다른 클래스인 경우 false를 반환.
    } // => equals 오버라이딩으로 같은 객체임을 명시함에도 불구하고 해시맵에서 인식하지 못한다. => 어떻게 해야할까?

    // HashMap은 hashCode()를 비교하고 같은 경우 equals()를 수행한다.
    @Override
    public int hashCode(){
        return name.hashCode() + id.hashCode(); // id와 name으로 해시코드를 만들어 주어 id와 name이 동일한 경우 같은 해시 값을 반환하도록 한다.
    } // 따라서 반드시 같은 객체를 판단하는 equals를 재정의할 때 함께 hashCode도 재정의 해주어야 합니다.




}

