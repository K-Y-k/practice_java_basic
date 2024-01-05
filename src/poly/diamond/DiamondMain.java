package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child(); // Child 클래스와 InterfaceA 인스턴스가 포함되어 생성된다.
        a.methodA();                // InterfaceA의 메서드를 구현한 Child 클래스의 메서드가 호출
        a.methodCommon();

        InterfaceB b = new Child(); // Child 클래스와 InterfaceB 인스턴스가 포함되어 생성된다.
        b.methodB();                // InterfaceB의 메서드를 구현한 Child 클래스의 메서드가 호출
        b.methodCommon();

        Child child = new Child();  // Child 클래스와 상속된 부모들인 InterfaceA, InterfaceB 인스턴스가 포함되어 생성된다.
        child.methodA();            // InterfaceA의 메서드를 구현한 Child 클래스의 메서드가 호출
        child.methodB();            // InterfaceB의 메서드를 구현한 Child 클래스의 메서드가 호출
        child.methodCommon();       // InterfaceA, InterfaceB의 메서드를 구현한 Child 클래스의 메서드가 호출
    }
}
