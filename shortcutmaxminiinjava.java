import java.util.Arrays;

public class shortcutmaxminiinjava {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 9, 1};

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        
    }
}
