package construct.ex;

public class Book {
    String title;
    String author;
    int page;


    // 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록
    // 생성자라는 기능을 제공한다.

    // 기본 생성자 : 매개변수가 없는 생성자
    //             단, 직접 만든 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    //             여기는 직접 만든 생성자가 없어 자바가 자동으로 기본 생성자를 만들어준다.
    // 만약 아래처럼 직접 정의한 기본 생성자를 추가혀면 이 기본 생성자를 호출한다.
    public Book() {
        this("", "", 0); // 이미 아래에서 중복 생성자가 있어 this()로 해당 생성자를 불러온 것이다.
                                          // 즉, this()로 생성자 내부에서 자신의 자신의 다른 생성자를 호출할 수 있다.
                                          // 단, this()는 생성자 코드의 첫줄에만 사용할 수 있다.
    }


    // 생성자는 메서드와 비슷하지만 차이점이 있다.
    // 1.생성자의 이름은 클래스 이름과 같아야 한다. 즉, 첫 글자도 대문자로 시작한다.
    // 2.생성자는 반환 타입이 없다.
    // 3.나머지는 메서드와 같다.
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 필요한 매개변수들만 구성하여
    // 생성자 오버로딩으로 추가
    public Book(String title, String author) {
        this(title, author, 0); // 이미 위에서 중복 생성자가 있어 this()로 해당 생성자를 불러온 것이다.
                                      // 즉, this()로 생성자 내부에서 자신의 자신의 다른 생성자를 호출할 수 있다.
                                      // 단, this()는 생성자 코드의 첫줄에만 사용할 수 있다.
    }

    void displayInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지:" + this.page);
    }
}
