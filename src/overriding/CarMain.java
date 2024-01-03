package overriding;

public class CarMain {
    // 상속을 활용
    // 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.
    // 상속 덕분에 중복이 되는 코드를 줄어들고 편리하게 확장할 수 있게 되었다.
    public static void main(String[] args) {
        // 전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();         // 오버라이딩으로 재정의된 메서드로 호출한다.

        // 가솔린 차
        GasCar gasCar = new GasCar();
        gasCar.move();              // 부모에게 상속을 받은 메서드로 호출한다.
    }
}
