package poly.basic;

public class CastingMain3 {
    // 업 캐스팅 vs 다운 캐스팅
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 생략이 가능하다. (생략 권장)
        Parent parent2 = child;          // 보통 업 캐스팅은 생략한다.   (업 캐스팅은 문제가 발생할 가능성이 없고 자주 사용되기에)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
