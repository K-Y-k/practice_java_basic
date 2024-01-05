package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();   // Parent 인스턴스만 생성
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();    // Parent와 Child 인스턴스 같이 생성
        System.out.println("parent2 호출");
        call(parent2);

        Child child = new Child();
        System.out.println("child 호출");
        call2(child);
    }

    // 현재 인스턴스가 사용할 자식 타입의 인스턴스가 포함되어 있는지 확인하기 위한 메서드
    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {       // Child 인스턴스가 존재하는지 확인
            // 존재하면
            System.out.println("Child 인스턴스 포함되어 있음");
            ((Child) parent).childMethod();  // 일시적으로 다운 케스팅한 후 자식 타입의 메서드를 사용
        } else {
            // 없으면
            System.out.println("Child 인스턴스 없음");
        }
    }
    
    // 자바 16부터 instanceof를 사용하면서 동시에 변수를 선언하여 코드 효율성 높인 방식
    private static void call2(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) {  // instanceof를 사용하면서 동시에 변수 선언
            // 존재하면
            System.out.println("Child 인스턴스 포함되어 있음");
            child.childMethod();  // 일시적으로 다운 케스팅한 후 자식 타입의 메서드를 사용
        } else {
            // 없으면
            System.out.println("Child 인스턴스 없음");
        }
    }
}
