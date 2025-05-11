package com.group7.model;

public class SalaryModel{
private double hourlyWage;
private double taxRate;
private double hoursperweek;
    
public SalaryModel(){
    this.hourlyWage = 0;
    this.taxRate = 0;
    this.hoursperweek = 0;
}
public void sethourlyWage(double hourlyWage){
    this.hourlyWage = hourlyWage;
}
public void settaxRate(double taxRate){
    this.taxRate = taxRate;
}
public void sethoursperweek(double hoursperweek){
    this.hoursperweek = hoursperweek;
}
public double calculateNetPay() {
 return (hourlyWage * hoursperweek*52*(1-taxRate/100.0));
    }
}
