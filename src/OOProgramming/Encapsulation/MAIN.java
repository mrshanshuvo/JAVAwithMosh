package OOProgramming.Encapsulation;
public class MAIN {
    public static void main(String[] args) {
        var employee = new WageCalculate();
        employee.baseSalary = 50_000;
        employee.setHourlyRate(100);
        employee.getHourlyRate();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
