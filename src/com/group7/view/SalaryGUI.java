package com.group7.view;

import com.group7.controller.SalaryController;

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

public SalaryGUI(SalaryController controller) {
        this.controller = controller;
      }

public void createAndShowGUI(){
frame = new JFrame("Foobar23k");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350, 200);
frame.setLocationRelativeTo(null);

frame.setLayout(new FlowLayout());

// Input boxes
    frame.add(new JLabel("Hourly Wage: "));
    hourlyWagefield = new JTextField(10);
    frame.add(hourlyWagefield);

    frame.add(new JLabel("Hours Per Week:"));
    hoursPerWeekfield = new JTextField(10);
    frame.add(hourlyWagefield);

    frame.add(new JLabel("Tax Rate: "));
    taxRateField = new JTextField(10);
    frame.add(taxRateField);

    frame.setVisible(true);
    }

}
