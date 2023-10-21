package org.example.controller;

import org.example.Service.Operations;
import org.example.model.Functions;
import org.example.model.Outter;
import org.example.view.CalculationView;
import org.example.view.Text;
import org.example.view.View;

import java.util.Scanner;

public class Controller {

    /** menu() - Функция запускает меню с выбором
     *  вариантов вычислений с целыми, дробными или комплексными числами
     */
    public void menu() {

        Scanner cs = new Scanner(System.in);
        Operations operations = new Operations(new CalculationView(), new Functions(), new Outter());

        boolean flag = true;
        while (flag) {
            Text.welcome();

            int num = cs.nextInt();

            switch (num) {
                case 1 -> operations.subMenu();
                case 2 -> operations.subMenuComplex();
                case 3 -> operations.logger.readHistory();
                case 4 -> flag = false;
                default -> Text.noThatNumber();
            }

        }

    }
}

