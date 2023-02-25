package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryArithmetic extends JPanel implements ActionListener {

    JButton[] numBtn = new JButton[2];
    JButton[] functionBtn = new JButton[7];
    JButton binaryAdd, binarySub, binaryDiv, binaryMul, btnClear, btnEqual, btnDel;
    protected JTextField textField, textField2;
    protected JPanel panel1, panel2, panel3;
    // double num1 = 0, num2 = 0, result = 0;

    String a;
    String b;

    double num1 = 0, num2 = 0;
    String result;

    char operator;

    Color c1 = new Color(228, 228, 228);
    Color c2 = new Color(156, 156, 156);
    Color c4 = new Color(243, 243, 243);

    Border one = BorderFactory.createEtchedBorder();
    Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);
    Border three = BorderFactory.createMatteBorder(4, 4, 4, 4, c4);

    // create font
    Font myFont = new Font("Arial", Font.BOLD, 16);
    Font myFont1 = new Font("Arial", Font.BOLD, 12);
    Font myFont2 = new Font("Arial", Font.BOLD, 24);

    public BinaryArithmetic() {
        binarySub = new JButton("-");
        binaryDiv = new JButton("/");
        binaryMul = new JButton("*");
        binaryAdd = new JButton("+");
        btnClear = new JButton("C");
        btnEqual = new JButton("=");
        btnDel = new JButton("Delete");

        functionBtn[0] = binaryAdd;
        functionBtn[1] = binarySub;
        functionBtn[2] = binaryMul;
        functionBtn[3] = binaryDiv;
        functionBtn[4] = btnClear;
        functionBtn[5] = btnEqual;
        functionBtn[6] = btnDel;

        // loop of function button
        for (int i = 0; i < 7; i++) {
            functionBtn[i].addActionListener(this);
            functionBtn[i].setFocusable(false);
            functionBtn[i].setFont(myFont);
            functionBtn[i].setBorder(BorderFactory.createCompoundBorder(one, two));
            functionBtn[i].setBackground(c1);
        }

        // loop of number button
        for (int i = 0; i < 2; i++) {
            numBtn[i] = new JButton(String.valueOf(i));
            numBtn[i].addActionListener(this);
            numBtn[i].setFocusable(false);
            numBtn[i].setFont(myFont);
            numBtn[i].setBorder(BorderFactory.createCompoundBorder(one, three));
            numBtn[i].setBackground(c4);
        }

        // create text field
        textField = new JTextField();
        textField2 = new JTextField();

        // create panel
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel(new GridLayout(3, 3, 20, 20));

        panel1.setPreferredSize(new Dimension(600, 50));
        panel2.setPreferredSize(new Dimension(600, 25));
        panel3.setPreferredSize(new Dimension(600, 500));
        textField.setPreferredSize(new Dimension(600, 150));
        textField.setBackground(c4);
        textField.setFont(myFont2);
        panel2.setBackground(c4);
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField2.setPreferredSize(new Dimension(600, 50));
        textField2.setBorder(BorderFactory.createEmptyBorder());
        textField2.setBackground(c4);
        textField2.setFont(myFont);
        textField2.setHorizontalAlignment(JTextField.RIGHT);

        // add button to panel
        panel3.add(functionBtn[0]);
        panel3.add(functionBtn[1]);
        panel3.add(functionBtn[2]);
        panel3.add(numBtn[0]);
        panel3.add(numBtn[1]);
        panel3.add(functionBtn[3]);
        panel3.add(functionBtn[6]);
        panel3.add(functionBtn[5]);
        panel3.add(functionBtn[4]);

        // set
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(650, 550));

        this.add(panel2);
        this.add(textField2);
        this.add(textField);
        this.add(panel3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 2; i++) {
            if (e.getSource() == numBtn[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
                textField2.setText(textField2.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == binaryAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" + "));
        }
        if (e.getSource() == binarySub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" - "));
        }
        if (e.getSource() == binaryMul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" * "));
        }
        if (e.getSource() == binaryDiv) {
            num1 = (Double.parseDouble(textField.getText()));
            operator = '/';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" / "));
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
        if (e.getSource() == btnEqual) {

            try {
                num2 = Double.parseDouble(textField.getText());
            } catch (NumberFormatException j) {
                JOptionPane.showMessageDialog(null,
                        "Error: please input the second integer");
            }

            switch (operator) {
                case '+':
                    result = BinaryArithmeticP.binaryAdd(num1, num2);
                    break;
                case '-':
                    result = BinaryArithmeticP.binarySub(num1, num2);
                    break;
                case '*':
                    result = BinaryArithmeticP.binnaryMultiply(num1, num2);
                    break;
                case '/':
                    result = BinaryArithmeticP.binaryDivide(num1, num2);
                    break;
            }
            textField.setText(String.valueOf(" = " + result));
        }
        if (e.getSource() == btnClear) {
            textField.setText("");
            textField2.setText("");
        }

    }// end Action listener

    /**
     * BinaryArithmeticP is a class that consist of wide ranges of methods to
     * perform binary arithmetic operation.
     */
    public class BinaryArithmeticP {

        /*-------------------------- add ------------------------------------------------------------*/
        static String binaryAdd(double a, double b) {
            int a1 = (int) a;
            int b1 = (int) b;
            String s1 = Integer.toString(a1);
            String s2 = Integer.toString(b1);
            int number0 = Integer.parseInt(s1, 2);
            int number1 = Integer.parseInt(s2, 2);

            int sum = number0 + number1;
            String s3 = Integer.toBinaryString(sum);

            return s3;
        }
        /*-------------------------------multiply-------------------------------------------------------*/

        static String binnaryMultiply(double a, double b) {
            int a1 = (int) a;
            int b1 = (int) b;
            String s1 = Integer.toString(a1);
            String s2 = Integer.toString(b1);
            int number0 = Integer.parseInt(s1, 2);
            int number1 = Integer.parseInt(s2, 2);

            int sum = number0 * number1;
            String s3 = Integer.toBinaryString(sum);

            return s3;
        }
        /*----------------------------------------substraction----------------------------------------------*/

        static String binarySub(double a, double b) {
            int a1 = (int) a;
            int b1 = (int) b;
            String s1 = Integer.toString(a1);
            String s2 = Integer.toString(b1);
            int number0 = Integer.parseInt(s1, 2);
            int number1 = Integer.parseInt(s2, 2);

            int sum = number0 - number1;
            String s3 = Integer.toBinaryString(sum);

            return s3;
        }
        /*----------------------------------------substraction----------------------------------------------*/

        static String binaryDivide(double a, double b) {
            int a1 = (int) a;
            int b1 = (int) b;
            String s1 = Integer.toString(a1);
            String s2 = Integer.toString(b1);
            int number0 = Integer.parseInt(s1, 2);
            int number1 = Integer.parseInt(s2, 2);

            int sum = number0 / number1;
            String s3 = Integer.toBinaryString(sum);

            return s3;
        }

    }

}
