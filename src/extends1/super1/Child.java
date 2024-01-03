package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child hello");
    }

    public void call() {
        // this는 현재 자신 클래스
        // this는 생략 가능하다. (보통 다른 매개변수명과 동일할 때 구분하려고 사용)
        System.out.println("this.value = " + this.value); 
        
        // super는 부모 클래스
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();


        // 클래스 필드는 private로 캡슐화되어 super.필드명으로 직접 접근을 하지 못한다.
        // 그러므로 super.부모메서드명()으로 접근해서 부모만 있는 필드를 사용할 수 있다.
        System.out.println("super.name = " + super.getName());
    }
}
