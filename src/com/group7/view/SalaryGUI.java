package com.group7.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.group7.controller.SalaryController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryGUI extends JFrame implements ActionListener {
    private SalaryController controller;
    private JFrame frame;
    private JTextField hourlyWagefield;
    private JTextField hoursPerWeekfield;
    private JTextField taxRateField;
    private JLabel resultLabel;
    private JButton calculate;
    private JButton clear;


    public SalaryGUI(SalaryController controller) {
        this.controller = controller;
    }

    // code to run dark mode
    public void darkMode(){
        JToggleButton toggleDarkmode = new JToggleButton("Dark mode");
        toggleDarkmode.addActionListener(e -> {
            try {
                if (toggleDarkmode.isSelected()) {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } else {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                }
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    GridBagConstraints gbcDark = new GridBagConstraints();
    gbcDark.gridx = 0;
    gbcDark.gridy = 99; // way down, after all other content
    gbcDark.gridwidth = 1;
    gbcDark.anchor = GridBagConstraints.SOUTHWEST;
    gbcDark.weightx = 1;
    gbcDark.weighty = 1; // eats vertical space to push down
    gbcDark.fill = GridBagConstraints.NONE;
    gbcDark.insets = new Insets(0, 0, 5, 0); // little breathing room at bottom

    frame.add(toggleDarkmode, gbcDark);
         }

    public void createAndShowGUI() {
        calculate = new JButton("Calculate");
        calculate.addActionListener(this);


        frame = new JFrame("Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        ;


        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;

// Input box
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("Hourly Wage:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        hourlyWagefield = new JTextField(10);
        frame.add(hourlyWagefield, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Hours Per Week:"), gbc);
        hoursPerWeekfield = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(hoursPerWeekfield, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JLabel("Tax Rate:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        taxRateField = new JTextField(10);
        frame.add(taxRateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(calculate, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5; 
        clear = new JButton("Clear");
        clear.addActionListener(this);
        frame.add(clear, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(resultLabel, gbc);

        darkMode();
        frame.setVisible(true);
    }


    private void clearFields() {
        hourlyWagefield.setText("");
        hoursPerWeekfield.setText("");
        taxRateField.setText("");
        resultLabel.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculate) {
            controller.SalaryCalc(
                    hourlyWagefield.getText(),
                    hoursPerWeekfield.getText(),
                    taxRateField.getText()
                    );
        }
        else if(e.getSource() == clear){
            clearFields();
        }
    }

    public void displayResult(String result) {
        resultLabel.setText(result);

    }



}
