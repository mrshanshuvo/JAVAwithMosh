package MortgageCalculator;
import java.util.Scanner;
public class Calculator3 {
    // This Mortgage Calculator is designed with Extracting Methods
    public static void main(String[] args) {

        int principalAmount = (int) readNumber("Principal(1K$ ~ 1M$): ",1000,1_000_000);
        double interestRate = readNumber("Annual Interest Rate(0 ~ 30): ",1,30);
        byte mortgagePeriod = (byte) readNumber("Period (Years): ",1,30);

        double mortgage = calculateMortgage(principalAmount,interestRate,mortgagePeriod);
        System.out.printf("Mortgage: %.2f",mortgage);
    }
    public static double readNumber(String prompt, int min, int max){
        Scanner in = new Scanner(System.in);
        double value;
        while (true){
            System.out.print(prompt);
            value = Double.parseDouble(in.nextLine());
            if(value > min && value <= max){
                break;
            }else {
                System.out.println("Enter a value between "+min+" to "+max);
            }
        }
        return value;
    }
    public static double calculateMortgage(double principalAmount, double interestRate, double mortgagePeriod){

        interestRate = (interestRate/100)/12;
        mortgagePeriod = mortgagePeriod * 12;

        double mortgage = principalAmount
                * ((interestRate * Math.pow((1+interestRate),mortgagePeriod))
                / (Math.pow((1+interestRate),mortgagePeriod)-1));
        return mortgage;
    }
}
