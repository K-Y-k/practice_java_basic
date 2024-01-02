package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // static을 활용한 방식
        // 클래스에 직접 접근하는 방식이 된다. -> Data3.count
        // 이 static이 붙은 멤버 변수는 힙 영역이 아닌 메서드 영역의 static 영역에서 관리한다.
        // 즉, static이 붙은 멤버 변수는 인스턴스 영역에 생성되지 않는다!

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // 1

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); // 2

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count); // 3



        // 인스턴스를 통한 접근, 권장 안함
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);     // 접근은 가능하지만 실제로는 결국 static영역으로 연결해서 접근하는 것
                                             // 개발자들이 코드를 확인할 때 인스턴스 변수로 오해할 수 있어 가독성이 좋지 않다.
        
        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
