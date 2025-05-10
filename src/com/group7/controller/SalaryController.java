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


}
