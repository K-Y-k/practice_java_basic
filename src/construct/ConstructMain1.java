package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 객체 클래스 내부에 생성자를 만들었으므로, 초깃값을 여기에 넣어준다.
        // 즉, 코드는 한 줄이지만 1.객체를 메모리에 생성 2.생성자를 호출하여 초깃값을 지정한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);


        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
