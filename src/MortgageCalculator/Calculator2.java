package MortgageCalculator;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principalAmount = 0, mortgagePeriod = 0;
        boolean bool = true;
        double interestRate = 0, M;

        while (bool){
            System.out.print("Principal(1K$ ~ 1M$): ");
            principalAmount = in.nextInt();
            if(principalAmount > 1000 && principalAmount <= 1000000){
                bool = false;
            }else {
                System.out.println("Enter a number between 1,000 and 1,000,000");
            }
        }

        while (true){
            System.out.print("Annual Interest Rate(0 ~ 30): ");
            interestRate = in.nextDouble();
            interestRate = (interestRate/100)/12;
            if(interestRate > 0 && interestRate <= 30){
                break;
            }else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        while (true){
            System.out.print("Period (Years): ");
            mortgagePeriod = in.nextInt();
            if(mortgagePeriod > 0 && mortgagePeriod <= 30){
                mortgagePeriod = mortgagePeriod * 12;
                break;
            }else {
                System.out.println("Enter a value between 1 to 30");
            }
        }
        M = principalAmount * ((interestRate * Math.pow((1+interestRate),mortgagePeriod))/(Math.pow((1+interestRate),mortgagePeriod)-1));
        System.out.printf("Mortgage: %.2f",M);
    }
}
