package poly.ex4;

public abstract class AbstractAnimal { // 추상 메서드가 하나라도 있으므로 추상 클래스로 선언
                                       // 즉, 본인 인스턴스를 직접 생성할 수 없게 되었다.
    // 이 클래스는 추상 메서드만 있어 순수 추상 클래스다.
    // 즉, 실행 로직의 메서드가 없고
    // 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.

    // 즉, 순수 추상 클래스는 물려받아서 사용하는 상속의 특징을 제공하는 것이 아닌
    // 다형성을 위해서 사용한다.
    
    // 반드시 자식이 오버라이딩 해야하는 목적으로 만든 추상 메서드
    public abstract void sound();
    public abstract void move();
}
