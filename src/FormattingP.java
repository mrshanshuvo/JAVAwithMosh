import java.text.NumberFormat;

public class FormattingP {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String result = currencyInstance.format(12345678.124);
        System.out.println(result);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String result1 = percentInstance.format(.124);
        System.out.println(result1);
        String result2 = NumberFormat.getCurrencyInstance().format(12454.12);
        System.out.println(result2);
    }
}
