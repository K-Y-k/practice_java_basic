package oop1;

public class ValueObjectMain {
    /**
     * 객체 지향을 활용한 방법
     * - 데이터와 그 데이터에 대한 행동(메서드)이 하나의 객체 안에 함께 포함한 방식
     */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }

}
