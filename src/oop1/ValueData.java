package oop1;

/**
 * 자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다!
 *
 * 객체 클래스 내부의 메서드는 static을 붙이면 안된다!
 * static은 객체를 생성하지 않고도 메서드를 호출할 수 있기 때문이다.
 */
public class ValueData {
    int value;

    void add() {  // static은 객체를 생성하지 않고도 메서드를 호출할 수 있어 static이 없는 것이다!
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
