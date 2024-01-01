package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();;
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();


        // 필드에 직접 접근
        // 메서드에서 볼륨 값을 제한했지만 직접 접근해서 값을 지정하는 것은 막지 못했다.
        // 즉, 멤버 변수 앞에 private 접근 제어자를 붙여서 직접 접근을 못하게 해야한다!
        //     이제 볼륨 업, 다운의 메서드로만 데이터 값을 통제할 수 있게 되었다.
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; private 접근 제어자를 붙여서 직접 접근 제한
        speaker.showVolume();
    }
}
