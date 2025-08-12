package ch18_static;

public class ProtectView {
   //정적 변수 선언
    private static singleton.products.ProtectView instance; // ProtectView 클래스의 정적 field인 instance

    // private으로 생성자를 선언
    private ProtectView() {
        int counter = 1;
        System.out.println(counter + "번째 객체가 생성되었습니다.");
        counter++;
    }

    public static ProductView getInstance() {
        if(instance == null) {
            instance = new ProductView();
        }
        return instance;
    }
}
