package pack.a;

public class User {
    public User() { // public 접근 제어자는 다른 패키지에서 이 클래스를 호출하려면 필요하다.
        System.out.println("패키지 pack.a의 User 클래스 회원 객체 생성");
    }
}
