package MortgageCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal: ");
        int principalAmount = in.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = in.nextDouble();
        interestRate = (interestRate/100)/12;
        System.out.print("Period (Years): ");
        int mortgagePeriod = in.nextInt();
        mortgagePeriod = mortgagePeriod * 12;
        double M = principalAmount * ((interestRate * Math.pow((1+interestRate),mortgagePeriod))/(Math.pow((1+interestRate),mortgagePeriod)-1));
        System.out.printf("Mortgage: %.2f",M);
    }
}
