package extends1.super1;

public class Parent {
    public String value = "parent";
    public String name = "Only parent_Field name";   // 부모만 있는 필드

    public void hello() {
        System.out.println("Parent.hello");
    }

    public String getName() {                        // 부모만 있는 필드 사용하기 위한 메서드 선언
        return name;
    }
}
