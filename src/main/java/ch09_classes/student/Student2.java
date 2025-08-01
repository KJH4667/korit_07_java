package ch09_classes.student;

public class Student2 {
    int studentCode;
    String name;
    double score;
    // default로 생성됐을 때는 안내문구를 쓸 수 없네요
    //  "기본 생성자로 객체를 생성했습니다."

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    //좌상단 햄버거(메뉴바) -> 코드(Code) -> 생성(Generate)
    // alt + ins
    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }
    // 자동완성으로 알아서 생성자 만드시고, 거기에 sout 문구 전부다 집어 넣으시오.
    public Student2(String name) {
        System.out.println("매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        System.out.println("매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}



//#생성자 관련 정리 (롬복)
//1. NoArgsConstructor - 기본생성자
//2. RequiredArgsConstructor - 매개변수 생성자
//3. AllArgsConstructor - 클래스의 전체 필드를 전부 요구하느 매개변수 생성자

//method 구현 관련 정리 / 클래스 개념 - 구성 요소 / 생성자 관련 부분을 정리하시면 되겠습니다.


//# 다음주 월요일 수업 계획
//1. 클래스 / 생성자 관련 복습
//2. getter / setter
//3. access modifier(접근제어자)
//4. 진짜 빨리 나가면 배열
//
//8월 24일까지 카페 가입 및 이력서 초안 작성
//8월 3 ~ 4일 정보처리(산업)기사 빈자리 신청
//
//17:40 github push 및 자리 정리
//
//ch09_classes -> products
//Product / ProductMain 클래스 생성
//
//Product.java에 여러 가지 생성자를 정의하세요.
//        필드는
//
//int productNum;
//String productName;
//
//메서드
//
//showInfo() -> productNum과 productName 정보가 콘솔에 출력되도록 작성
//
//필드가 두개 이기 때문에 생성자가 만들어질 경우의 수는 네 가지
//
// 1. 기본 생성자를 사용하여 객체를 생성하세요 product1
//productNum 123456
//productName LG엘패드
// 2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
//객체를 생성하시오. product2
//productNum 9876564
//productName 다이소충전기
//
// 3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해
//객체를 생성하시오 product3
//productNum 159357
//productName USB-C 케이블
//
// 4. AllArgsConsrtuctor를 이용하여 객체 생성하시오. product4
//productNum 951753
//productName GFlip6
//
// 5. 정보를 출력하는 showInfo()(call1타입으로 정의할것)의 콘솔창 결과는
//다음과 같습니다.
//
//실행 예
//시리얼 넘버 : 951753
//제품 타이틀 : GFlip6
