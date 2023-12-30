package oop1;

public class MusicPlayerMain1 {
    /**
     * 절차 지향 프로그래밍 방식
     * - 실생 순서를 중요하게 생각하는 방식입니다.
     * - 프로그램의 흐름을 순차적으로 따르며 처리하는 방식입니다.
     * - “어떻게”를 중심
     */

    public static void main(String[] args) {
        int volume = 0;
        boolean is0n = false;
        
        
        // 음악 플레이어 켜기
        is0n = true;
        System.out.println("음악 플레이어를 시작합니다");
        
        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);


        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (is0n) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        is0n = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
