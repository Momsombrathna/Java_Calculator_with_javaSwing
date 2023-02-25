package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberSystemConversion extends JPanel implements ActionListener {
    JButton[] numBtn = new JButton[10];
    JButton[] functionBtn = new JButton[13];
    JButton btnCancel, btnDel, btnDot, binary, octal, hexadecimal, decimal, a, b, c, d, e, f;
    protected JTextField textField;
    protected JTextArea textArea;
    protected JPanel panel1, panel2, panel3;

    double num1 = 0;
    double result = 0;

    double result1 = 0;
    double result2 = 0;
    double result3 = 0;



    Color c1 = new Color(228, 228, 228);
    Color c2 = new Color(156, 156, 156);
    Color c4 = new Color(245, 245, 245);

    Border one = BorderFactory.createEtchedBorder();
    Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);
    Border three = BorderFactory.createMatteBorder(4, 4, 4, 4, c4);

    Font myFont = new Font("Arial", Font.BOLD, 16);
    Font myFont1 = new Font("Arial", Font.BOLD, 12);
    Font myFont2 = new Font("Arial", Font.BOLD, 24);
    Font myFont3 = new Font("SansSerif", Font.BOLD, 16);

    public NumberSystemConversion() {
        btnCancel = new JButton("Clear");
        btnDot = new JButton(".");
        btnDel = new JButton("Delete");
        binary = new JButton("Binary");
        octal = new JButton("Octal");
        hexadecimal = new JButton("Hexadeciaml");
        decimal = new JButton("Deciaml");
        a = new JButton("A");
        b = new JButton("B");
        c = new JButton("C");
        d = new JButton("D");
        e = new JButton("E");
        f = new JButton("F");

        functionBtn[0] = btnCancel;
        functionBtn[1] = btnDot;
        functionBtn[2] = btnDel;
        functionBtn[3] = binary;
        functionBtn[4] = octal;
        functionBtn[5] = hexadecimal;
        functionBtn[6] = a;
        functionBtn[7] = b;
        functionBtn[8] = c;
        functionBtn[9] = d;
        functionBtn[10] = e;
        functionBtn[11] = f;
        functionBtn[12] = decimal;

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
        textArea = new JTextArea();

        // create panel
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel(new GridLayout(6, 6, 10, 10));

        // set
        panel1.setPreferredSize(new Dimension(600, 50));
        panel2.setPreferredSize(new Dimension(600, 50));
        panel3.setPreferredSize(new Dimension(600, 500));
        textField.setPreferredSize(new Dimension(600, 25));
        textField.setBackground(c4);
        textField.setFont(myFont2);
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setHorizontalAlignment(JTextField.CENTER);
        textArea.setPreferredSize(new Dimension(600, 100));
        textArea.setBorder(BorderFactory.createEmptyBorder());
        textArea.setBackground(c4);
        textArea.setFont(myFont3);

        // add button to panel

        panel3.add(functionBtn[3]);
        panel3.add(functionBtn[4]);
        panel3.add(functionBtn[5]);
        panel3.add(functionBtn[12]);

        panel3.add(numBtn[1]);
        panel3.add(numBtn[2]);
        panel3.add(numBtn[3]);
        panel3.add(functionBtn[0]);




        panel3.add(numBtn[4]);
        panel3.add(numBtn[5]);
        panel3.add(numBtn[6]);
        panel3.add(functionBtn[6]);




        panel3.add(numBtn[7]);
        panel3.add(numBtn[8]);
        panel3.add(numBtn[9]);
        panel3.add(functionBtn[7]);

        panel3.add(functionBtn[1]);
        panel3.add(numBtn[0]);
        panel3.add(functionBtn[2]);
        panel3.add(functionBtn[8]);
        panel3.add(functionBtn[9]);
        panel3.add(functionBtn[10]);
        panel3.add(functionBtn[11]);



        // adding
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(650, 550));
        this.add(textArea);
        this.add(textField);
        this.add(panel3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtn[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
                textArea.setText(textArea.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == btnDot) {
            textField.setText(textField.getText().concat("."));
            textArea.setText(textArea.getText().concat("."));
        }
        if (e.getSource() == a) {
            textField.setText(textField.getText().concat("A"));
            textArea.setText(textArea.getText().concat("A"));
        }
        if (e.getSource() == b) {
            textField.setText(textField.getText().concat("B"));
            textArea.setText(textArea.getText().concat("B"));
        }
        if (e.getSource() == c) {
            textField.setText(textField.getText().concat("C"));
            textArea.setText(textArea.getText().concat("C"));
        }
        if (e.getSource() == d) {
            textField.setText(textField.getText().concat("D"));
            textArea.setText(textArea.getText().concat("D"));
        }
        if (e.getSource() == e) {
            textField.setText(textField.getText().concat("E"));
            textArea.setText(textArea.getText().concat("E"));
        }
        if (e.getSource() == f) {
            textField.setText(textField.getText().concat("F"));
            textArea.setText(textArea.getText().concat("F"));
        }
        if (e.getSource() == btnDel) {
            String string = textField.getText();
            textField.setText("");
            textArea.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
                textArea.setText(textArea.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == btnCancel) {
            textField.setText("");
            textArea.setText("");
        }

        if (e.getSource() == binary) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = binary2Decimal((int) num1);
            result2 = binary2Octal((int) num1);


            textArea.setText(textArea.getText()+
                     " of binary \n => in decimal is : "+result1 +"\n"
                    + " => in octal is : "+result2
            );
        }
        if (e.getSource() == octal) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = octal2Decimal((int) num1);

            textArea.setText(textArea.getText()+
                    " of octal \n => in decimal is : "+result1 +"\n"
            );
        }
        if (e.getSource() == hexadecimal) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = hex2Decimal(String.valueOf(num1));

            textArea.setText(textArea.getText()+
                    " of hexadecimal \n => in decimal is : "+result1 +"\n"
            );
        }
        if (e.getSource() == decimal) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = decimal2Binary((int) num1);
            result2 = decimal2Octal((int) num1);

            textArea.setText(textArea.getText()+
                    " of decimal \n => in binary is : "+result1 +"\n"
                    + " => in octal is : "+result2
            );
        }


    }// End Action Listener

        /**
         * Convert from Binary to Decimal
         * @param binary the binary number that want convert to decimal number
         * @return to decimal number
         */
        public static int binary2Decimal(int binary) {
            int decimal = 0;
            int n = 0;
            while (true) {
                if (binary == 0) {
                    break;
                } else {
                    int temp = binary % 10;
                    decimal += temp * Math.pow(2, n);
                    binary = binary / 10;
                    n++;
                }
            }
            return decimal;
        }

        /**
         * Convert from binary to octal
         * @param binary the binary number that want convert to octal number
         * @return to octal number
         */
        public static int binary2Octal(int binary) {
            // declare variables
            int octal = 0;
            int remainder = 0;
            int multiplier = 0;
            int i = 0;

            while (binary2Decimal(binary) != 0) {
                // find remainder after
                // dividing by 8
                remainder = binary2Decimal(binary) % 8;

                // calculate multiplier value
                multiplier = (int) Math.pow(10, i);

                // increase octal value
                octal += (remainder * multiplier);
                // divide decimal value by 8
                binary = binary2Decimal(binary) / 8;

                // increase i value by 1
                i++;
            }
            return octal;
        }

        /**
         * Convert from Binary to Decimal
         * @param binary the binary number that want convert to decimal number
         * @return to decimal number
         */
        public static String binary2Hexadecimal(int binary) {
            int rem;
            String hex = "";
            char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (binary2Decimal(binary) > 0) {
                rem = binary2Decimal(binary) % 16;
                hex = hexchars[rem] + hex;
                binary = binary2Decimal(binary) / 16;
            }
            return hex;
        }

        /**
         * Convert from Octal to Decimal
         * @param octal the octal number that want convert to decimal number
         * @return to decimal number
         */
        public static int octal2Decimal(int octal) {
            //Declaring variable to store decimal number
            int decimal = 0;
            //Declaring variable to use in power
            int n = 0;
            //writing logic
            while (true) {
                if (octal == 0) {
                    break;
                } else {
                    int temp = octal % 10;
                    decimal += temp * Math.pow(8, n);
                    octal = octal / 10;
                    n++;
                }
            }
            return decimal;
        }

        /**
         * Convert from Octal to Binary
         * @param octal the octal number that want convert to binary number
         * @return to binary number
         */
        public static String octal2Binary(int octal) {

            String b = "";
            int t = octal2Decimal(octal);
            //writing logic
            while (t > 0) {
                int r = t % 2;
                t = t / 2;
                b = r + b;
            }
            return b;
        }

        /**
         * Convert from Octal to hexadecimal
         * @param octal the octal number that want convert to hexadecimal number
         * @return to hexadecimal number
         */
        public static String octal2Hexadecimal(int octal) {
            int rem;
            String hexadecimal = "";
            char hex_chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (octal2Decimal(octal) > 0) {
                rem = octal2Decimal(octal) % 16;
                hexadecimal = hex_chars[rem] + hexadecimal;
                octal = octal2Decimal(octal) / 16;
            }
            return hexadecimal;
        }

        /**
         * Convert from decimal to binary
         *
         * @param decimal the decimal number that want convert to binary number
         * @return to binary number
         */
        public static int decimal2Binary(int decimal) {

            // To store the binary number
            int binary = 0;
            int cnt = 0;
            while (decimal != 0) {
                int rem = decimal % 2;
                double c = Math.pow(10, cnt);
                binary += rem * c;
                decimal /= 2;

                // Count used to store exponent value
                cnt++;
            }

            return binary;
        }

        /**
         * Convert from decimal to octal
         *
         * @param decimal the decimal number that want convert to octal number
         * @return to octal number
         */
        public static int decimal2Octal(int decimal) {
            // declare variables
            int octal = 0;
            int remainder = 0;
            int multiplier = 0;
            int i = 0;

            while (decimal != 0) {
                // find remainder after
                // dividing by 8
                remainder = decimal % 8;

                // calculate multiplier value
                multiplier = (int) Math.pow(10, i);

                // increase octal value
                octal += (remainder * multiplier);
                // divide decimal value by 8
                decimal = decimal / 8;

                // increase i value by 1
                i++;
            }
            return octal;
        }

        /**
         * Convert from Octal to hexadecimal
         *
         * @param decimal the decimal number that want convert to hexadecimal number
         * @return to hexadecimal number
         */
        public static String decimal2Hexadecimal(int decimal) {
            int rem;
            String hexadecimal = "";
            char hex_chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (decimal > 0) {
                rem = decimal % 16;
                hexadecimal = hex_chars[rem] + hexadecimal;
                decimal = decimal / 16;
            }
            return hexadecimal;
        }

        /**
         * Convert from hexadecimal to decimal
         * @param hex the hexadecimal number that want convert to decimal number
         * @return
         */
        public static int hex2Decimal(String hex) {
            // Storing the length of the
            int len = hex.length();

            // Initializing base value to 1, i.e 16^0
            int base = 1;

            // Initially declaring and initializing
            // decimal value to zero
            int dec_val = 0;

            // Extracting characters as
            // digits from last character

            for (int i = len - 1; i >= 0; i--) {

                // Condition check
                // Case 1
                // If character lies in '0'-'9', converting
                // it to integral 0-9 by subtracting 48 from
                // ASCII value
                if (hex.charAt(i) >= '0'
                        && hex.charAt(i) <= '9') {
                    dec_val += (hex.charAt(i) - 48) * base;

                    // Incrementing base by power
                    base = base * 16;
                }

                // Case 2
                // if case 1 is bypassed

                // Now, if character lies in 'A'-'F' ,
                // converting it to integral 10 - 15 by
                // subtracting 55 from ASCII value
                else if (hex.charAt(i) >= 'A'
                        && hex.charAt(i) <= 'F') {
                    dec_val += (hex.charAt(i) - 55) * base;

                    // Incrementing base by power
                    base = base * 16;
                }
            }
            return dec_val;
        }

        /**
         * Convert from hexadecimal to octal
         * @param hex the hexadecimal number that want convert to octal number
         * @return
         */
        public static String hex2Octal(String hex) {

            // declaring variable to store remainder
            int rem;
            // declareing variable to store octal
            String octal="";
            //declaring array of octal numbers
            char octalchars[]={'0','1','2','3','4','5','6','7'};
            //writing logic of decimal to octal conversion
            while(hex2Decimal(hex)>0)
            {
                rem = hex2Decimal(hex)%8;
                octal = octalchars[rem]+octal;
                hex = String.valueOf(hex2Decimal(hex)/8);
            }
            return octal;
        }
        /**
         * Convert from hexadecimal to binary
         * @param hex the hexadecimal number that want convert to binary number
         * @return to binary
         */
        public static String hex2Binary(String hex) {

            String b = "";
            int t = hex2Decimal(String.valueOf(hex));
            //writing logic
            while (t > 0) {
                int r = t % 2;
                t = t / 2;
                b = r + b;
            }
            return b;
        }

}
