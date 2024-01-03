package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        // 부모에게 상속 받은 필드 사용 가능
        publicValue = 1;     // public은    어디서나 사용 가능
        protectedValue = 1;  // protected는 상속 관계이거나 같은 패키지
//        defaultValue = 1;  // default는   부모 클래스의 위치가 다른 패키지이므로 사용 못함
//        privateValue = 1;  // private는   자신 클래스만 가능하므로 접근 불가

        
        // 메서드 호출도 위 필드와 같은 이유
        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
