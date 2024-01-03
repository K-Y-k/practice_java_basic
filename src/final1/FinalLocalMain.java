package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10;           // 최초 1번만 할당 가능하다.
//        data1 = 20;         // 이후 할당은 컴파일 오류


        // final 지역 변수2
        final int data2 = 10; // 최초 1번만 할당 가능하다.
//        data2 = 20;         // 이후 할당은 컴파일 오류
    }

    static void method(final int parameter) { // 매개변수에 1번 할당되었기에
//        parameter = 20;                     // 이후 할당 불가능
    }
}
