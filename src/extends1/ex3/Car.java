package extends1.ex3;

public class Car {
    // 자식 클래스들에게 물려 받는 기능들
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 기능 추가
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
