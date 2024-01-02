package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {  // static만 있는 클래스에는 생성자 호출을 막아서 제약을 해주자!
    }

    public static int sum(int[] array) {
        int total = 0;

        for (int value : array) {
            total += value;
        }

        return total;
    }

    public static double average(int[] array) {
        int total = sum(array);

        return (double) total / array.length;  // 명시적 형변환을 활용해야 한다.
    }

    public static int min(int[] array) {
        int minVal = array[0];

        for (int i : array) {
            if (i < minVal) {
                minVal = i;
            }
        }

        return minVal;
    }

    public static int max(int[] array) {
        int maxVal = array[0];

        for (int i : array) {
            if (i > maxVal) {
                maxVal = i;
            }
        }

        return maxVal;
    }
}
