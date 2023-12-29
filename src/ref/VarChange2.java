package ref;

public class VarChange2 {
    public static void main(String[] args) {
        // 복사하여 넣은 것이지만
        // 결국 접근하는 참조값을 넣은 것이라 접근하는 인스턴스가 같아진다!
        // 하지만 참조값만 복사한 것이지 인스턴스가 같아지는 것이 아니다!!
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;


        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);   // 10
        System.out.println("dataB.value = " + dataB.value);   // 10


        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);   // 20
        System.out.println("dataB.value = " + dataB.value);   // 20


        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);   // 30
        System.out.println("dataB.value = " + dataB.value);   // 30
    }
}
