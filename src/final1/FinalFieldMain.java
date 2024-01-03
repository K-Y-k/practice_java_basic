package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        // 생성자 호출을 통해 value 필드 값을 초기화한 것
        // 생성자 호출은 초깃값을 1번 능동적으로 초기화하는 것에 의미가 있다.
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);      // 10
        System.out.println(constructInit2.value);      // 10

        // final 필드 - 필드 초기화
        // 각 인스턴스에 고정된 value 필드 값이 들어간 것
        // 필드 초기화는 처음부터 고정된 값으로만 초기화되어
        // 모든 인스턴스가 같은 값을 사용하기에 중복이라 메모리 낭비
        System.out.println("필드 초기화");
        FiledInit filedInit1 = new FiledInit();    // value = 10
        FiledInit filedInit2 = new FiledInit();    // value = 10
        FiledInit filedInit3 = new FiledInit();    // value = 10
        System.out.println(filedInit1.value);      // 10
        System.out.println(filedInit2.value);      // 10
        System.out.println(filedInit3.value);      // 10

        // static final 상수 필드 초기화
        // static 영역을 활용하여 공유하는 필드로
        // 위 final 필드 초기화에서의 메모리 낭비 문제를 개선할 수 있다!
        // 즉, final 필드 초기화할 때는 static final 상수 방식을 이용하자
        System.out.println("상수");
        System.out.println(FiledInit.CONST_VALUE);  // static 변수라 인스턴스 생성없이 클래스명으로 접근
    }
}
