package ref;

public class NullMain4 {
    // NullMain3에서의 NPE 해결법
    // Data를 생성하여 참조 값을 지정해주게 만든다.
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        bigData.data = new Data();       // Data를 생성하여 참조 값을 지정해주게 만든다. x002
        System.out.println("bigData.data = " + bigData.data);   // x002
        System.out.println("bigData.count = " + bigData.count); // 0

        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
