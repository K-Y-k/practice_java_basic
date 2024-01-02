package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {  // 2.생성자 호출할 때의 외부 클래스인 매개변수가 추가되는 복잡함
        this.name = name;
        counter.count++;
    }
}
