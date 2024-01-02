package static2.ex;

import static static2.ex.MathArrayUtils.*;  // 자주 사용하는 static 클래스는 import를 사용

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        // 객체를 생성하지 않고 static 메서드를 활용하여 클래스로 접근하여 편리하게 호출
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}
