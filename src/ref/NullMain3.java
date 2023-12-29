package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // Data data는 null, int count는 0으로 자동 초기화 된 상태
        System.out.println("bigData.data = " + bigData.data);   // null
        System.out.println("bigData.count = " + bigData.count); // 0

        // 참조값이 null인 data를 접근했기에 NPE 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
