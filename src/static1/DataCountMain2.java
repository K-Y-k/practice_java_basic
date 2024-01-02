package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        // 그래서 따로 공통으로 카운팅할 다른 외부 클래스 전용으로 만들고 카운팅을 적용했다.
        // 불편한 점
        // 1.Data2 클래스가 몇개 생성된 것인지 확인하는 것인데 외부의 클래스를 별도로 만드는 불편함
        // 2.생성자 호출할 때의 외부 클래스인 매개변수가 추가되는 복잡함
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);  // 1

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);  // 2

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);  //3
    }
}
