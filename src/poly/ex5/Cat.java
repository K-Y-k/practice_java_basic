package poly.ex5;

public class Cat implements InterfaceAnimal { // 인터페이스는 implements로 상속 받는다.
    @Override
    public void sound() {
        System.out.println("야용");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
