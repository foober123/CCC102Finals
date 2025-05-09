package com.group7.main.Main;
import com.group7.controller.SalaryController;
import com.group7.view.SalaryGUI;


class Main{
public static void main(String[] args) {
   javax.swing.SwingUtilities.invokeLater(() -> {
    SalaryModel model = new SalaryModel();
    SalaryController controller = new SalaryController(model);
    SalaryView view = new SalaryView(controller);
    controller.setView(view);
    view.createAndShowGUI();



     }); 
    }
}
