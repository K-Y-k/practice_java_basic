package extends1.ex2;

public class CarMain {
    // 상속을 활용
    // 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();   // 상속을 받은 메서드라 사용가능
        electricCar.charge();

        // 가솔린 차
        GasCar gasCar = new GasCar();
        gasCar.move();       // 상속을 받은 메서드라 사용가능
        gasCar.fillUp();
    }
}
