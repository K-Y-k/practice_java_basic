package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 일일히 학생들의 정보 변수를 넣는 문제를 배열로 해결
        // 추가할 때마다 배열에 값을 넣으면 된다.

        // 한계점: 코드의 최소화에 성공했지만,
        //        요소의 데이터를 삭제하면 인덱스 매칭의 문제가 발생할 수 있다.
        //        즉, 사람이 관리하기 좋은 방식이 아니다.

        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        System.out.println("이름: " + studentNames[0] + " 나이:" + studentAges[0] + " 성적:"+ studentGrades[0]);
        System.out.println("이름: " + studentNames[1] + " 나이:" + studentAges[1] + " 성적:"+ studentGrades[1]);
    }
}
