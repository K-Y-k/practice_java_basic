package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // final로 Data의 참조형을 고정
//        data = new Data();          // 참조 대상을 고정했기에 변경 불가능


        // 하지만 참조 변수에 들어있는 참조 값만 고정한 것이기에
        // 참조 대상의 필드 값은 변경 가능하다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
