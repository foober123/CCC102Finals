package com.group7.main;

//import com.formdev.flatlaf.FlatDarkLaf;
import com.group7.controller.SalaryController;
import com.group7.view.SalaryGUI;
import com.group7.model.SalaryModel;
import java.util.Scanner;

class Main{
public static void main(String[] args) {
/*
 try {
  UIManager.setLookAndFeel(new FlatDarkLaf());
 }
 catch (Exception e) {
  System.err.println("Failed to initialize LaF");
 }
 */

   javax.swing.SwingUtilities.invokeLater(() -> {
    SalaryModel model = new SalaryModel();
    SalaryController controller = new SalaryController(model);
    SalaryGUI view = new SalaryGUI(controller);
    controller.setView(view);
    view.createAndShowGUI();



     }); 
    }
}
