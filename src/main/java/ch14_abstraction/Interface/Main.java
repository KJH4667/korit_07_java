package ch14_abstraction.Interface;

public class Main {
    public static void main(String[] args) {
// PowerButton powerButton = new PowerButton();
// ChannelDownButton channelDownButton = new ChannelDownButton();
// ChannelUpButton channelUpButton = new ChannelUpButton();
//
// TvRemoteController tvRemoteController = new TvRemoteController(powerButton, channelDownButton, channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(), new ChannelDownButton(), new ChannelUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        // #1에 대한 Main 에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        tvRemoteController.onUpChannelUpButton2();
    }

}
