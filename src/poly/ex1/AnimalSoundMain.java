package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        // 중복되는 코드를 줄이기 위해서 메서드, for문, 배열 등을 활용해야하는데
        // 각 객체 타입이 달라서 같이 묶을 수가 없는 문제 발생
        // 즉, 같은 타입으로 통일을 해야하는데 이때 다형성의 다형적 참조와 메서드 오버라이딩을 활용해야한다!

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        sound(caw);
    }

    private static void sound(Caw caw) {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
