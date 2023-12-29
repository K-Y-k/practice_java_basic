package ref;

public class MethodChange2 {
    // 참조형에서의 메서드 호출
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA 참조값 = " + dataA);
        changeReference(dataA);      // 매개변수에 dataA의 참조값을 복사해서 대입함
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20, 참조값으로 접근하고 값을 변경한 것이기에 적용된다.

    }

    public static void changeReference(Data dataX) {
        System.out.println("dataX 참조값 = " + dataX);
        dataX.value = 20;            // 참조값으로 접근하고 값을 변경한 것이기에 적용된다.
    }
}
