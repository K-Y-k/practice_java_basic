package ref;

public class Method1 {
    // ClassStart3에서의 일일히 변수를 지정하는 좋지 않은 코드를
    // 매개변수가 참조값인 메서드 호출을 통한 리팩토링
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }


    // 객체 필드 정보 등록 메서드
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 출력 메서드
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
