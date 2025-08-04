package ch11_access_modifier;

public class Person {
    private String name;

    public String getName() {
        return name;
    }
    public Person(String name) {
        this.name = name;
    }
}

/*
setter / getter는 default로 access modifier가 public 이므로 클래스 외부에서 사용 가능합니다.

저희느 현재 객체 생성까지 완료한 상황인데, setter / getter를 활용하여 처음 이름을 "김일"로 입력하고, 그 이름을 콘솔에 출력
다시 이름을 "이일"로 수정하고, 바뀐이름을 콘솔에 출력하시오.

 */
