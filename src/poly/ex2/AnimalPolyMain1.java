package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();  // 항상 부모 인스턴스까지 포함되어 생성
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal) { // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                              // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
