package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 클래스를 활용한 방법
        // 클래스라는 설계도를 활용하여 실제 메모리에 만들어진 실체를 객체 또는 인스턴스이다.
        // 즉, 여기서는 new Student()으로 Student 객체가 생성되어있다.
        
        Student student1;         // 학생을 담아둘 변수 선언
        student1 = new Student(); // 메모리에 학생 클래스를 만들고 이 객체에 접근할 수 있는 참조값을 해당변수에 보관한다. ex) student1에는 참조값 x001이 보관
        student1.name = "학생1";   // 학생 정보를 설정
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // .키워드로 객체의 필드 값에 접근한다. ex) student1.name = x001(참조값).name으로 접근
        // 아직 아쉬운 부분 : 출력 부분에서 아직 객체 변수명을 따로 지정한 문제
        System.out.println("이름: " + student1.name + " 나이:" + student1.age + " 성적:"+ student1.grade);
        System.out.println("이름: " + student2.name + " 나이:" + student2.age + " 성적:"+ student2.grade);
    }
}
