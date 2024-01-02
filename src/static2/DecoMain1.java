package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        // 멤버 변수가 없는 메서드뿐인 DecoUtil1 객체 인스턴스를 생성해야하는 불편함
        // 인스턴스가 필요한 이유는 멤버변수(인스턴스변수) 등을 사용하는 목적이 크므로 의미가 없는 생성이다.
        DecoUtil1 utils = new DecoUtil1();

        String s = "hello java";
        String deco = utils.deco(s);
        
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
