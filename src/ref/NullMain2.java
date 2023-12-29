package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;  // 참조값이 null이라서
        data.value = 10;   // 접근할 참조값이 없어서 NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
