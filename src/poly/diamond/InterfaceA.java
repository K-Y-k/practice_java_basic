package poly.diamond;

/**
 * - 다중 구현(다중 상속)
 *   클래스 상속은 부모를 하나만 지정할 수 있지만
 *   부모를 여러명 두는 다중 구현이 가능하다.
 *
 *   인터페이스는 모두 추상 메서드로 이루어졌기에 가능한 것이다.
 */
public interface InterfaceA {
    void methodA();
    void methodCommon();
}
