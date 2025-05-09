package com.group7.model;

abstract class SalaryCalculator {
    protected double taxRate;
    public abstract double calculateNetPay(double gross);
}

