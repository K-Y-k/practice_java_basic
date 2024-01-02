package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);        // 인스턴스 생성 없이 사용 가능해졌다.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
