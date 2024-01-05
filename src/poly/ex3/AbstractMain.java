package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성 불가능
//        Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound(); // 자식 타입이므로 자식 메서드 호출
        cat.move();  // 자식 타입에는 없어서 부모 타입의 메서드 호출

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 추가 되어도 변하지 않는 부분
    // : 구체적인 객체 클래스를 참조하는 것이 아닌
    //   추상적인 부모를 참조하기 때문에 변하지 않는다.
    private static void soundAnimal(Animal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                               // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
