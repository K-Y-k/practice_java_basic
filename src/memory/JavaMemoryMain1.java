package memory;

public class JavaMemoryMain1 {
    /**
     * 자바 메모리 구조 - 스택 영역
     * - 실제 프로그램이 실행되는 영역이다.
     *
     * - 메서드를 실행할 때마다 스택 프레임이 하나씩 쌓이고
     *   메서드가 종료되면 해당 스택 프레임이 제거된다.
     *
     * - 스택 영역은 쓰레드 수 만큼 생성된다.
     */
    // 스택 영역의 호출 순서
    // |                |         |                |          | method2() frame|
    // |                |   ->    | method1() frame|    ->    | method1() frame|
    // |  main() frame  |         |  main() frame  |          |  main() frame  |

    // 스택 영역의 종료 순서
    // | method2() frame|         |                |          |                |
    // | method1() frame|   ->    | method1() frame|    ->    |                |
    // |  main() frame  |         |  main() frame  |          |  main() frame  |
    public static void main(String[] args) { // main의 스택 프레임이 스택영역에 제일 먼저 생성된다.
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }                                        // 스택은 후입선출이므로 제일 먼저 생성됐던 main 스택 프레임이 제일 마지막에 종료된다.

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }
    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
