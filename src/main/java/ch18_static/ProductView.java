package ch18_static;

public class ProductView {
    //정적 변수 선언
    // 보통 싱글톤 패턴 만들때 정적 변수 이름이 instance입니다 -> 이게 사형 시 힌트 중 하나였습니다.
    private static ProductView instance; // ProtectView 클래스의 정적 field인 instance
    private static int count = 1;

    // private으로 생성자를 선언    -> 객체가 하나만 생성되는걸 보장하기 위한 접근지정자 이므로 매우 중요함.
    private ProductView() {
        int counter = 1;
        System.out.println(counter + "번째 객체가 생성되었습니다.");
        counter++;
    }

    public static ProductView getInstance() {
        if(instance == null) {  //현재 인스턴스가 없는 사정이라면 22번 코드라인이 true이므로
            instance = new ProductView();   // ProductView() 생성자를 호출하여 instance에 대입함.
        }
        return instance;        // 이미 생성되었으면 바로 여기라인이 실행됨.
    }
}
