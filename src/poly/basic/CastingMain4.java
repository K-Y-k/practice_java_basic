package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();  // 부모 인스턴스와 자식 인스턴스를 포함하여 생성함
        Child child = (Child) parent1;
        child.childMethod();           // 강제 형변환으로 호출 가능해짐

        
        // 부모 인스턴스만 생성한 경우 자식의 인스턴스까지 포함되어 생성된 것이 아니기 때문에
        // 자식으로 강제 형변환할 수 없다.
        // 즉, 다운 캐스팅을 자동으로 하지 않는 이유가 이러한 경우를 대비해서 명시적 캐스팅만 허용한다.
        Parent parent2 = new Parent();    // 부모 인스턴스만 생성함
        //Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException 예외 발생
        //child2.childMethod();           // 실행불가
    }
}