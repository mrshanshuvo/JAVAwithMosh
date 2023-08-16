package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageSchedules {
    public static void main(String[] args) {
        int principalAmount = (int) readNumber("Principal: ",1000,1_000_000);
        double interestRate = readNumber("Annual Interest Rate: ",1,30);
        byte mortgagePeriod = (byte) readNumber("Period(Years): ",1,30);

        displayMortgage(principalAmount, interestRate, mortgagePeriod);
        displayPaymentSchedule(mortgagePeriod, principalAmount, interestRate);
    }

    private static void displayPaymentSchedule(byte mortgagePeriod, int principalAmount, double interestRate) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(int numberOfPaidInterest = 1; numberOfPaidInterest<= mortgagePeriod *12; numberOfPaidInterest++){
            double payment = paymentSchedule(principalAmount, interestRate, mortgagePeriod,numberOfPaidInterest);
            System.out.println("\t"+ NumberFormat.getCurrencyInstance().format(payment));
        }
    }

    private static void displayMortgage(int principalAmount, double interestRate, byte mortgagePeriod) {
        double mortgage = calculateMortgage(principalAmount, interestRate, mortgagePeriod);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.printf("Monthly Payment: %.2f\n",mortgage);
    }

    public static double calculateMortgage(int principalAmount, double interestRate, byte mortgagePeriod){
        interestRate = interestRate/(100*12);
        mortgagePeriod *= 12;
        double mortgage = principalAmount
                * ((interestRate * Math.pow((1+interestRate),mortgagePeriod))
                / (Math.pow((1+interestRate),mortgagePeriod)-1));
        return mortgage;
    }
    public static double readNumber(String prompt, int min, int max){
        Scanner in = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = Double.parseDouble(in.nextLine());
            if (value > min && value < max) {
                break;
            }else {
                System.out.println("Enter your values between "+min+" and "+max);
            }
        }
        return value;
    }
    public static double paymentSchedule(int principalAmount,
                                         double interestRate,
                                         byte mortgagePeriod,
                                         int numberOfPaidInterest){

        interestRate = interestRate/(100*12);
        mortgagePeriod *= 12;

        double payment = principalAmount
                * (Math.pow((1+interestRate),mortgagePeriod)-Math.pow((1+interestRate),numberOfPaidInterest))
                / (Math.pow((1+interestRate),mortgagePeriod)-1);
        return payment;
    }
}
