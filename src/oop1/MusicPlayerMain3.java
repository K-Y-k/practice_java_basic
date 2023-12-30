package oop1;

public class MusicPlayerMain3 {
    /**
     * 절차 지향 프로그래밍 방식3 : 메서드를 활용한 코드 재사용
     * - 중복 코드 제거
     * - 변경시 메서드 내부만 변경하면 되서 유지보수가 좋아짐
     * - 모듈화 : 필요한 기능 메서드를 조립해서 프로그램 작성
     * 
     * 하지만, 아직 순차적으로 진행되므로 절차 지향 프로그래밍이다.
     * 데이터와 그 데이터에 대한 행동(메서드)이 분리되어 있다.
     * 즉, 데이터 부분이 변경되면 메서드도 변경해야한다.
     * (=절차 지향의 한계점)
     */

    public static void main(String[] args) {
        // 음악 플레이어와 관련된 것들을 모은 객체 생성
        MusicPlayerData data = new MusicPlayerData();
        
        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }


    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }


    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
}
