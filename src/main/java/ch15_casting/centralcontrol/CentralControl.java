package ch15_casting.centralcontrol;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;
    private Power device;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 매서드 정의하겠습니다.
    public void addDevice(Power A) {
        //지금 우리는 Power의 자식 클래스에 해당하는 인스턴스들을 deviceArray 라는 필드에 추가하고 싶습니다. 그러면 CentralControlMain에서 객체 생성을 할 대
        // deviceArray의 최종 indexNumber는 고정되게 되는데, 다 들어차있는 배열에 덮어쓰기가 일어나서도 안되고 (즉 기존 element를 삭제하면 안됨) 비어있는 element에 device
        //추가를 할 수 있어야 합니다. 그렇다면 필요한 기능이 배열 내에 null 값이 존재하는지에 대한 체크가 필요하다고 할 수 있습니다.
        int emptyIndex = checkEmpty(); // method의 결과값을 변수 emptyIndex에 대입
        if (emptyIndex == -1) {
            System.out.println("더이상 장치를 연결할수 없습니다.");
            return;     // 매서드 종료 키워드
        }

        deviceArray[emptyIndex] = device; // private으로 적용해놔서 method를 경유했습니다.
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었씁니다.");
        /*
            .getClass() -> 클래스명을 return하는 method + 패키지 경로 포함
            .getClass().getSimpleName() -> 클래스명만 출력됨.
            현재 보시면 method의 결과값을 가지고 다시 . 찍어서 그 다음 method를 호출했습니다. 이상의 개념을 chaining method라고 해서 return값의 유형을 명확하게 알고 있어야
            그 다음 어떤 method를 실행시킬 것인지를 알 수 있습니다.
         */
    }

    private int checkEmpty() {
        // 메서드인데 private 썼습니다. Main에서 굳이 몇 개나 더 전자제품을 추가할 수 있는지 알 필요가 없을 것 같아서요...
        //deviceArray라는 배열에서 비어있는 index를 추출해주기만 하면 되네요.
        // i++니까 가장 빨리 만나게 되는 null값을 return하게 될겁니다.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;       // 즉 배열 내부에  element가 없다면 그 주소지를 return
            }
        }
        return -1;
        /*
            Java의 index 넘버에는 음수값이 없기 때문에(python에서는 마이너스인덱스 개념이 있는데 얘도 시험에 자주 나옵니다.) 실패를 나타낼때 -1을 쓰는 경우가 많습니다.
            하지만 0과 너무 가까운 수이다 보니 -100이든지, 아니면 return값으로 나올 수 없을만한 음수값을 지정하는 경우도 있는데, 나중에 위에 있는 addDevice() 메서드에서 if(checkEmpty()
            == -89234)로 쓰고 싶지 않으면
         */
    }

    public void powerOn() {
        /*
            해당 클래스의 필드인 Power[] 배열 내에 있는 객체들은 기본적으로 Power의 서브 클래스의 객체들입니다. 즉, on() / off() method를 공통적으로 지니고 있습니다.
            그리고 Power 자료형으로 업캐스팅도 되어있습니다.
         */
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 켜지 않습니다.");
                continue; // break;는 반복문을 즉시 종료하고, return;은 method를 현재 반복만 종료하고 그 다음 반복문으로 넘어갑니다.
                // 즉 deviceArray[3] 주소지에 객체가 없어 null이 있다면 67번 라인의 조건문이 실행될탠데 "장치가 없어 전원을 켜지않았습니다"가 출력되고
                // 곧장 deviceArray[4]를 확인하게 됩니다.
            }
            deviceArray[i].on();

        }
        /*
       현재 배열 내에 각 객체들이 들어가있습니다. 객체명. getClass(), getSimpleName()을 활용하면 클래스 네임만 출력된다는 것을 확인할 수 있는데,
       deviceArray를 반복 돌려서 몇번 인덱스에 어떤 클래스의 객체가 있는지 표시하는 showInfo 메서드를 정의하시오.
       실행 예
       슬롯 [1]번 : Computer
       슬롯 [2]번 : LED
       ...
       슬롯 [10]번 : Empty
         */


    }

    public void showInfo() {
 for ( int i = 0; i < deviceArray.length; i++ ) {
     if(deviceArray[i] == null) {
         System.out.println("슬롯 [" + (i+1)+);
     }
 }
 //이제 배열 내부를 돌면서 각 element들의 고유 메서드들을 실행시켜 볼겁니다. 논리적으로는 말이 안됩니다.


    }
    public void performSpecificMethod() {
        if(device instanceof AirConditioner) {
            AirConditioner airConditioner = (AirConditioner)device; // 명시적 다운캐스팅
            airConditioner.changeMode();
        } else if (device instanceof Computer) {
            Computer computer = (Computer) device;
            computer.computer();
        } else if (device instanceof LED ) {
            LED led = (LED)device;
            led.changeColor();
        } else if (device instanceof Mouse ) {
            Mouse mouse = (Mouse) device;
            mouse.leftClick();
        } else if(device instanceof Speaker) {
            Speaker speaker = (Speaker) device;
            speaker.changeEqual();
        } else if (device instanceof Printer) {

        } else if (device == null) {
            System.out.println("장치가 비어있습니다.");
        } else {        // 아직 instanceof 연산자를 통해서 조건문을 추가힞 못한 class 및 추후 update를 통해서 다른 기기들을 지원할 때는 } else 사이에 else if 문을 추가하며 됨.
            System.out.println("실행할 수 없습니다.");
        }
    }
}


// 이상의 수업 과정들을 전부 거쳤을때, Printer 클래스를 정의하고 Power interface를 implement하고 고유 메서드로 print() -> "프린터가 인쇄를 합니다"로 출력될 수 있도록 정의하고,
// Main에서 printer1을 centralControl에 추가, on() / off()를 실행한 후에 print() 메서드도 centralControl을 통해 실행하시오.


