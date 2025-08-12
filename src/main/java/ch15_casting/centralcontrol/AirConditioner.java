package ch15_casting.centralcontrol;

public class AirConditioner implements Power {

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    //downcasting 에 앞서서 고유 메서드들 하나씩 정의하겠습니다.
    public void changeMode() {
        System.out.println("에어컨의 전원을 켭니다 ");
    }
}
