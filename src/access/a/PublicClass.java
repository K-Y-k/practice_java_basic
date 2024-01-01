package access.a;


/**
 * 클래스 레벨
 * - 클래스 레벨의 접근 제어자는 public과 default만 가능하다.
 * - public일 경우 파일명과 클래스명이 반드시 같아야한다.
 * - 하나의 자바 파일에 public 클래스는 하나만 가능하다.
 */
// 하나의 자바 파일에 public 클래스는 하나만 가능하다.
public class PublicClass { // public일 경우 파일명과 클래스명이 반드시 같아야한다.
    public static void main(String[] args) {
        // PublicClass는 public이라서 다른 클래스에서도 호출 가능
        PublicClass publicClass = new PublicClass();

        // DefaultClass1와 DefaultClass2는 같은 패키지 안이므로 호출 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// 하나의 자바 파일에 default 클래스는 무한정 만들 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}
