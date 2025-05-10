package com.group7.main.Main;
import com.group7.controller.SalaryController;
import com.group7.view.SalaryGUI;
import java.util.Scanner;

class Main{
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   javax.swing.SwingUtilities.invokeLater(() -> {
    SalaryModel model = new SalaryModel();
    SalaryController controller = new SalaryController(model);
    SalaryView view = new SalaryView(controller);
    controller.setView(view);
    view.createAndShowGUI();



     }); 
    }
}
