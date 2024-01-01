package access.ex;

// 캡슐화 활용
public class MaxCounter {
    private int count = 0;    // private 접근 제어자로 데이터 접근 제한
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증과 실행 로직으로 구분하여 코딩 스타일 장점: 구분하기 편하다.
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; // 검증을 통과하지 못하면 반환
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
