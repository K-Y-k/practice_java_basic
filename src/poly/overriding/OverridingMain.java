package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식타입 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();

        // 부모타입 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();
        
        
        // 부모타입 변수가 부모 + 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("poly.value = " + poly.value);  // 변수가 부모타입이기라서 부모타입으로 먼저 접근하기에 부모타입의 필드가 나온다.

        // 원래 변수의 타입을 기준으로 접근하는데 결국 오버라이딩 된 자식의 메서드가 나왔다.
        // 다형성의 2번째 핵심이다!
        // -> 선언 된 변수가 부모타입이어도 오버라이딩 된 자식 메서드를 항상 우선권을 가진다!
        poly.method();
    }
}
