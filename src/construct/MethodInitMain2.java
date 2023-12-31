package construct;

public class MethodInitMain2 {
    // 객체 필드 초깃값 설정이 반복되는 문제를 메서드로 해결
    public static void main(String[] args) {
        // 객체 생성
        MemberInit member1 = new MemberInit(); 
        // 객체 필드 초깃값 설정
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);


        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    // 초깃값 설정 메서드
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
