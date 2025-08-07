package ch14_abstraction.Interface;
/*
    클래스는 단일 상속만 가능합니다. 그 키워드는 -> extends
    인터페이스는 다중 상속이 가능합니다. 그 키워드는 -> implements
 */

public abstract class Button implements Press, Up, Down {
    @Override
    public abstract void onPressed();



    @Override
    public String onUp() {
return "올립니다";
    };


    @Override
    public void onDown() {

    };
}
