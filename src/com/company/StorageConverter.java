package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StorageConverter extends JPanel implements ActionListener {
    JButton[] numBtn = new JButton[10];
    JButton[] functionBtn = new JButton[10];
    JButton btnCancel, btnDel, btnDot, btnConvert,
            bytes, kiloByte, megaByte, gigaByte,
            teraByte, petaByte;
    protected JTextField textField;
    protected JTextArea textArea;
    protected JPanel panel1, panel2, panel3;
    double num1 = 0, num2 = 0, result = 0;
    double result1 = 0;
    double result2 = 0;
    double result3 = 0;
    double result4 = 0;
    double result5 = 0;
    double result6 = 0;

    Color c1 = new Color(228, 228, 228);
    Color c2 = new Color(156, 156, 156);
    Color c4 = new Color(245, 245, 245);

    Border one = BorderFactory.createEtchedBorder();
    Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);
    Border three = BorderFactory.createMatteBorder(4, 4, 4, 4, c4);

    Font myFont = new Font("Arial", Font.BOLD, 16);
    Font myFont1 = new Font("Arial", Font.BOLD, 14);
    Font myFont2 = new Font("Arial", Font.BOLD, 24);
    Font myFont3 = new Font("SansSerif", Font.BOLD, 16);

    public StorageConverter() {
        btnCancel = new JButton("C");
        btnDot = new JButton(".");
        btnDel = new JButton("Delete");
        btnConvert = new JButton("Convert");
        bytes = new JButton("Byte");
        kiloByte = new JButton("Kilo Byte");
        megaByte = new JButton("Mega Byte");
        gigaByte = new JButton("Giga Byte");
        teraByte = new JButton("Tera Byte");
        petaByte = new JButton("Peta Byte");

        functionBtn[0] = btnCancel;
        functionBtn[1] = btnDot;
        functionBtn[2] = btnDel;
        functionBtn[3] = btnCancel;
        functionBtn[4] = bytes;
        functionBtn[5] = kiloByte;
        functionBtn[6] = megaByte;
        functionBtn[7] = gigaByte;
        functionBtn[8] = teraByte;
        functionBtn[9] = petaByte;

        // loop of function button
        for (int i = 0; i < 10; i++) {
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
        panel3 = new JPanel(new GridLayout(6, 4, 15, 10));

        // set text
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
        panel3.add(functionBtn[8]);
        panel3.add(functionBtn[9]);
        panel3.add(functionBtn[6]);

        panel3.add(functionBtn[2]);
        panel3.add(functionBtn[3]);
        panel3.add(numBtn[1]);
        panel3.add(numBtn[2]);
        panel3.add(numBtn[3]);
        panel3.add(functionBtn[7]);
        panel3.add(numBtn[4]);
        panel3.add(numBtn[5]);
        panel3.add(numBtn[6]);
        panel3.add(functionBtn[5]);
        panel3.add(numBtn[7]);
        panel3.add(numBtn[8]);
        panel3.add(numBtn[9]);
        panel3.add(functionBtn[4]);
        panel3.add(functionBtn[1]);
        panel3.add(numBtn[0]);
        panel3.add(functionBtn[0]);

        // adding
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(650, 550));
        this.add(textArea);
        this.add(textField);
        this.add(panel3);

    }

    /**
     * actionPerformed function to perform
     * 
     * @param e paramater
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtn[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == btnDot) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == bytes) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = Byte2Byte(num1);
            result2 = Byte2KiloByte(num1);
            result3 = Byte2MegaByte(num1);
            result4 = Byte2GigaByte(num1);
            result5 = Byte2TeraByte(num1);
            result6 = Byte2PetaByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " byte equal to : \n\n"
                    + "=>" + " Kilobyte = " + result2 + "\n"
                    + "=>" + " Megabyte = " + result3 + "\n"
                    + "=>" + " Gigabyte = " + result4 + "\n"
                    + "=>" + " Terabyte = " + result5 + "\n"
                    + "=>" + " Perabyte = " + result6 + "\n");
        }
        if (e.getSource() == kiloByte) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = Kilo2Kilo(num1);
            result2 = Kilo2Byte(num1);
            result3 = Kilo2MegaByte(num1);
            result4 = Kilo2GigByte(num1);
            result5 = Kilo2TeraByte(num1);
            result6 = Kilo2PetaByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " kilobyte equal to : \n\n"
                    + "=>" + " byte = " + result2 + "\n"
                    + "=>" + " Megabyte = " + result3 + "\n"
                    + "=>" + " Gigabyte = " + result4 + "\n"
                    + "=>" + " Terabyte = " + result5 + "\n"
                    + "=>" + " Perabyte = " + result6 + "\n");
        }
        if (e.getSource() == megaByte) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = MegaByte2MegaByte(num1);
            result2 = MegaByte2Byte(num1);
            result3 = MegaByte2KiloByte(num1);
            result4 = MegaByte2GigaByte(num1);
            result5 = MegaByte2PetaByte(num1);
            result6 = MegaByte2PetaByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " megabyte equal to : \n\n"
                    + "=>" + " byte = " + result2 + "\n"
                    + "=>" + " Kilobyte = " + result3 + "\n"
                    + "=>" + " Gigabyte = " + result4 + "\n"
                    + "=>" + " Terabyte = " + result5 + "\n"
                    + "=>" + " Perabyte = " + result6 + "\n");
        }
        if (e.getSource() == gigaByte) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = GigaByte2GigaByte(num1);
            result2 = GigaByte2Byte(num1);
            result3 = GigaByte2KiloByte(num1);
            result4 = GigaByte2MegaByte(num1);
            result5 = GigaByte2TeraByte(num1);
            result6 = GigaByte2TeraByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " gigabyte equal to : \n\n"
                    + "=>" + " byte = " + result2 + "\n"
                    + "=>" + " Kilobyte = " + result3 + "\n"
                    + "=>" + " Megabyte = " + result4 + "\n"
                    + "=>" + " Terabyte = " + result5 + "\n"
                    + "=>" + " Perabyte = " + result6 + "\n");
        }
        if (e.getSource() == teraByte) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = TeraByte2TeraByte(num1);
            result2 = TeraByte2Byte(num1);
            result3 = TeraByte2KiloByte(num1);
            result4 = TeraByte2MegaByte(num1);
            result5 = TeraByte2GigaByte(num1);
            result6 = TeraByte2PetaByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " terabyte equal to : \n\n"
                    + "=>" + " byte = " + result2 + "\n"
                    + "=>" + " Kilobyte = " + result3 + "\n"
                    + "=>" + " Megabyte = " + result4 + "\n"
                    + "=>" + " Gigabyte = " + result5 + "\n"
                    + "=>" + " Perabyte = " + result6 + "\n");
        }
        if (e.getSource() == petaByte) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");

            result1 = PetaByte2PetaByte(num1);
            result2 = PetaByte2Byte(num1);
            result3 = PetaByte2KiloByte(num1);
            result4 = PetaByte2MegaByte(num1);
            result5 = PetaByte2Gigabyte(num1);
            result6 = PetaByte2TeraByte(num1);

            textArea.setText(textArea.getText()
                    + "For " + result1 + " petabyte equal to : \n\n"
                    + "=>" + " byte = " + result2 + "\n"
                    + "=>" + " Kilobyte = " + result3 + "\n"
                    + "=>" + " Megabyte = " + result4 + "\n"
                    + "=>" + " Gigabyte = " + result5 + "\n"
                    + "=>" + " Terabyte = " + result6 + "\n");
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

    }// end Action listener

    // Programs of Storage Convverter calculate
    public double Byte2Byte(Double number) {
        result = number / Math.pow(1024, 0);
        return result;
    }

    public double Byte2KiloByte(Double number) {
        result = number / Math.pow(1024, 1);
        return result;
    }

    public double Byte2MegaByte(Double number) {
        result = number / Math.pow(1024, 2);
        return result;
    }

    public double Byte2GigaByte(Double number) {
        result = number / Math.pow(1024, 3);
        return result;
    }

    public double Byte2TeraByte(Double number) {
        result = number / Math.pow(1023, 4);
        return result;
    }

    public double Byte2PetaByte(Double number) {
        result = number / Math.pow(1024, 5);
        return result;
    }

    public double Kilo2Byte(Double number) {
        result = number * 1024;
        return result;
    }

    public double Kilo2Kilo(Double number) {
        result = number;
        return result;
    }

    public double Kilo2MegaByte(Double number) {
        result = number / 1024;
        return result;
    }

    public double Kilo2GigByte(Double number) {
        result = number / Math.pow(1024, 2);
        return result;
    }

    public double Kilo2TeraByte(Double number) {
        result = number / Math.pow(1024, 3);
        return result;
    }

    public double Kilo2PetaByte(Double number) {
        result = number / Math.pow(1025, 4);
        return result;
    }

    public double MegaByte2Byte(Double number) {
        result = number * Math.pow(1024, 2);
        return result;
    }

    public double MegaByte2KiloByte(Double number) {
        result = number * Math.pow(1024, 1);
        return result;
    }

    public double MegaByte2MegaByte(Double number) {
        result = number;
        return result;
    }

    public double MegaByte2GigaByte(Double number) {
        result = number / 1024;
        return result;
    }

    public double MegaByte2TeraByte(Double number) {
        result = number / Math.pow(1024, 2);
        return result;
    }

    public double MegaByte2PetaByte(Double number) {
        result = number / Math.pow(1024, 3);
        return result;
    }

    public double GigaByte2Byte(Double number) {
        result = number * Math.pow(1024, 3);
        return result;
    }

    public double GigaByte2KiloByte(Double number) {
        result = number * Math.pow(1024, 2);
        return result;
    }

    public double GigaByte2MegaByte(Double number) {
        result = number * Math.pow(1024, 1);
        return result;
    }

    public double GigaByte2GigaByte(Double number) {
        result = number;
        return result;
    }

    public double GigaByte2TeraByte(Double number) {
        result = number / 1024;
        return result;
    }

    public double GigaByte2PetaByte(Double number) {
        result = number / Math.pow(1024, 2);
        return result;
    }

    public double TeraByte2Byte(Double number) {
        result = number * Math.pow(1024, 4);
        return result;
    }

    public double TeraByte2KiloByte(Double number) {
        result = number * Math.pow(1024, 3);
        return result;
    }

    public double TeraByte2MegaByte(Double number) {
        result = number * Math.pow(1024, 2);
        return result;
    }

    public double TeraByte2GigaByte(Double number) {
        result = number * Math.pow(1024, 1);
        return result;
    }

    public double TeraByte2TeraByte(Double number) {
        result = number;
        return result;
    }

    public double TeraByte2PetaByte(Double number) {
        result = number / 1024;
        return result;
    }

    public double PetaByte2Byte(Double number) {
        result = number * Math.pow(1024, 5);
        return result;
    }

    public double PetaByte2KiloByte(Double number) {
        result = number * Math.pow(1024, 4);
        return result;
    }

    public double PetaByte2MegaByte(Double number) {
        result = number * Math.pow(1024, 3);
        return result;
    }

    public double PetaByte2Gigabyte(Double number) {
        result = number * Math.pow(1024, 2);
        return result;
    }

    public double PetaByte2TeraByte(Double number) {
        result = number * 1024;
        return result;
    }

    public double PetaByte2PetaByte(Double number) {
        result = number;
        return result;
    }

}// End Storage Converter class