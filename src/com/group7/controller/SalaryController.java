package com.group7.controller;

import com.group7.view.SalaryGUI;
import com.group7.model.SalaryModel;

public class SalaryController {
private SalaryModel model;
private SalaryGUI view;

public SalaryController(SalaryModel model){
    this.model = model;
}

public void setView(SalaryGUI view){
this.view = view;
}

public void SalaryCalc(String hourlyWageStr, String hoursStr, String taxStr){
    double wage = Double.parseDouble(hourlyWageStr);  
        double hours = Double.parseDouble(hoursStr);      
        double tax = Double.parseDouble(taxStr);        
        
        // Update model
        model.sethourlyWage(wage);
        model.sethoursperweek(hours);
        model.settaxRate(tax);

        double net = model.calculateNetPay();
        view.displayResult(String.format("Net Annual: $%,.2f", net));
                    view.displayResult(String.format("Net Annual: $%,.2f", net));

}

}
