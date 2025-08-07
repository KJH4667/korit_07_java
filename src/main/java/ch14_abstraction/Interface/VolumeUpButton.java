package ch14_abstraction.Interface;

public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println(" 볼륨을 한칸 올립니다. ");
    }

//    @Override
//    public void onDown() {
//        super.onDown();
//    }

    @Override
    public String onUp() {
        return "볼륨을 계속" + super.onUp();
    }
}
