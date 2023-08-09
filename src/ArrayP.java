import java.util.Arrays;
public class ArrayP {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 3;
        numbers[3] = 6;
        int [] numbers1 = {63, 45, 64, 25, 18};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
    }
}
