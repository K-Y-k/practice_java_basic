package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;


    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        // 부모의 필드는 private라서 super.으로 필드를 접근하지 못하기에
        // 부모에 같은 이름인 super.print() 메서드를 만들어서 필드를 접근해야 한다!
//        System.out.println("이름:" + super.name + ", 가격:" + super.price);

        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
