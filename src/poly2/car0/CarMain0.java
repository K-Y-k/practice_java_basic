package poly2.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();           // 운전자 생성
        K3Car k3Car = new K3Car();              // 차 생성

        driver.setK3Car(k3Car);                 // 운전자 필드에 차 객체의 참조값을 넣고
        driver.drive();                         // 운전자의 운전 기능에 차 객체의 기능을 넣은 것을 실행

        // 차종 추가할 경우
        Model3Car model3Car = new Model3Car();  // 추가 차량 객체 생성 후
        driver.setK3Car(null);                  // 기존 차량 참조값을 null로 해주고
        driver.setModel3Car(model3Car);         // 새로 추가할 차량의 참조값을 넣어준다.
        driver.drive();


        System.out.println();
        // 운전자만 생성한 경우
        Driver driver2 = new Driver();
        driver2.drive();                       // 차 객체가 주입되지 않아 정상적으로 실행 안됨
    }
}
