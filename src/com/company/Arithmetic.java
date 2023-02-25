package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arithmetic extends JPanel implements ActionListener {
    JButton[] numBtn = new JButton[10];
    JButton[] functionBtn = new JButton[20];
    JButton btnC, btnEqual, btnSum, btnDivide,
            btnModulo, btnSub, btnMul, btnDot, btnSr,
            btnPower, btnCubr, mulSr, mulX, btnDel,
            sin2Degree, cos2Degree, tan2Degree, sin2Radian,
            cos2Radian, tan2Radian;
    protected JTextField textField, textField2;
    protected JPanel panel1, panel2, panel3;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Color c1 = new Color(228, 228, 228);
    Color c2 = new Color(156, 156, 156);
    Color c4 = new Color(245, 245, 245);

    Border one = BorderFactory.createEtchedBorder();
    Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);
    Border three = BorderFactory.createMatteBorder(4, 4, 4, 4, c4);

    Font myFont = new Font("Arial", Font.BOLD, 16);
    Font myFont1 = new Font("Arial", Font.BOLD, 14);
    Font myFont2 = new Font("Arial", Font.BOLD, 24);
    Font myFont3 = new Font("Arial", Font.BOLD, 16);

    public Arithmetic() {
        btnC = new JButton("C");
        btnDot = new JButton(".");
        btnEqual = new JButton("=");
        btnSum = new JButton("+");
        btnDivide = new JButton("/");
        btnSub = new JButton("-");
        btnModulo = new JButton("%");
        btnMul = new JButton("*");
        btnSr = new JButton("√X");
        btnCubr = new JButton("X^3");
        btnPower = new JButton("X^2");
        mulSr = new JButton("1/X^2");
        mulX = new JButton("1/X");
        btnDel = new JButton("Delete");
        sin2Degree = new JButton("Sind");
        cos2Degree = new JButton("Cosd");
        tan2Degree = new JButton("Tand");
        sin2Radian = new JButton("Sin");
        cos2Radian = new JButton("Cos");
        tan2Radian = new JButton("Tan");

        functionBtn[0] = btnC;
        functionBtn[1] = btnDot;
        functionBtn[2] = btnEqual;
        functionBtn[3] = btnSum;
        functionBtn[4] = btnDivide;
        functionBtn[5] = btnSub;
        functionBtn[6] = btnModulo;
        functionBtn[7] = btnMul;
        functionBtn[8] = btnSr;
        functionBtn[9] = btnCubr;
        functionBtn[10] = btnPower;
        functionBtn[11] = mulX;
        functionBtn[12] = mulSr;
        functionBtn[13] = btnDel;
        functionBtn[14] = sin2Degree;
        functionBtn[15] = cos2Degree;
        functionBtn[16] = sin2Radian;
        functionBtn[17] = cos2Radian;
        functionBtn[18] = tan2Radian;
        functionBtn[19] = tan2Degree;

        // loop of function button
        for (int i = 0; i < 20; i++) {
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
        panel3 = new JPanel(new GridLayout(6, 4, 15, 10));

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
        panel3.add(functionBtn[14]);
        panel3.add(functionBtn[8]);
        panel3.add(functionBtn[10]);
        panel3.add(functionBtn[9]);
        panel3.add(functionBtn[0]);
        panel3.add(functionBtn[15]);
        panel3.add(functionBtn[11]);
        panel3.add(functionBtn[12]);
        panel3.add(functionBtn[13]);
        panel3.add(functionBtn[3]);
        panel3.add(functionBtn[19]);
        panel3.add(numBtn[1]);
        panel3.add(numBtn[2]);
        panel3.add(numBtn[3]);
        panel3.add(functionBtn[7]);
        panel3.add(functionBtn[16]);
        panel3.add(numBtn[4]);
        panel3.add(numBtn[5]);
        panel3.add(numBtn[6]);
        panel3.add(functionBtn[5]);
        panel3.add(functionBtn[17]);
        panel3.add(numBtn[7]);
        panel3.add(numBtn[8]);
        panel3.add(numBtn[9]);
        panel3.add(functionBtn[4]);
        panel3.add(functionBtn[18]);
        panel3.add(functionBtn[1]);
        panel3.add(numBtn[0]);
        panel3.add(functionBtn[2]);
        panel3.add(functionBtn[6]);

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
        if (e.getSource() == btnSum) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" + "));
        }
        if (e.getSource() == btnSub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" - "));
        }
        if (e.getSource() == btnMul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" * "));
        }
        if (e.getSource() == btnDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" / "));
        }
        if (e.getSource() == btnModulo) {
            num1 = Double.parseDouble(textField.getText());
            operator = '%';
            textField.setText("");
            textField2.setText(textField2.getText().concat(" % "));
        }
        if (e.getSource() == btnPower) {
            num1 = Double.parseDouble(textField.getText());
            // operator = 'X';
            result = ArithmeticP.doublePower(num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == btnCubr) {
            num1 = Double.parseDouble(textField.getText());
            result = ArithmeticP.cubeRoot(num1);
            textField.setText("= " + result);

        }
        if (e.getSource() == btnSr) {
            num1 = Double.parseDouble(textField.getText());
            result = ArithmeticP.squareRoot(num1);
            textField.setText("= " + result);

        }
        if (e.getSource() == mulX) {
            num1 = Double.parseDouble(textField.getText());
            result = ArithmeticP.mulX(num1);
            textField.setText("= " + result);

        }
        if (e.getSource() == mulSr) {
            num1 = Double.parseDouble(textField.getText());
            result = ArithmeticP.mulSr(num1);
            textField.setText("= " + result);

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
        if (e.getSource() == sin2Degree) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.sind((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == cos2Degree) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.cosd((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == tan2Degree) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.tand((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == sin2Radian) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.sin((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == cos2Radian) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.cos((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == tan2Degree) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.tan((int) num1);
            textField.setText("= " + result);
        }
        if (e.getSource() == tan2Radian) {
            num1 = Double.parseDouble(textField.getText());
            result = Trigonometry.tan((int) num1);
            textField.setText("= " + result);
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
                    result = ArithmeticP.sum(num1, num2);
                    break;
                case '-':
                    result = ArithmeticP.minus(num1, num2);
                    break;
                case '*':
                    result = ArithmeticP.multiply(num1, num2);
                    break;
                case '/':
                    result = ArithmeticP.divide(num1, num2);
                    break;
                case '%':
                    result = ArithmeticP.modulo(num1, num2);
                    break;
            }
            textField.setText(String.valueOf("= " + result));
            num1 = result;
        }
        if (e.getSource() == btnC) {
            textField.setText("");
            textField2.setText("");
        }

    }// end Action listener

    /**
     * Arithmetic class is a class that calculate sum, minus, multiply, divide,
     * modulo two integer.
     */
    public class ArithmeticP {
        /**
         * calculate sum two integer
         * 
         * @param a value of first integer
         * @param b value of second integer
         * @return to integer
         */
        public static Double sum(Double a, Double b) {// static function
            return a + b;
        }

        /**
         * calculate minus two integer
         * 
         * @param a value of first integer
         * @param b value of second integer
         * @return to integer
         */
        public static Double minus(Double a, Double b) {// static function
            return a - b;
        }

        /**
         * calculate multiply two integer
         * 
         * @param a value of first integer
         * @param b value of second integer
         * @return to integer
         */
        public static Double multiply(Double a, Double b) {// static function
            return a * b;
        }

        /**
         * calculate divide two integer
         * 
         * @param a value of first integer
         * @param b value of second integer
         * @return to integer
         */
        public static Double divide(Double a, Double b) {// static function
            return a / b;
        }

        /**
         * calculate modulo two integer
         * 
         * @param a value of first integer
         * @param b value of second integer
         * @return to integer
         */
        public static Double modulo(Double a, Double b) {// static function
            return a % b;
        }

        /**
         * calculate double power
         * 
         * @param a value of first integer
         * @return to integer
         */
        public static Double doublePower(Double a) {// static function
            return Math.pow(a, 2);
        }

        /**
         * calculate cube root
         *
         * @param a value of first integer
         * @return to integer
         */
        public static Double cubePower(Double a) {// static function
            return Math.pow(a, 3);
        }

        /**
         * calculate square root
         * 
         * @param a value of first integer
         * @return to integer
         */
        public static Double squareRoot(Double a) {// static function
            return Math.sqrt(a);
        }

        /**
         * calculate cube root
         * 
         * @param a value of first integer
         * @return to integer
         */
        public static Double mulX(Double a) {// static function
            return 1 / a;
        }

        /**
         * calculate cube root
         *
         * @param a value of first integer
         * @return to integer
         */
        public static Double mulSr(Double a) {// static function
            return 1 / (Math.pow(a, 2));
        }

        /**
         * calculate cube root
         *
         * @param a value of first integer
         * @return to integer
         */
        public static Double mulX3(Double a) {// static function
            return 1 / (Math.pow(a, 3));
        }

        /**
         * calculate cube root
         *
         * @param a value of first integer
         * @return to integer
         */
        public static Double cubeRoot(Double a) {// static function
            return Math.pow(a, 3);
        }

    }

    /**
     * Trigonometry class is a class that calculate or transfer trigonometric value
     */
    public class Trigonometry {
        /**
         * Convert sin to radian
         * 
         * @param radian value of degree convert to radian
         * @return to radian
         */
        public static float sin(float radian) {
            return (float) (Math.sin(radian));
        }

        /**
         * Convert sin to degree
         * 
         * @param degree value of radian convert to degree
         * @return to degree
         */
        public static float sind(int degree) {
            return (float) (Math.sin(degree2Radian(degree)));
        }

        /**
         * Convert cos to radian
         * 
         * @param radian value of degree convert to radian
         * @return to radian
         */
        public static float cos(float radian) {
            return (float) (Math.cos(radian));
        }

        /**
         * Convert cos to degree
         * 
         * @param degree value of radian convert to degree
         * @return to degree
         */
        public static float cosd(int degree) {
            return (float) (Math.cos(degree2Radian(degree)));
        }

        /**
         * Convert tan to radian
         * 
         * @param radian value of degree convert to radian
         * @return to radian
         */
        public static float tan(float radian) {
            return (float) (Math.tan(radian));
        }

        /**
         * Convert tan to degree
         * 
         * @param degree value of radian convert to degree
         * @return to degree
         */
        public static float tand(int degree) {
            return (float) (Math.tan(degree2Radian(degree)));
        }

        /**
         * Calculate square2
         * 
         * @param x value of integer to make twice multiply
         * @return to integer
         */
        public static long square2(long x) {
            return (x * x);
        }

        /**
         * Calculate square2 in floating-point
         * 
         * @param x value of integer to make twice multiply of floating-point
         * @return to floating-point
         */
        public static double square2(double x) {
            return (x * x);
        }

        /**
         * Calculate square3
         * 
         * @param x value of integer to make third multiply
         * @return to integer
         */
        public static long square3(long x) {
            return (x * x * x);
        }

        /**
         * Calculate square3
         * 
         * @param x value of integer to make third multiply of floating-point
         * @return to floating_point
         */
        public static double square3(double x) {
            return (x * x * x);
        }

        /**
         * Convert degree to radian
         * 
         * @param x valoue of degree that convert to radian
         * @return to radian
         */
        public static double degree2Radian(double x) {
            return (float) (x * Math.PI / 180);
        }
    }

}
