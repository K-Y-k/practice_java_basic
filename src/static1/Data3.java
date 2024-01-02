package static1;

public class Data3 {
    // static을 사용함으로써
    // 관련있는 클래스 내부에 넣어서 사용가능해졌다.

    public String name;
    public static int count;   // 특정 클래스에서 공용으로 함께 사용할 변수에 static 키워드로 선언
                               // static이 붙은 멤버 변수는 인스턴스 영역에 생성되지 않는다!
                               // 힙 영역이 아닌 메서드 영역의 static 영역에서 관리하기 때문이다.
    public Data3(String name) {
        this.name = name;
        count++;               // 객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다.
    }
}
