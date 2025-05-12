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


    public SalaryGUI(SalaryController controller) {
        this.controller = controller;
    }

    // code to run dark mode
    public void darkMode(GridBagConstraints gbc){
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

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(toggleDarkmode, gbc);
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

        gbc.gridy = 4;
        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(resultLabel, gbc);

        darkMode(gbc);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculate) {
            controller.SalaryCalc(hourlyWagefield.getText(),
                    hoursPerWeekfield.getText(),
                    taxRateField.getText());
        }
    }

    public void displayResult(String result) {
        resultLabel.setText(result);

    }
}
