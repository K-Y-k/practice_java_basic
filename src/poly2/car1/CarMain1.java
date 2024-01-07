package poly2.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();             // x001
        driver.setCar(k3Car);                  // 참조값이 null인 자동차를 x001인 k3로 적용
        driver.drive();

        // 차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car(); // x002
        driver.setCar(model3Car);              // 기존 참조값(x001)을 x002인 model3로 변경
        driver.drive();


        // 새로운 차량 변경
        NewCar newCar = new NewCar();          // x002
        driver.setCar(newCar);                 // 기존 참조값(x002)을 x003인 newCar로 변경
        driver.drive();
    }
}
