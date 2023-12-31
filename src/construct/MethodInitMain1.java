package construct;

public class MethodInitMain1 {
    // 객체 필드 초깃값 설정이 반복되는 문제
    public static void main(String[] args) {
        // 객체 생성
        MemberInit member1 = new MemberInit(); 
        // 객체 필드 초깃값 설정
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
