package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 지식 인스턴스 참조 (= 다형적 참조)
        Parent poly = new Child();     // 부모 x001

        // 단, 자식의 기능은 호출 할 수 없다.
        //poly.childMehod();

        // 다운 캐스팅으로 해결 (부모 타입 -> 자식 타입 형변환)
        // 자바에서 컴파일 오류로 경고를 준 것이지만, 개발자가 책임지고 일시적으로 변환 시킨 것
        Child child = (Child) poly;    // 부모 타입을 자식 타입으로 강제 형변환한 후 참조 값을 넣어준다.
        child.childMethod();

        // poly.childMethod();      위에서는 poly의 참조 값을 복사해서 대입한 것이기에 기존 poly 변수와는 아무 관련이 없다!
        //                          착각하지 말자!
    }
}
