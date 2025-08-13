package ch18_static;

public class ProtectView {
//   //정적 변수 선언
//    private static singleton.products.ProtectView instance; // ProtectView 클래스의 정적 field인 instance
//
//    // private으로 생성자를 선언
//    private ProtectView() {
//        int counter = 1;
//        System.out.println(counter + "번째 객체가 생성되었습니다.");
//        counter++;
//    }
//
//    public static ProductView getInstance() {
//        if(instance == null) {
//            instance = new ProductView();
//        }
//        return instance;
//    }
//}


    // 정적 변수 선언 (클래스 내부에서 자신의 유일한 인스턴스를 저장)
    private static ProtectView instance;

    // 객체 생성 횟수 확인용 정적 변수
    private static int counter = 1;

    // private 생성자: 외부에서 직접 객체 생성 불가능
    private ProtectView() {
        System.out.println(counter + "번째 객체가 생성되었습니다.");
        counter++;
    }

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static ProtectView getInstance() {
        if (instance == null) {
            instance = new ProtectView();
        }
        return instance;
    }
} // 챗GPT로 수정한것임.