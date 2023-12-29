package ref;

public class MethodChange1 {
    // 기본형에서의 메서드 호출
    public static void main(String[] args) {
        int a = 10;

        System.out.println("메서드 호출 전: a = " + a); // 10
        changePrimitive(a); // 매개변수에 a의 값을 복사해서 대입해준 것일 뿐이기에
        System.out.println("메서드 호출 후: a = " + a); // 10, a변수의 값은 그대로이다.

    }

    public static void changePrimitive(int x) {
        x = 20;            // a 변수와 다른 변수이기에 둘이 관계가 없다!
    }
}
