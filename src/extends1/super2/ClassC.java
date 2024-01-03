package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // 부모 생성자가 직접 정의되어 있으면 관련 매개변수를 넣어줘야 하므로 super()를 생략할 수 없다
        super(10, 20);  // ClassB에는 기본 생성자가 아닌 직접 정의한 생성자로 만들었기에 생략할 수 없다.
                              // ClassB(int a)와 ClassB(int a, int b)중 선택해야 한다.
        System.out.println("ClassC 생성자");
    }
}
