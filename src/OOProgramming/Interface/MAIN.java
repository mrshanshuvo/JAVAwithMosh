package OOProgramming.Interface;
public class MAIN {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2023(100_000);
        var report = new TaxReport(calculator);
        report.show();
    }
}