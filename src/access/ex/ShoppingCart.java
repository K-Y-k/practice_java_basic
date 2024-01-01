package access.ex;

public class ShoppingCart {
    private final Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        // 검증 로직
        if (isAmountValid(itemCount)) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 메인 실행 로직
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

//        for (Item item : items) {
//            System.out.println("상품명:" + item.getName() + ", 가격:" + item.getPrice() * item.getQuantity());
//        }

        // 배열을 10까지 초기화 해놨기에 향상된 for문으로 사용하면 안된다.
        for (int i = 0; i < itemCount; i++) {
            int totalPrice = items[i].getPrice() * items[i].getQuantity();

            System.out.println("상품명:" + items[i].getName() + ", 가격:" + totalPrice);
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }


    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice() * items[i].getQuantity();
        }

        return totalPrice;
    }

    private boolean isAmountValid(int itemCount) {
        // 개수가 0보다 커야한다.
        return itemCount >= items.length;
    }
}
