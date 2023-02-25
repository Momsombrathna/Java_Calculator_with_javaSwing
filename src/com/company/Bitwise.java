package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bitwise extends JPanel implements ActionListener {

    JButton[] numBtn = new JButton[10];
    JButton[] functionBtn = new JButton[10];
    JButton xor, and, or, bitInver, rightSif, leftSif, equal, clear, btnDot, btnDel;
    protected JTextField textField, textField2;
    protected JPanel panel1, panel2, panel3;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // color function
    Color c1 = new Color(228, 228, 228);
    Color c2 = new Color(156, 156, 156);
    Color c4 = new Color(243, 243, 243);

    // font function
    Font myFont = new Font("Arial", Font.BOLD, 16);
    Font myFont1 = new Font("Arial", Font.BOLD, 14);
    Font myFont2 = new Font("Arial", Font.BOLD, 24);
    Font myFont3 = new Font("Arial", Font.BOLD, 16);

    // border function
    Border one = BorderFactory.createEtchedBorder();
    Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c4);
    Border three = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);

    // Bitwise Gui function
    public Bitwise() {
        xor = new JButton("XOR");
        and = new JButton("AND");
        or = new JButton("OR");
        rightSif = new JButton(">>");
        leftSif = new JButton("<<");
        equal = new JButton("=");
        clear = new JButton("C");
        bitInver = new JButton("NOT ");
        btnDot = new JButton(".");
        btnDel = new JButton("Delete");

        functionBtn[0] = xor;
        functionBtn[1] = and;
        functionBtn[2] = or;
        functionBtn[3] = rightSif;
        functionBtn[4] = leftSif;
        functionBtn[5] = equal;
        functionBtn[6] = btnDot;
        functionBtn[7] = bitInver;
        functionBtn[8] = clear;
        functionBtn[9] = btnDel;

        // making function button by for loop method
        for (int i = 0; i < 10; i++) {
            functionBtn[i].addActionListener(this);
            functionBtn[i].setFocusable(false);
            functionBtn[i].setFont(myFont1);
            functionBtn[i].setBorder(BorderFactory.createCompoundBorder(one, three));
            functionBtn[i].setBackground(c1);
        }

        // making number button by for loop method
        for (int i = 0; i < 10; i++) {
            numBtn[i] = new JButton(String.valueOf(i));
            numBtn[i].addActionListener(this);
            numBtn[i].setFocusable(false);
            numBtn[i].setFont(myFont);
            numBtn[i].setBorder(BorderFactory.createCompoundBorder(one, two));
            numBtn[i].setBackground(c4);
        }

        // create text field
        textField = new JTextField();
        textField2 = new JTextField();

        // create panel
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel(new GridLayout(5, 4, 15, 10));

        panel1.setPreferredSize(new Dimension(600, 50));
        panel2.setPreferredSize(new Dimension(600, 25));
        panel3.setPreferredSize(new Dimension(600, 500));
        textField.setPreferredSize(new Dimension(600, 150));
        textField.setBackground(c4);
        panel2.setBackground(c4);
        textField.setFont(myFont2);
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField2.setPreferredSize(new Dimension(600, 50));
        textField2.setBorder(BorderFactory.createEmptyBorder());
        textField2.setBackground(c4);
        textField2.setFont(myFont3);
        textField2.setHorizontalAlignment(JTextField.RIGHT);

        // add button to panel
        panel3.add(functionBtn[4]);
        panel3.add(functionBtn[3]);
        panel3.add(functionBtn[9]);
        panel3.add(functionBtn[8]);
        panel3.add(numBtn[1]);
        panel3.add(numBtn[2]);
        panel3.add(numBtn[3]);
        panel3.add(functionBtn[0]);
        panel3.add(numBtn[4]);
        panel3.add(numBtn[5]);
        panel3.add(numBtn[6]);
        panel3.add(functionBtn[7]);
        panel3.add(numBtn[7]);
        panel3.add(numBtn[8]);
        panel3.add(numBtn[9]);
        panel3.add(functionBtn[1]);
        panel3.add(functionBtn[6]);
        panel3.add(numBtn[0]);
        panel3.add(functionBtn[5]);
        panel3.add(functionBtn[2]);

        // set to panel
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(650, 550));

        this.add(panel2);
        this.add(textField2);
        this.add(textField);
        this.add(panel3);

    }

    // add action listener to all button
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtn[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
                textField2.setText(textField2.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == btnDot) {
            textField.setText(textField.getText().concat("."));
            textField2.setText(textField2.getText().concat("."));
        }
        if (e.getSource() == xor) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'x';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" ^ "));
        }
        if (e.getSource() == and) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'a';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" & "));
        }
        if (e.getSource() == or) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'o';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" | "));
        }
        if (e.getSource() == bitInver) {
            num1 = Double.parseDouble(textField.getText());
            result = BitwiseP.not((int) num1);
            textField.setText("");
            textField2.setText(textField2.getText().concat(" = " + result));
        }
        if (e.getSource() == rightSif) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'r';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" >> "));

        }
        if (e.getSource() == leftSif) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'l';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" << "));
        }
        if (e.getSource() == btnDel) {
            String string = textField.getText();
            textField.setText("");
            textField2.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
                textField2.setText(textField2.getText() + string.charAt(i));
            }
        }

        if (e.getSource() == equal) {

            // using exception (try catch)
            try {
                num2 = Double.parseDouble(textField.getText());
            } catch (NumberFormatException j) {
                JOptionPane.showMessageDialog(null,
                        "Error: please input the second integer");
            }

            switch (operator) {
                case 'x':
                    result = BitwiseP.XOR((int) num1, (int) num2);
                    break;
                case 'a':
                    result = BitwiseP.AND((int) num1, (int) num2);
                    break;
                case 'o':
                    result = BitwiseP.OR((int) num1, (int) num2);
                    break;
                case 'r':
                    result = BitwiseP.rightShift((int) num1, (int) num2);
                    break;
                case 'l':
                    result = BitwiseP.leftShift((int) num1, (int) num2);
                    break;
            }
            textField.setText(String.valueOf("= " + result));
            num1 = result;
        }
        if (e.getSource() == clear) {
            textField.setText("");
            textField2.setText("");
        }

    }// end Action listener

    /**
     * Bitwise class is a class that having methods collection for calculate
     * Bitwise.
     */
    public class BitwiseP {
        /**
         * Calculate bitwise AND
         * 
         * @param a an integer
         * @param b an integer
         * @return to integer
         */
        public static int AND(int a, int b) {
            return a & b;
        }

        /**
         * Calculate bitwise OR
         * 
         * @param a an integer
         * @param b an integer
         * @return to integer
         */
        public static int OR(int a, int b) {
            return a | b;
        }

        /**
         * Calculate bitwise XOR
         * 
         * @param a an integer
         * @param b an integer
         * @return to integer
         */
        public static int XOR(int a, int b) {
            return a ^ b;
        }

        /**
         * Calculate bitwise leftShift
         * 
         * @param a an integer
         * @param b an integer
         * @return to integer
         */
        public static int leftShift(int a, int b) {
            return a << b;
        }

        /**
         * Calculate bitwise rightShift
         * 
         * @param a an integer
         * @param b an integer
         * @return to integer
         */
        public static int rightShift(int a, int b) {
            return a >> b;
        }

        /**
         * Calculate bitwise inversion
         * 
         * @param a an integer
         * @return to integer
         */
        public static int not(int a) {
            return ~a;
        }
    }

}
