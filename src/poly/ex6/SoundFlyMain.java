package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    // 추가 되어도 변하지 않는 부분
    // : 구체적인 객체 클래스를 참조하는 것이 아닌
    //   추상적인 부모를 참조하기 때문에 변하지 않는다.
    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                                       // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }

    // Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
