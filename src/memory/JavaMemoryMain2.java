package memory;

public class JavaMemoryMain2 {
    // 스택 영역과 힙 영역 예시

    // 스택 영역의 호출 순서
    // |                |         |                             |          | method2() frame (data2=x001)|
    // |                |   ->    | method1() frame (data1=x001)|    ->    | method1() frame (data1=x001)|
    // |  main() frame  |         |    main() frame             |          |    main() frame             |
    //
    // 스택 영역의 호출로 인한 힙 영역
    // |                |         method1의 실행에서 생성된 인스턴스             method2의 실행에서 매개변수에 method1의 인스턴스 참조값을 넘겨서 data1과 data2 같은 인스턴스를 참조하게됨
    // |                |   ->    | data1 -> x001               |           | data1, data2 -> x001           |
    // |                |         |          [ value=10 ]       |     ->    |                 [ value=10 ]   |


    // 스택 영역의 종료 순서
    // | method2() frame|                      |                |          |                |
    // | method1() frame|              ->      | method1() frame|    ->    |                |
    // |  main() frame  |                      |  main() frame  |          |  main() frame  |
    //
    // 스택 영역의 종료로 인한 힙 영역
    //  method2의 종료로 data2의 참조가 제거됨     method1의 종료로 data1의 참조가 제거되고 이 인스턴스는 아무도 참조하지 않게되어 GC가 해당 객체 인스턴스 자체를 제거함
    // | data1 -> x001            |    ->      |                |
    // |          [ value=10 ]    |            |                |

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
