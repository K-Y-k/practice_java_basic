package static2;

import static static2.DecoData.*;   // 자주 사용하는 static 메서드의 클래스일 경우 import하여

public class DecoDataMain {
    public static void main(String[] args) {  // 정적 메서드의 대표적인 main() 메서드
        System.out.println("1. 정적 호출 방식");
        staticCall();               // 클래스명. 으로 접근하여 정적 메서드 호출
        staticCall();               // import 덕분에 클래스명을 생략할 수 있게 되었다.
        staticCall();
        staticCall();


        System.out.println("2. 인스턴스 호출 방식");
        DecoData data1 = new DecoData(); // 인스턴스를 생성 후
        data1.instanceCall();            // 인스턴스 메서드 호출

        System.out.println("3. 정적 메서드의 인스턴스 객체를 매개변수로 넘겨 호출한 방식");
        DecoData data2 = new DecoData(); // 인스턴스를 생성 후
        data2.instanceCall();
        staticCall(data2);               // 생성한 인스턴스를 매개변수로 넣어 호출


        // 인스턴스를 통한 접근, 권장 안함
        DecoData data3 = new DecoData();
        data3.staticCall();             // static 메서드를 인스턴스를 생성해서 접근하는 것은 불필요

        // 클래스를 통한 접근
        staticCall();                   // 클래스명. 으로 바로 접근
    }
}
