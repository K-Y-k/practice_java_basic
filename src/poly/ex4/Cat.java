package poly.ex4;

public class Cat extends AbstractAnimal {
    // 추상 클래스에 상속받은 추상 메서드는 강제적으로 구현되게 만듬
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
