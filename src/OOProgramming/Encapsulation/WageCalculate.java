package OOProgramming.Encapsulation;
public class WageCalculate {
    public int baseSalary;
    private int hourlyRate;
    public int calculateWage(int extraHour){
        return baseSalary + (hourlyRate * extraHour);
    }
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
