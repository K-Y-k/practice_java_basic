package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + Constant.MAX_USERS);  // 이 최대 참여자 수를 고정된 값인 상수로 지정해야 확인할 때 착각하지 않을 수 있다.
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);

        if (currentUserCount > Constant.MAX_USERS) {    // 이렇게 상수로 고정해야 이 값이 어떤 값으로 사용됐는지 확인하기 편하다.
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
