package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 지식 인스턴스 참조 (= 다형적 참조)
        Parent poly = new Child();     // 부모 x001

        // 단, 자식의 기능은 호출 할 수 없다.
        //poly.childMehod();

        // 다운 캐스팅으로 해결 (부모 타입 -> 자식 타입 형변환)
        // 1.강제 형변환 후 사용 방식
        Child child = (Child) poly;    // 부모 타입을 자식 타입으로 강제 형변환한 후 참조 값을 넣어준다.
        child.childMethod();

        // poly.childMethod();      위에서는 poly의 참조 값을 복사해서 대입한 것이기에 기존 poly 변수와는 아무 관련이 없다!
        //                          착각하지 말자!


        // 2.일시적 다운 캐스팅 방식 : 자식의 메서드를 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod();  // 일시적으로 바꿔서 사용
    }
}
