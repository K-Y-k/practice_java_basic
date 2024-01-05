package poly.ex3;

public abstract class Animal { // 추상 메서드가 하나라도 있으므로 추상 클래스로 선언
                                       // 즉, 본인 인스턴스를 직접 생성할 수 없게 되었다.
    // 자식이 기능을 상속 받아 사용하도록 만든 기능
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    // 반드시 자식이 오버라이딩 해야하는 목적으로 만든 추상 메서드
    public abstract void sound();
}
