package com.company;
// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

// class extends JFrame
public class ProgramGUI extends JPanel {

    // Declaration of objects
    // of CardLayout class.
    private CardLayout card;

    public ProgramGUI() {

        // JPanel frame = new JFrame();
        // frame.setSize(700, 500);
        // frame.setLocation(700, 100);

        // RGB color
        Color c1 = new Color(170, 170, 170);
        Color c2 = new Color(160, 160, 160);
        Color c3 = new Color(228, 228, 228);
        Color c4 = new Color(243, 243, 243);

        // Border Rounded
        Border one = BorderFactory.createEtchedBorder();
        Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c1);

        JPanel cardPanel = new JPanel();

        // Initialization of object "c1"
        // of CardLayout class.
        card = new CardLayout();

        // set the layout
        cardPanel.setLayout(card);
        cardPanel.setPreferredSize(new Dimension(750, 500));

        // ++++++++++++++++++++++JPanel Area++++++++++++++++++++++++++++++
        // Initialization of object
        // "jp1" of JPanel class.
        JPanel jp1 = new JPanel();

        // Initialization of object
        // "jp2" of CardLayout class.
        JPanel jp2 = new JPanel();

        // Initialization of object
        // "jp3" of CardLayout class.
        JPanel jp3 = new JPanel();

        // Initialization of object
        // "jp5" of CardLayout class.
        JPanel jp4 = new JPanel();

        // Initialization of object
        // "jp4" of CardLayout class.
        JPanel jp5 = new JPanel();

        // Initialization of object
        // "jp6" of CardLayout class.
        JPanel jp6 = new JPanel();

        // Initialization of object
        // "jp7" of CardLayout class.
        JPanel jp7 = new JPanel();

        // Set color background to panel1
        jp1.setBackground(c4);

        // Set color background to panel2
        jp2.setBackground(c4);

        // Set color background to panel3
        jp3.setBackground(c4);

        // Set color background to panel4
        jp4.setBackground(c4);

        // Set color background to panel5
        jp5.setBackground(c4);

        // Set color background to panel6
        jp6.setBackground(c4);

        // Set color background to panel7
        jp7.setBackground(c4);

        jp1.setLayout(new BoxLayout(jp1, BoxLayout.Y_AXIS));
        jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
        jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
        jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));
        // jp5.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
        jp6.setLayout(new BoxLayout(jp6, BoxLayout.Y_AXIS));
        jp7.setLayout(new BoxLayout(jp7, BoxLayout.Y_AXIS));

        // ++++++++++++++++++++++JLabel Area+++++++++++++++++++++++++++++++
        // Initialization of object
        // "jl1" of JLabel class.
        JLabel jl1 = new JLabel("Arithmetic and Trigono");

        // Initialization of object
        // "jl2" of JLabel class.
        JLabel jl2 = new JLabel("Bitwise");

        // Initialization of object
        // "jl3" of JLabel class.
        JLabel jl3 = new JLabel("Binary Arithmetic");

        // Initialization of object
        // "jl4" of JLabel class.
        JLabel jl4 = new JLabel("Money Exchange");

        // Initialization of object
        // "jl5" of JLabel class.
        // JLabel jl5 = new JLabel("Trigonometry");

        // Initialization of object
        // "jl6" of JLabel class.
        JLabel jl6 = new JLabel("Storage Converter");

        // Initialization of object
        // "jl7" of JLabel class.
        JLabel jl7 = new JLabel("Number System Conversion");

        // Adding JPanel "jp1" on JFrame.
        jp1.add(jl1, BorderLayout.NORTH);

        // Adding JPanel "jp2" on JFrame.
        jp2.add(jl2);

        // Adding JPanel "jp3" on JFrame.
        jp3.add(jl3);

        // Adding JPanel "jp4" on JFrame.
        jp4.add(jl4);

        // Adding JPanel "jp5" on JFrame.
        // jp5.add(jl5);

        // Adding JPanel "jp6" on JFrame.
        jp6.add(jl6);

        // Adding JPanel "jp7" on JFrame.
        jp7.add(jl7);

        // Adding the cardPanel on "jp1"
        cardPanel.add(jp1, "1");
        card.show(cardPanel, "1");

        // Adding the cardPanel on "jp2"
        cardPanel.add(jp2, "2");
        card.show(cardPanel, "2");

        // Adding the cardPanel on "jp3"
        cardPanel.add(jp3, "3");
        card.show(cardPanel, "3");

        // Adding the cardPanel on "jp4"
        cardPanel.add(jp4, "4");
        card.show(cardPanel, "4");

        // Adding the cardPanel on "jp5"
        cardPanel.add(jp5, "5");
        card.show(cardPanel, "5");

        // Adding the cardPanel on "jp6"
        cardPanel.add(jp6, "6");
        card.show(cardPanel, "6");

        // Adding the cardPanel on "jp7"
        cardPanel.add(jp7, "7");
        card.show(cardPanel, "7");

        // ++++++++++++++++++++++Right Panel Area+++++++++++++++++++++++++++++++
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(c3);
        rightPanel.setPreferredSize(new Dimension(180, 0));
        rightPanel.setLayout(new FlowLayout());

        // ++++++++++++++++++++++Right Panel Area+++++++++++++++++++++++++++++++
        JPanel topPanel = new JPanel();
        topPanel.setBackground(c1);
        topPanel.setPreferredSize(new Dimension(100, 50));
        topPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("==> Please selecting");
        label.setFont(new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 16));
        topPanel.add(label);

        JLabel label1 = new JLabel("       your options....");
        label1.setFont(new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 16));
        topPanel.add(label1);

        // ++++++++++++++++++++++JButton Area+++++++++++++++++++++++++++++++
        // Creating Object of "JPanel" class
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(c3);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setLayout(new GridLayout(10, 0, 0, 8));

        // Initialization of object
        // "Button1" of JButton class.
        JButton btn1 = new JButton("Arithmetic & Trigonometry");

        // Initialization of object
        // "Button2" of JButton class.
        JButton btn2 = new JButton("Bitwise");

        // Initialization of object
        // "Button3" of JButton class.
        JButton btn3 = new JButton("Binary Arithmetic");

        // Initialization of object
        // "Button4" of JButton class.
        JButton btn4 = new JButton("Money Exchange");

        // Initialization of object
        // "Button5" of JButton class.
        // JButton btn5 = new JButton("Trigonometry");

        // Initialization of object
        // "Button6" of JButton class.
        JButton btn6 = new JButton("Storage Converter");

        // Initialization of object
        // "Button7" of JButton class.
        JButton btn7 = new JButton("Number System Conversion");

        // BAck button
        JButton backBtn = new JButton("Back");

        // Set font to button1
        btn1.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button2
        btn2.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button3
        btn3.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button4
        btn4.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button5
        // btn5.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button6
        btn6.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to button7
        btn7.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // Set font to back button
        backBtn.setFont(new Font("Andale Mono", Font.BOLD, 12));

        // create object via another class
        Arithmetic arithmetic = new Arithmetic();
        Bitwise bitwise = new Bitwise();
        BinaryArithmetic binaryArithmeric = new BinaryArithmetic();
        MoneyExchange moneyExchange = new MoneyExchange();
        StorageConverter storageConverter = new StorageConverter();
        NumberSystemConversion numberSystemConversion = new NumberSystemConversion();

        // adding object to panel
        jp1.add(arithmetic);
        jp2.add(bitwise);
        jp3.add(binaryArithmeric);
        jp4.add(moneyExchange);
        jp6.add(storageConverter);
        jp7.add(numberSystemConversion);

        // Add rounded to button

        btn1.setBorder(BorderFactory.createCompoundBorder(one, two));
        btn2.setBorder(BorderFactory.createCompoundBorder(one, two));
        btn3.setBorder(BorderFactory.createCompoundBorder(one, two));
        btn4.setBorder(BorderFactory.createCompoundBorder(one, two));
        // btn5.setBorder(BorderFactory.createCompoundBorder(one, two));
        btn6.setBorder(BorderFactory.createCompoundBorder(one, two));
        btn7.setBorder(BorderFactory.createCompoundBorder(one, two));
        // backBtn.setBorder(new RoundBtn(5));

        btn1.setBackground(c1);
        btn2.setBackground(c1);
        btn3.setBackground(c1);
        btn4.setBackground(c1);
        // btn5.setBackground(c2);
        btn6.setBackground(c1);
        btn7.setBackground(c1);
        backBtn.setBackground(c1);

        // ++++++++++++++++++++++Button Panel Area+++++++++++++++++++++++++++++++
        // Adding text label to panel
        buttonPanel.add(label);
        buttonPanel.add(label1);

        // Adding JButton "Arithmetic" on JFrame.
        buttonPanel.add(btn1);

        // Adding JButton "Bitwise" on JFrame.
        buttonPanel.add(btn2);

        // Adding JButton "Binary Arithmetic" on JFrame.
        buttonPanel.add(btn3);

        // Adding JButton "Money Exchange" on JFrame.
        buttonPanel.add(btn4);

        // Adding JButton "Trigonometry" on JFrame.
        // buttonPanel.add(btn5);

        // Adding JButton "Storage Converter" on JFrame.
        buttonPanel.add(btn6);

        // Adding JButton "Number System Conversion" on JFrame.
        buttonPanel.add(btn7);

        // Adding JButton "Back Button" on JFrame.
        // buttonPanel.add(backBtn);

        // // add button panel to right panel
        // rightPanel.add(label);
        // rightPanel.add(label1);

        // add button panel to right panel
        rightPanel.add(buttonPanel);

        // add Arithmetic Button in ActionListener
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "1");

            }
        });

        // add Bitwise Button in ActionListener
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "2");

            }
        });

        // add Binary Arithmetic Button in ActionListener
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "3");
            }
        });

        // add Money Exchange in ActionListener
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "4");
            }
        });

        // add Trigonometry button in ActionListener
        // btn5.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent arg0) {
        // card.show(cardPanel, "5");
        // }
        // });

        // add Storage Exchange button in ActionListener
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "6");
            }
        });

        // add Number System Conversion button in ActionListener
        // add Storage Exchange button in ActionListener
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                card.show(cardPanel, "7");

            }
        });

        // // add back button in ActionListener
        // backBtn.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent arg0) {

        // hh g1 = new hh();
        // g1.show1();

        // }
        // });

        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setSize(700, 500);

        // used to get content pane
        this.add(rightPanel, BorderLayout.NORTH);

        // used to get content pane
        this.add(cardPanel, BorderLayout.CENTER);

    }
}