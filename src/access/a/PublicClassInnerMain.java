package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // PublicClass는 public이라서 다른 클래스에서도 호출 가능
        PublicClass publicClass = new PublicClass();

        // DefaultClass1와 DefaultClass2는 같은 패키지 안이므로 호출 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
