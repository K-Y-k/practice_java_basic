package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // PublicClass는 public이라서 다른 클래스에서도 호출 가능
        PublicClass publicClass = new PublicClass();

        // DefaultClass1와 DefaultClass2는 다른 패키지의 클래스라서 호출 불가
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
