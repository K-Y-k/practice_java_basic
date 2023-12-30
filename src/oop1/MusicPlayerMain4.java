package oop1;

public class MusicPlayerMain4 {
    /**
     * 객체 지향을 활용한 방법
     * - 데이터와 그 데이터에 대한 행동(메서드)이 하나의 객체 안에 함께 포함한 방식 (=캡슐화)
     *   즉, 변경 부분도 관련 클래스 내부에서 변경해주면 되어 유지보수가 편리해준다.
     *
     * - 이제 클래스 설계 부분과 이 클래스를 사용하는 부분으로 나누어서 개발할 수가 있다.
     *
     * - 즉, 세상에 있는 것은 모두 속성과 기능으로 존재하므로 이 클래스를 설계하는 것이 가장 중요하다!
     */

    public static void main(String[] args) {
        // 음악 플레이어와 관련된 것들을 모은 객체 생성
        MusicPlayer player = new MusicPlayer();
        
        // 음악 플레이어 켜기
        player.on();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();
    }

}
