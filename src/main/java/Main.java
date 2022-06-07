import java.util.Arrays;

public class Main {
    static Integer addUp(int[] values) {
        Integer sum = Arrays.stream(values).reduce(0, (a, b) -> a + b);
        return sum;
    }

    public static void main(String[] args) {

    }
}
