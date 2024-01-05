package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스는 순수 추상 클래스이므로 인스턴스를 생성할 수 없다.
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();  // 자식타입과 부모타입인 인터페이스 인스턴스도 포함되어 생성된다.
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);
    }

    // 추가 되어도 변하지 않는 부분
    // : 구체적인 객체 클래스를 참조하는 것이 아닌
    //   추상적인 부모를 참조하기 때문에 변하지 않는다.
    private static void soundAnimal(InterfaceAnimal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                               // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
