package ch14_abstraction.Interface;
/*
    PowerButton 포함시킬 것
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한번 누를 때 마다 모드가 변횐더어야겠네요.
    냉방 <-> 난방
     : press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동해야함.
     (PowerButon의 로직을 활용하여 메서드 작성하면 됩니다)

     AllArgsConstructor를 정의하고,

     실행 예
     에어컨 리모컨 객체가 생성되었습니다
     전원을 켭니다.
     온도를 계속 내립니다.
     온도를 한칸 올립니다
     온도를 계속 올립니다
     난방으로 바뀝니다.
     냉방으로 바뀝니다.
     전원을 끕니다.
 */

public class AirConditionerController {
    private ModeChangeButton modeChangeButton;
    private TemperatureUpButton temperatureUpButton;
    private TemperatureDownButton temperatureDownButton;



}
