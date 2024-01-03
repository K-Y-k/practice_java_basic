package extends1.ex1;

public class CarMain {
    // 전기차와 가솔린 차는 자동차의 좀 더 구체적인 개념이다.
    // 그렇기에 공통되는 기능이 보인다. ex) move() 이동 기능
    // 이런 경우 상속 관계를 사용하는 것이 효과적이다.
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        // 가솔린 차
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
