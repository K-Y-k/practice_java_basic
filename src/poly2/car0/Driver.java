package poly2.car0;

/**
 * 역할과 구현을 분리하는 다형성을 활용하지 않은
 * 운전자와 자동차의 관계에서의 예시
 *
 * 새로운 차 종류가 추가될수록 점점 변경해야 하는 코드가 많아진다.
 * 역할과 구현을 구분하지 않았기 때문이다!
 */
public class Driver {
    private K3Car k3Car;                 // 초깃값 자동 null
    private Model3Car model3Car;         // 차종이 추가될 때마다 필드와

    public void setK3Car(K3Car k3Car) {  // 생성된 차 참조값 주입
        System.out.println("K3Car 자동차를 설정합니다: " + k3Car);
        this.k3Car = k3Car;
    }
    public void setModel3Car(Model3Car model3Car) { // 참조값 설정 메서드를 작성해야 한다.
        System.out.println("Model3Car 자동차를 설정합니다: " + model3Car);
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");

        // 차가 주입된 경우 실행됨
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
