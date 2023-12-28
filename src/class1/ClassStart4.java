package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // 클래스 + 배열 활용

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


        Student[] students;         // 학생 객체 참조값을 담을 배열로 생성
        students = new Student[2];  // 객체의 변수는 참조 값을 보관하기에 아직 참조값이 지정하지 않았으므로 배열에는 null로 초기화된다.
        students[0] = student1;     // 배열에 객체 인스턴스 참조값을 복사해서 대입한다.
        students[1] = student2;

        
        // 배열의 인덱스로 접근하여 변수명이 다른 문제점을 해결
        System.out.println("이름: " + students[0].name + " 나이:" + students[0].age + " 성적:"+ students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이:" + students[1].age + " 성적:"+ students[1].grade);
    }
}
