package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 자식 인스턴스를 생성하면서 부모 인스턴스도 같이 포함되어 생성된다.
        child.parentMethod();      // 자식은 부모 메서드 사용 가능
        child.childMethod();


        // 부모 변수가 자식 인스턴스를 참조할 수 있다.(= 다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();    // 부모 타입은 자식 타입을 참조할 수 있다.
                                      // 자식 타입을 생성했기에 메모리 상 자식, 부모 인스턴스가 모두 생성된다.
        //Child poly2 = new Parent(); // 단, 반대로 자식 타입이 부모 타입을 참조할 수 없다.

        poly.parentMethod();
        
        // 다형적 참조의 한계 -> 캐스팅으로 해결
        // poly.childMethod();         하지만 결국 부모 타입이므로 부모 타입에 먼저 접근하게 되어
        //                             자식의 필드와 메서드는 사용할 수 없다.
    }
}
