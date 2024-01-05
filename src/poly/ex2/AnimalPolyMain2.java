package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Duck duck = new Duck(); // 항상 부모 인스턴스까지 포함되어 생성
        Animal[] animals = {new Dog(), new Cat(), new Caw(), duck};  // 다형성 특징 1.부모는 자식을 담을 수 있다.

        for (Animal animal : animals) {
            soundAnimal(animal);
        }


        // 남은 문제
        // 1.제대로된 기능을 수행하지 않는 추상적인 부모 인스턴스만 생성이 가능한 문제
        Animal animal = new Animal();
        animal.sound(); // 제대로 작동하지 않는 부모 메서드 호출

        // 2.부모를 상속받은 자식 객체에서 실수로 오버라이딩을 하지 않으면 부모의 메서드로 호출되는 문제
        Animal pig = new Pig();
        pig.sound();   // Pig 클래스에 실수로 오버라이딩을 추가 안해서 부모 메서드가 호출됨

    }


    // 추가 되어도 변하지 않는 부분
    // : 구체적인 객체 클래스를 참조하는 것이 아닌
    //   추상적인 부모를 참조하기 때문에 변하지 않는다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                                              // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
