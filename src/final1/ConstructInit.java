package final1;

public class ConstructInit {
    final int value;                  // final을 필드에 사용할 경우
//    final int value = 10;           // 1.여기서 직접 초기화해주거나


    public ConstructInit(int value) { // 2.또는 생성자 호출에서 1번 할당하게 한다.
        this.value = value;
    }
}
