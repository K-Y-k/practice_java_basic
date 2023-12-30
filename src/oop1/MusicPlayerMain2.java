package oop1;

public class MusicPlayerMain2 {
    /**
     * 절차 지향 프로그래밍 방식2 : 클래스 도입하여 데이터 묶음 방식 적용
     */

    public static void main(String[] args) {
        // 음악 플레이어와 관련된 것들을 모은 객체 생성
        MusicPlayerData data = new MusicPlayerData();
        
        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        
        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);


        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
