package com.group7.controller;
class HourlyToSalary extends SalaryCalculator {
    @Override
    public double calculateNetPay(double hourlyWage) {
        return (hourlyWage * hoursperweek*weeks) * (1 - taxRate/100.0); // Example: 40h/week, 52 weeks
    }
}
