package poly.ex4;

public class Caw extends AbstractAnimal {
    // 추상 클래스에 상속받은 추상 메서드는 강제적으로 구현되게 만듬
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
