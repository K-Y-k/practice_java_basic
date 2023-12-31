package pack;


public class PackageMain1 {
    // 패키지 활용
    // 매우 많은 클래스가 등장하면서
    // 관련 있는 클래스들을 분류해서 구분 및 관리하기 위해 나온 폴더
    public static void main(String[] args) {
        Data data = new Data();               // 같은 패키지의 클래스를 불러올 때 경로가 생략된다.
        pack.a.User user=  new pack.a.User(); // 다른 패키지의 클래스를 불러올 때 경로가 있어야한다.
    }
}
