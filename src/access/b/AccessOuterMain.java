package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();
        
        // 현재 다른 패키지에서의 AccessData 클래스라서 default 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        // 내부에서의 default와 private는 호출이 가능하다.
        data.innerAccess();
    }
}
