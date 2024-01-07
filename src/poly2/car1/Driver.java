package poly2.car1;

/**
 * 역할과 구현을 적용한 덕분에
 * 새로운 차량이 추가되어도 변경이 없다.
 * OCP(개방폐쇄의 원칙)을 지킨다.
 *
 * - OCP(개방폐쇄의 원칙)
 * : 확장에는 열려있고 코드 수정은 닫혀 있다는 의미
 *   자동차를 추가하는 부분은 수정하지만
 *   운전자(클라이언트)는 수정하지 않는다.
 *   = 전략 패턴 (디자인 패턴중 가장 중요한 패턴)
 *      : 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다.
 *        Car 인터페이스가 전략을 정의하는 인터페이스가 되고
 *        각각의 차종이 전략의 구체적인 구현이 된다.
 */
public class Driver {
    private Car car; // 차 종류가 궁금하지 않고 역할만 지정

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        
        // 오버라이딩한 자식 메서드를 통한 메서드 호출
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
