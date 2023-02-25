package com.company;
// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        show1();
    }

    public static void show1() {

        JFrame frame = new JFrame("ITE Calculator");
        frame.setSize(700, 500);
        frame.setLocation(700, 100);
        frame.setLayout(new FlowLayout());

        // RGB color
        Color c1 = new Color(228, 228, 228);
        Color c2 = new Color(235, 237, 238);

        Border one = BorderFactory.createEtchedBorder();
        Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, c2);

        // Create object of GuiCalculator class
        // GuiCalculator g1 = new GuiCalculator();

        // Rounded corner class
        class RoundBtn implements Border {
            private int r;

            RoundBtn(int r) {
                this.r = r;
            }

            public Insets getBorderInsets(Component c) {
                return new Insets(this.r + 1, this.r + 1, this.r + 2, this.r);
            }

            public boolean isBorderOpaque() {
                return true;
            }

            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.drawRoundRect(x, y, width - 1, height - 1, r, r);
            }

        }

        // Create JPanel
        JPanel mainWindow = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel centerPanel1 = new JPanel();
        JPanel centerPanel2 = new JPanel();
        JPanel buttomPanel = new JPanel();

        // Create JLabel
        JLabel label = new JLabel("Welcome to ITE Calculator");
        JLabel label1 = new JLabel("There are some methods to caculate: ");
        JLabel label2 = new JLabel("Arithmetic, bitwise, binary Arithmetic");
        JLabel label3 = new JLabel("Money exchange, Storage Convertor");
        JLabel label4 = new JLabel("Trigonometry, Number system Conversion..");
        JLabel h1 = new JLabel("Please pressing the start button !");
        JLabel h2 = new JLabel("to continue");
        JLabel h3 = new JLabel("the progam :)");

        // Create JButton
        JButton button = new JButton("   Start   ");
        button.setBackground(c1);

        // set Bounds to button
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBorder(BorderFactory.createCompoundBorder(one, two));
        button.setBorder(new RoundBtn(4));
        button.setBackground(c1);

        // Set Layout to panel
        // centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setLayout(new GridLayout(2, 0, 0, 0));
        centerPanel1.setLayout(new FlowLayout());
        centerPanel2.setLayout(new FlowLayout());
        buttomPanel.setLayout(new FlowLayout());

        // Set PreferredSize to panel
        mainWindow.setPreferredSize(new Dimension(700, 500));
        topPanel.setPreferredSize(new Dimension(600, 80));
        centerPanel.setPreferredSize(new Dimension(450, 300));
        centerPanel1.setPreferredSize(new Dimension(300, 150));
        centerPanel2.setPreferredSize(new Dimension(300, 150));
        buttomPanel.setPreferredSize(new Dimension(600, 50));

        centerPanel.setBorder(BorderFactory.createCompoundBorder(one, two));
        centerPanel.setBorder(new RoundBtn(10));
        centerPanel.setBackground(c1);
        centerPanel1.setBackground(c1);
        centerPanel2.setBackground(c1);
        topPanel.setBackground(c1);
        buttomPanel.setBackground(c1);
        mainWindow.setBackground(c1);

        // Set Font to label
        label.setFont(new Font("Arial", Font.BOLD, 34));
        label1.setFont(new Font("Arial", Font.BOLD, 23));
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setFont(new Font("Arial", Font.BOLD, 15));
        h1.setFont(new Font("Arial", Font.BOLD, 23));
        h2.setFont(new Font("Arial", Font.BOLD, 15));
        h3.setFont(new Font("Arial", Font.BOLD, 15));

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Menu g2 = new Menu();
                g2.show();

            }

        });

        // add right center panel
        centerPanel1.add(label1);
        centerPanel1.add(label2);
        centerPanel1.add(label3);
        centerPanel1.add(label4);

        // add left center panel
        centerPanel2.add(h1);
        centerPanel2.add(h2);
        centerPanel2.add(h3);

        topPanel.add(label);
        centerPanel.add(centerPanel1);
        centerPanel.add(centerPanel2);
        buttomPanel.add(button);

        mainWindow.add(topPanel, BorderLayout.PAGE_START);
        mainWindow.add(centerPanel, BorderLayout.PAGE_START);
        mainWindow.add(buttomPanel, BorderLayout.PAGE_END);

        frame.add(mainWindow);
        frame.getContentPane().setBackground(c1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
