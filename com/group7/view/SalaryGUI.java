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

}

public void createAndShowGUI(){
frame = new JFrame("Salary Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350, 200);
frame.setLocationRelativeTo(null);

frame.setVisible(true);
}
