package ref;

public class Method2 {
    // Student student1 = new Student();
    // initStudent(student1, "학생1", 15, 90); 
    // 위 코드에서 한줄로 만들기
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);

        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }


    // 객체 생성 및 필드 정보 등록 메서드
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student; // 참조값 반환
    }

    // 출력 메서드
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
