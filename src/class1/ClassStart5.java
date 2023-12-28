package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        // 클래스 + 배열 활용 + 리팩토링

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


        // 학생 객체 참조값을 담을 배열 생성 및 선언 부분 최적화 리팩토링
        Student[] students = new Student[]{student1, student2};
//        Student[] students = {student1, student2}; 이렇게 최적화 가능

        // 반복문으로 출력 리팩토링
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이:" + students[i].age + " 성적:"+ students[i].grade);
        }

        // 향상된 for문으로 더 최적화  : 여기서는 인덱스를 사용할 일이 없으므로 이 방법으로 최적화 가능
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이:" + s.age + " 성적:"+ s.grade);
        }
    }
}
