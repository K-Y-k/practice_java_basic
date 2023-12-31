package pack;


import pack.a.User;

public class PackageMain3 {
    // 다른 패키지의 같은 클래스명일 경우
    // 자주 사용하는 것을 import한다!
    public static void main(String[] args) {
        User userA=  new User(); // import 사용으로 패키지 명 생략이 가능해졌다.

        pack.b.User userB = new pack.b.User(); // 이미 위에서 같은 클래스명이 import 되어있기에 여기서는 패키지 경로를 모두 포함시켜서 사용해야한다.
    }
}
