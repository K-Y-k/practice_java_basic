package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        //super(); 부모 ClassA 클래스는 기본 생성자라서 생략 가능
        this(a, 0); // 만약 같은 클래스의 매개변수가 다른 생성자를 안에서 호출해도
                       // 결국 마지막 하나는 super()로 부모 생성자 호출이 연결되어 있게 만들어야한다.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 부모 ClassA 클래스는 기본 생성자라서 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
