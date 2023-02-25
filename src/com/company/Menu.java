package com.company;
/**
 * Menu GUI class the class that display program gui class
 */

import javax.swing.JFrame;

public class Menu {

    public static void main(String[] args) {
        show();

    }

    /**
     * display function
     */
    public static void show() {

        JFrame frame = new JFrame("ITE Calculator");
        frame.setSize(650, 450);

        ProgramGUI programGUI = new ProgramGUI();

        frame.add(programGUI);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(700, 100);
        frame.setVisible(true);
    }

}
