abstract class SalaryCalculator {
    protected double taxRate;
    public abstract double calculateNetPay(double gross);
}

class HourlyToSalary extends SalaryCalculator {
    @Override
    public double calculateNetPay(double hourlyWage) {
        return (hourlyWage * 40 * 52) * (1 - taxRate/100.0); // Example: 40h/week, 52 weeks
    }
}
