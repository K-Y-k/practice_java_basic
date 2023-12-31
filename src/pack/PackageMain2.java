package pack;


import pack.a.User; // 다른 패키지의 클래스를 불러올 때의 경로를 import하여
import pack.a.User2;

public class PackageMain2 {
    // 패키지 import 활용
    public static void main(String[] args) {
//        pack.a.User user=  new pack.a.User();
        User user=  new User(); // import 사용으로 패키지 명 생략이 가능해졌다.
        User2 user2 = new User2();
    }
}
