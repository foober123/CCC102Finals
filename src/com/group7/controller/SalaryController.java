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

    try {
        double wage = Double.parseDouble(hourlyWageStr);
        double hours = Double.parseDouble(hoursStr);
        double tax = Double.parseDouble(taxStr);

        if(wage<0 || hours<0 || tax<0){
            view.displayResult("You cannot enter a negative number!");
            return;
        }
        else if (tax>100){
            view.displayResult("Tax rate is over 100!");
            return;
        }
        else if (hours>168){
            view.displayResult("Hours entered has exceeded 168!");
            return;
        }
        else

        // Update model
        model.sethourlyWage(wage);
        model.sethoursperweek(hours);
        model.settaxRate(tax);

        double net = model.calculateNetPay();
        view.displayResult(String.format("Net Annual: $%,.2f", net));
        view.displayResult(String.format("Net Annual: $%,.2f", net));
    }
    catch(NumberFormatException e){
        view.displayResult("Please enter a valid number!");
    }

}

}

