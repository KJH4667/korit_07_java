package ch14_abstraction.Interface;

public class TemperatureUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println();
    }

    @Override
    public String onUp() {
        return "온도를 계속 " + super.onUp();
    }

    @Override
    public void onDown() {
        super.onDown();
    }
}


