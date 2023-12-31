package construct;

public class MemberInit {
    String name;
    int age;
    int grade;
    
    
    // 기본 생성자 : 매개변수가 없는 생성자
    //             단, 직접 만든 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    //             여기는 직접 만든 생성자가 없어 자바가 자동으로 기본 생성자를 만들어준다.
    public MemberInit() {
    }

    // MethodInitMain2에서의 메서드로 해결한 것을 
    // 객체 지향을 활용한 관련 클래스 내부에서 선언하여 사용하기
    void initMember(String name, int age, int grade) {
        this.name = name;   // 여기서 this는 멤버 변수와 메서드의 매개변수 이름이 같아질 때 구분하기 위한 것으로
        this.age = age;     // 현재 인스턴스인 MemberInit 자신의 참조값을 가져오는 것이다.
        this.grade = grade;
    }
}
