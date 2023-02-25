package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyExchange extends JPanel implements ActionListener {
    JButton[] numBtn = new JButton[10];
    JButton[] functionBtn = new JButton[13];
    JButton rielToDolllar, rielToBaht, rielToFranc, rielToEuro,
            rielToPound, dollarToRiel, bahtToRiel, euroToRiel,
            francToRiel, poundToRiel, btnClear, btnDel, btnDot;
    protected JTextField textField, textField2;
    protected JPanel panel1, panel2, panel3;
    int num1 = 0;
    float result = 0;
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

    public MoneyExchange() {
        btnClear = new JButton("C");
        btnDot = new JButton(".");
        btnDel = new JButton("Delete");
        rielToBaht = new JButton("Riel to Baht");
        rielToDolllar = new JButton("Riel to Dolllar");
        rielToEuro = new JButton("Riel to Euro");
        rielToFranc = new JButton("Riel to Franc");
        rielToPound = new JButton("Riel to Pound");
        poundToRiel = new JButton("Pound to Riel");
        dollarToRiel = new JButton("Dollar to Riel");
        euroToRiel = new JButton("Euro to Riel");
        bahtToRiel = new JButton("Baht to Riel");
        francToRiel = new JButton("Franc to Riel");

        functionBtn[0] = btnClear;
        functionBtn[1] = btnDot;
        functionBtn[2] = btnDel;
        functionBtn[3] = rielToBaht;
        functionBtn[4] = rielToDolllar;
        functionBtn[5] = rielToEuro;
        functionBtn[6] = rielToFranc;
        functionBtn[7] = rielToPound;
        functionBtn[8] = dollarToRiel;
        functionBtn[9] = poundToRiel;
        functionBtn[10] = bahtToRiel;
        functionBtn[11] = euroToRiel;
        functionBtn[12] = francToRiel;

        // loop of function button
        for (int i = 0; i < 13; i++) {
            functionBtn[i].addActionListener(this);
            functionBtn[i].setFocusable(false);
            functionBtn[i].setFont(myFont1);
            functionBtn[i].setBorder(BorderFactory.createCompoundBorder(one, two));
            functionBtn[i].setBackground(c1);
        }

        // loop of number button
        for (int i = 0; i < 10; i++) {
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
        panel3 = new JPanel(new GridLayout(6, 4, 10, 10));

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
        textField2.setFont(myFont);
        textField2.setHorizontalAlignment(JTextField.RIGHT);

        // add button to panel
        panel3.add(functionBtn[3]);
        panel3.add(functionBtn[4]);
        panel3.add(functionBtn[5]);
        panel3.add(functionBtn[6]);
        panel3.add(functionBtn[7]);
        panel3.add(functionBtn[8]);
        panel3.add(functionBtn[9]);
        panel3.add(functionBtn[10]);
        panel3.add(numBtn[1]);
        panel3.add(numBtn[2]);
        panel3.add(numBtn[3]);
        panel3.add(functionBtn[11]);

        panel3.add(numBtn[4]);
        panel3.add(numBtn[5]);
        panel3.add(numBtn[6]);
        panel3.add(functionBtn[12]);
        panel3.add(numBtn[7]);
        panel3.add(numBtn[8]);
        panel3.add(numBtn[9]);
        panel3.add(functionBtn[0]);
        panel3.add(functionBtn[1]);
        panel3.add(numBtn[0]);
        panel3.add(functionBtn[2]);

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
        if (e.getSource() == rielToBaht) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.riel2baht(num1);
            textField.setText(textField.getText().concat(" riel = " + result + " baht "));
        }
        if (e.getSource() == rielToDolllar) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.riel2dollar(num1);
            textField.setText(textField.getText().concat(" riel = " + result + " $ "));
        }
        if (e.getSource() == rielToEuro) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.riel2euro(num1);
            textField.setText(textField.getText().concat(" riel = " + result + " € "));
        }
        if (e.getSource() == rielToFranc) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.riel2franc(num1);
            textField.setText(textField.getText().concat(" riel = " + result + " ₣ "));
        }
        if (e.getSource() == rielToPound) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.riel2pound(num1);
            textField.setText(textField.getText().concat(" riel = " + result + " £ "));
        }
        if (e.getSource() == poundToRiel) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.pound2riel(num1);
            textField.setText(textField.getText().concat(" £ = " + result + " riel "));
        }
        if (e.getSource() == dollarToRiel) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.dollar2riel(num1);
            textField.setText(textField.getText().concat(" $ = " + result + " riel "));
        }
        if (e.getSource() == euroToRiel) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.euro2riel(num1);
            textField.setText(textField.getText().concat(" € = " + result + " riel "));
        }
        if (e.getSource() == bahtToRiel) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.baht2riel(num1);
            textField.setText(textField.getText().concat(" baht = " + result + " riel "));
        }
        if (e.getSource() == francToRiel) {
            num1 = (int) Double.parseDouble(textField.getText());
            result = MoneyExchangeP.franc2riel(num1);
            textField.setText(textField.getText().concat(" ₣ = " + result + " riel "));
        }
        if (e.getSource() == btnClear) {
            textField2.setText("");
            textField.setText("");
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

    }// end Action listener

    /**
     * Money exchange class is a class that have many method to exchange money prize
     * from other country to other country.
     */
    public class MoneyExchangeP {
        /**
         * Exchange money from riel to dollar
         * 
         * @param a value of the money that want to exchange
         * @return to dollar
         */
        public static float riel2dollar(float a) {
            return a / 4000;
        }

        /**
         * Exchange money from riel to euro
         * 
         * @param a value of the money that want to exchange
         * @return to euro
         */
        public static float riel2euro(float a) {
            return a / 4600;
        }

        /**
         * Exchange money from riel to franc
         * 
         * @param a value of the money that want to exchange
         * @return to franc
         */
        public static float riel2franc(float a) {
            return a / 4400;
        }

        /**
         * Exchange money from riel to pound
         * 
         * @param a value of the money that want to exchange
         * @return to pound
         */
        public static float riel2pound(float a) {
            return a / 5500;
        }

        /**
         * Exchange money from riel to baht
         * 
         * @param a value of the money that want to exchange
         * @return baht
         */
        public static float riel2baht(float a) {
            return a / 100;
        }

        /**
         * Exchange money from dollar to riel
         * 
         * @param a value of the money that want to exchange
         * @return to riel
         */
        public static float dollar2riel(float a) {
            return a * 4000;
        }

        /**
         * Exchange money from euro to riel
         * 
         * @param a value of the money that want to exchange
         * @return riel
         */
        public static float euro2riel(float a) {
            return a * 4600;
        }

        /**
         * Exchange money from franc to riel
         * 
         * @param a value of the money that want to exchange
         * @return to riel
         */
        public static float franc2riel(float a) {
            return a * 4400;
        }

        /**
         * Exchange money from pound to riel
         * 
         * @param a value of the money that want to exchange
         * @return to riel
         */
        public static float pound2riel(float a) {
            return a * 5500;
        }

        /**
         * Exchange money from baht to riel
         * 
         * @param a value of the money that want to exchange
         * @return to riel
         */
        public static float baht2riel(float a) {
            return a * 100;
        }
    }

}
