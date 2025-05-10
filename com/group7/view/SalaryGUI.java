package com.group7.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SalaryGUI{
private SalaryController controller;
private JFrame frame;
private JTextField hourlyWagefield;
private JTextField hoursPerWeekfield;
private JTextField taxRateField;
private JTextField resultArea;

public SalaryView(SalaryController controller) {
        this.controller = controller;
      }
}

public void createAndShowGUI(){
frame = new JFrame("Salary Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350, 200);
frame.setLocationRelativeTo(null);

frame.setLayout(new FlowLayout());

// Input boxes
    frame.add(new Jlabel("Hourly Wage: "));
    hourlyWagefield = new JTextField(10);
    frame.add(hourlyWagefield);

    frame.add(new Jlabel("Hours Per Week:"));
    hoursPerWeekfield = new JTextField(10);
    frame.add(hourlyWagefield);

    frame.add(new Jlabel("Tax Rate: "));
    taxRateField = new JTextField(10);
    frame.add(taxRateField);

frame.setVisible(true);
}
