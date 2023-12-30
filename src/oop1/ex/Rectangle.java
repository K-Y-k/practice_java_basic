package oop1.ex;

/**
 *  클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다! (=캡슐화)
 */

public class Rectangle {
    // 속성
    int width;
    int height;

    
    // 기능
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

}
