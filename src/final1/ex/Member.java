package final1.ex;

public class Member {
                             // 아이디는 절대 변경되지 않는 규정을 정했다면
    private final String id; // 아이디를 fianl 키워드를 사용하여 고정
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id;     // 실수로 아이디를 변경하려할 때 컴파일 오류로 알려줌!
        this.name = name;
    }

    public void print() {
        System.out.println("id = " + id + ", name = " + name);
    }
}
