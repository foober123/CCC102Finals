package com.group7.main;

import com.group7.controller.SalaryController;
import com.group7.view.SalaryGUI;
import com.group7.model.SalaryModel;
import java.util.Scanner;

class Main{
public static void main(String[] args) {
   javax.swing.SwingUtilities.invokeLater(() -> {
    SalaryModel model = new SalaryModel();
    SalaryController controller = new SalaryController(model);
    SalaryGUI view = new SalaryGUI(controller);
    controller.setView(view);
    view.createAndShowGUI();



     }); 
    }
}
