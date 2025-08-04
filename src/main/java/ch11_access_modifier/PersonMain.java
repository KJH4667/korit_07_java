package ch11_access_modifier;

import ch10_getter_setter.Person;

public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
        //person1.name = "김일";      이제는 불가능 합니다
        // System.out.println(person1.name);    마찬가지로 불가능 -? 왜? private

        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("김이");
        System.out.println(person1.getName());
    }
}
