package poly.overriding;

public class Child extends Parent{
    public String value = "child";

    // 오버라이딩으로 재정의
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
