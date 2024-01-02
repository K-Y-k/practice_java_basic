package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {   // static 메서드 : static이 붙은 정적 변수나 정적 메서드마 사용 가능하다.
        staticValue++;       // 정적 변수 접근 가능
        staticMethod();      // 정적 메서드 접근 가능

//        instanceValue++;   // 인스턴스 변수 접근 불가능
//        instanceMethod();  // 인스턴스 메서드 접근 불가능
    }
    public static void staticCall(DecoData data) { // 단, 외부에서 넘겨온 인스턴를 생성한 객체가 매개변수이면
        data.instanceValue++;                      // 해당 인스턴스의 변수 사용 가능
        data.instanceMethod();
    }

    public void instanceCall() {      // 인스턴스 메서드 : 인스턴스, static 변수 메서드 모두 사용 가능
        instanceValue++;    // 인스턴스 변수 접근 가능
        instanceMethod();   // 인스턴스 메서드 접근 가능

        staticValue++;      // 정적 변수 접근 가능
        staticMethod();     // 정적 메서드 접근 가능
    }


    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
