package construct;

public class MethodInitMain3 {
    // 절차 지향의 메서드에서
    // 클래스 내부에 생성자를 추가한 객체 지향 방식으로 변경
    public static void main(String[] args) {
        // 객체 생성
        MemberInit member1 = new MemberInit(); 
        // 객체 내부 인스턴스의 필드 초깃값 설정
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);


        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
