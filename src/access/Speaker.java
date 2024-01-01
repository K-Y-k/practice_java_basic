package access;

public class Speaker {
    private int volume; // 멤버 변수 앞에 private 접근 제어자를 붙여서 직접 접근을 못하게 해야한다!

    
    // 생성자를 통한 초기 음량 지정
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음략을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
