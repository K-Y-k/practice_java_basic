package overriding;

public class ElectricCar extends Car {

    // 오버라이딩
    // 부모에게서 상속 받은 메서드를 자식 클래스에서 같은 이름으로 재정의하는 것

    // 오버라이딩의 조건
    // - 메서드 이름 같아야 한다.
    // - 메서드 파라미터의 타입, 순서, 개수 같아야 한다.
    // - 반환 타입 같아야 한다.
    // - 접근 제어자가 부모 클래스의 메서드보다 더 제한적이면 안된다.
    // - 부모 클래스의 메서드에 static, final, private가 붙은 것은 오버라이딩할 수 없다.
    // - 부모 클래스의 메서드보다 더 예외를 throws로 선언할 수 없다.
    // - 생성자는 오버라이딩할 수 없다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
