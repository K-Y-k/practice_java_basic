package construct;

public class MemberThis {
    String nameField;

    // 멤버 변수와 메서드의 매개변수 이름이 다르면 this 생략 가능
    void initMember(String  nameParameter) {
        nameField = nameParameter;
    }
}
