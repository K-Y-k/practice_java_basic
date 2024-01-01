package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;


    // public : 모든 외부 클래스에서의 호출을 허용한다.
    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    // default : 같은 패키지 안에서의 호출은 허용한다.
    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    // private : 모든 외부 클래스에서의 호출을 막는다.
    private void privateMethod() {
        System.out.println("publicMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();     // 내부에서의 private는 외부에서도 호출이 가능하다.
    }
}
