package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        // 객체는 생성될 때마다 새로운 인스턴스로 생성되기에
        // count 필드값이 공유하는 것이 아닌 각각의 count 필드로 초기화되어
        // 값이 모두 1이 된 것이다.
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);   // 1

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);   // 1

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);   // 1
    }
}
