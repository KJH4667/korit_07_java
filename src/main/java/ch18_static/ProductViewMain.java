package ch18_static;



public class ProductViewMain {
    public static void main(String[] args) {
        //static 메서드의 호출은 객체를 생성하지 않은 시점에서도 가능합니다.
        // 객체 생성 전
//        System.out.println(Product.getTitle());
//        Product product1 = new Product();
//        product1.setName("아이스아메리카노");
//        System.out.println(product1.getName());
//        System.out.println(Product.getCount());

        System.out.println(Product.getCount());

        //이상의 코드느 ProductView.java 를 확인했을때 객체를 생성하는 method입니다. 생성자를 호출하지 않은 이유는 생성자가

        /*
        출력되었습니다. 그런데 그전에 static 배웠을때는 1, 2, 3, 4, 5번째 객체가
         */

    }
}
