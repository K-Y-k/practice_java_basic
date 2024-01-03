package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        member.changeData("myId2", "seo"); // 실수로 매개변수에 아이디를 넣었지만 메인 로직에는 변경을 안했기에
        member.print();                             // 이상없이 고정
    }
}
